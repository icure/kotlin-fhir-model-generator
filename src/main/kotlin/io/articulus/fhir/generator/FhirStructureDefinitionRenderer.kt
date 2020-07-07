package io.articulus.fhir.generator

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.asTypeName
import java.io.File
import java.time.LocalDateTime.now

class FhirStructureDefinitionRenderer(val spec: FhirSpec) {

    val log by logger()

    fun render() {
        renderManualClasses()

        val allClasses = spec.writeableProfile().flatMap { it.writeableClasses() }
        val superClasses = allClasses.filter { c -> allClasses.any { it.superClass == c } }
        val packages = spec.writeableProfile().flatMap { p -> p.writeableClasses().map { c -> c.name to spec.packageName+"."+p.targetName.toLowerCase() } }.toMap() +
                Settings.primitives.map { it to "" } +
                mapOf(
                        "Resource" to spec.packageName,
                        "DomainResource" to spec.packageName,
                        "Meta" to spec.packageName
                )

        spec.writeableProfile().forEach { profile ->
            val classes = profile.writeableClasses()
            val data = hashMapOf(
                    "profile" to profile,
                    "info" to spec.info,
                    "classes" to classes
            )

            val header = buildHeader(data)

            classes.filter { c -> !Settings.natives.contains(c.name) }.forEach { c ->
                val out = FileSpec.builder(packages[c.name] ?: spec.packageName, c.name)
                out.addComment(header)

                val classBody = if (superClasses.contains(c)) buildInterface(c, packages) else buildClass(c, packages, spec.topLevelClasses)
                out.addType(classBody)
                log.debug("Building class {}", c.name)
                val dir = spec.info.directory

                out.build().writeTo(File(dir))
            }
        }
    }

    private fun renderManualClasses() {
        Settings.manualClasses.forEach { name, props ->
            val out = FileSpec.builder(spec.packageName, name)
            val classBuilder = TypeSpec.classBuilder(name).addModifiers(KModifier.OPEN)

            props.forEach { propName, typeInfo ->
                val className = ClassName(spec.packageName, typeInfo.first)
                val propBuilder = PropertySpec.builder(propName, className).mutable(true)
                if (typeInfo.second.isNotBlank()) {
                    propBuilder.initializer(typeInfo.second)
                }
                classBuilder.addProperty(propBuilder.build())
            }
            out.addType(classBuilder.build())
            out.build().writeTo(File(Settings.destinationSrcDir))
        }
    }

    private fun buildInterface(cls: FhirClass, packages: Map<String, String> = mapOf()): TypeSpec {
        val classBuilder = TypeSpec.interfaceBuilder(cls.name)

        classBuilder.addKdoc("%L\n\n%L\n", cls.short, cls.formal)

        cls.properties.toSortedMap().forEach { (_, prop) ->
            classBuilder.addProperty(makeProperty(prop, packages, true, false))
        }
        cls.superClass?.let {  classBuilder.addSuperinterface(ClassName(packages[it.name] ?: spec.packageName, it.name)) }

        return classBuilder.build()
    }

    private fun buildClass(cls: FhirClass, packages: Map<String, String> = mapOf(), topLevelClasses: List<String> = listOf()): TypeSpec {
        val classBuilder = TypeSpec.classBuilder(cls.name).addModifiers(KModifier.DATA)

        val hierarchy = mutableListOf(cls)
        var marker = cls
        while(marker.superClass != null) {
            hierarchy.add(0, marker.superClass!!)
            marker = marker.superClass!!
        }
        val primaryCtor = FunSpec.constructorBuilder()

        val ann = ClassName("com.fasterxml.jackson.annotation", "JsonProperty")

        val isTopLevel = topLevelClasses.contains(cls.name)
        if (isTopLevel) {
            primaryCtor.addParameter(ParameterSpec.builder("rev", String::class.asClassName().isNullable(true)).defaultValue("null").build())
            classBuilder.addProperty(PropertySpec.builder("rev", String::class.asClassName().isNullable(true)).initializer("rev").addAnnotation(AnnotationSpec.builder(ann).addMember("\"_rev\"").build()).build())

            val mapStringAttachment = Map::class.asClassName().parameterizedBy(String::class.asTypeName(), ClassName("org.ektorp", "Attachment")).asNullable()
            primaryCtor.addParameter(ParameterSpec.builder("attachments", mapStringAttachment).defaultValue("null").build())
            classBuilder.addProperty(PropertySpec.builder("attachments", mapStringAttachment).initializer("attachments").addAnnotation(AnnotationSpec.builder(ann).addMember("\"_attachments\"").build()).build())

            val listRevInfo = List::class.asClassName().parameterizedBy(ClassName("com.taktik.icure.entities.embed", "RevisionInfo")).asNullable()
            primaryCtor.addParameter(ParameterSpec.builder("revisionsInfo", listRevInfo).defaultValue("null").build())
            classBuilder.addProperty(PropertySpec.builder("revisionsInfo", listRevInfo).initializer("revisionsInfo").addAnnotation(AnnotationSpec.builder(ann).addMember("\"_revs_info\"").build()).build())

            val listString = List::class.asClassName().parameterizedBy(String::class.asTypeName()).asNullable()
            primaryCtor.addParameter(ParameterSpec.builder("conflicts", listString).defaultValue("null").build())
            classBuilder.addProperty(PropertySpec.builder("conflicts", listString).initializer("conflicts").addAnnotation(AnnotationSpec.builder(ann).addMember("\"_conflicts\"").build()).build())

            val mapStringString = Map::class.asClassName().parameterizedBy(String::class.asTypeName(), String::class.asTypeName()).asNullable()
            primaryCtor.addParameter(ParameterSpec.builder("revHistory", mapStringString).defaultValue("null").build())
            classBuilder.addProperty(PropertySpec.builder("revHistory", mapStringString).initializer("revHistory").addAnnotation(AnnotationSpec.builder(ann).addMember("\"rev_history\"").build()).build())
        }

        hierarchy.flatMap { it.properties.entries.map { it.key to it.value} }.toMap().toSortedMap().forEach { (_, prop) ->
            val forceNotNull = if (isTopLevel) Settings.topLevelNotNulls.contains(prop.name) else false
            primaryCtor.addParameter(makePropertyParameter(prop, packages, forceNotNull = forceNotNull))
            val overriden = hierarchy.filterIndexed { idx, _ -> idx < hierarchy.size - 1 }.any { it.properties.any { (_, it) -> it.name == prop.name } }
            classBuilder.addProperty(makeProperty(prop, packages, false, jsonName = if (isTopLevel) Settings.topLevelMappings[prop.name] else null, forceNotNull = forceNotNull, isInConstructor = true, isOverriden = overriden))
        }

        cls.superClass?.let { classBuilder.addSuperinterface(ClassName(packages[it.name] ?: spec.packageName, it.name)) }

        classBuilder.addKdoc("%L\n\n%L\n", cls.short, cls.formal)
        classBuilder.primaryConstructor(primaryCtor.build())

        return classBuilder.build()
    }


    private fun makePropertyParameter(prop: FhirClassProperty, packages: Map<String, String> = mapOf(), forceNotNull: Boolean = false): ParameterSpec {
        val mappedTypeName = Settings.classMap[prop.typeName.toLowerCase()] ?: prop.typeName
        val typeClassName = ClassName(packages[mappedTypeName] ?: spec.packageName, mappedTypeName)

        val propName = Settings.reservedMap[prop.origName] ?: prop.origName // todo origName?

        return if (prop.isList()) {
            val arrayList = ClassName("kotlin.collections", "List")
            val listOfProps = arrayList.parameterizedBy(typeClassName)
            val parameterSpec = ParameterSpec.builder(propName, listOfProps).defaultValue(CodeBlock.of("listOf<%T>()", typeClassName))

            parameterSpec.build()
        } else {
            val parameterSpec = ParameterSpec.builder(propName, typeClassName.isNullable(prop.min == 0 && !forceNotNull))

            if (prop.min == 0 && !forceNotNull) {
                parameterSpec.defaultValue("null")
            }

            if (prop.min == 1) {
                if (Settings.defaultValues.contains(mappedTypeName)) {
                    parameterSpec.defaultValue(Settings.defaultValues[mappedTypeName]!!)
                }
            }

            parameterSpec.addKdoc("%L\n", prop.shortDesc).build()
        }
    }

    private fun makeProperty(prop: FhirClassProperty, packages: Map<String, String> = mapOf(), isInterface: Boolean, isInConstructor: Boolean, isOverriden: Boolean = false, jsonName: String? = null, forceNotNull: Boolean = false): PropertySpec {
        val mappedTypeName = Settings.classMap[prop.typeName.toLowerCase()] ?: prop.typeName
        val typeClassName = ClassName(packages[mappedTypeName] ?: spec.packageName, mappedTypeName)

        val propName = Settings.reservedMap[prop.origName] ?: prop.origName // todo origName?

        return if (prop.isList()) {
            val arrayList = ClassName("kotlin.collections", "List")
            val listOfProps = arrayList.parameterizedBy(typeClassName)
            PropertySpec.builder(propName, listOfProps).let { if (isInConstructor) it.initializer(propName) else if (isInterface) it else it.initializer(CodeBlock.of("listOf<%T>()", typeClassName))}
        } else {
            PropertySpec.builder(propName, typeClassName.isNullable(prop.min == 0 && !forceNotNull)).addKdoc("%L\n", prop.shortDesc).let {
                if (isInConstructor) it.initializer(propName) else if (isInterface) it else {
                    if (prop.min == 0) {
                        it.initializer("null")
                    } else if (prop.min == 1) {
                        if (Settings.defaultValues.contains(mappedTypeName)) {
                            it.initializer(Settings.defaultValues[mappedTypeName]!!)
                        } else it
                    } else it
                }
            }
        }.let { if (isInterface) it else addSerializedNameAnnotation(propName, jsonName ?: prop.origName, it) }.let {
            if(isOverriden) it.addModifiers(KModifier.OVERRIDE) else it
        }.build()
    }

    private fun addSerializedNameAnnotation(propName: String, origName: String, propertySpec: PropertySpec.Builder): PropertySpec.Builder {
        return if (propName != origName) {
            val foo = ClassName("com.fasterxml.jackson.annotation", "JsonProperty")
            propertySpec.addAnnotation(
                    AnnotationSpec.builder(foo).addMember("\"${origName}\"")
                            .build()
            )
        } else propertySpec
    }

    private fun buildHeader(data: HashMap<String, Any>): String {
        return "\n Generated from FHIR Version ${(data["info"] as FhirVersionInfo).version} on ${now()} \n\n  ${now().year}, Articulus\n "
    }
}

fun ClassName.isNullable(nullable: Boolean): ClassName {
    return if (nullable) asNullable() else asNonNull()
}
