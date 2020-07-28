package io.articulus.fhir.generator

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.asTypeName
import java.io.File

class FhirStructureDefinitionRenderer(val spec: FhirSpec) {

    val log by logger()

    fun render() {
        renderManualClasses()

        val allClasses = spec.writeableProfile().flatMap { it.writeableClasses() }
        val superClasses = allClasses.filter { c -> allClasses.any { it.superClass == c } }
        val packages = spec.writeableProfile().flatMap { p -> p.writeableClasses().map { c -> c.name to spec.packageName+"."+p.targetName.toLowerCase() } }.toMap() +
                Settings.primitives.map { it to "kotlin" } +
                mapOf(
                        "Resource" to spec.packageName,
                        "DomainResource" to spec.packageName,
                        "Element" to spec.packageName,
                        "Quantity" to spec.packageName,
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

            classes.filter { c -> !Settings.natives.contains(c.name) && !Settings.blackList.contains(c.name) }.forEach { c ->
                val packageName = packages[c.name] ?: spec.packageName
                val out = FileSpec.builder(packageName, c.name)
                out.addComment(header)
                val classBody = if (superClasses.contains(c)) buildInterface(c, packages) else buildClass(c, packages, spec.topLevelClasses)
                out.addType(classBody)
                log.debug("Building class {}", c.name)
                val dir = spec.info.directory
                out.build().writeTo(File(dir))

                if (spec.mappersPackageName != null && spec.dtosPackageName != null && !superClasses.contains(c)) {
                    val mapperOut = FileSpec.builder(packageName.replace(spec.packageName, spec.mappersPackageName), c.name + "Mapper")
                    out.addComment(header)
                    val mapperBody = buildMapper(c, packages, packageName, packageName.replace(spec.packageName, spec.dtosPackageName), spec.topLevelClasses, superClasses)
                    mapperOut.addType(mapperBody)
                    log.debug("Building mapper {}Mapper", c.name)
                    val dir = spec.info.directory
                    mapperOut.build().writeTo(File(dir))
                }
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
            classBuilder.addProperty(PropertySpec.builder("rev", String::class.asClassName().isNullable(true)).addModifiers(KModifier.OVERRIDE).initializer("rev").addAnnotation(AnnotationSpec.builder(ann).addMember("\"_rev\"").build()).build())

            primaryCtor.addParameter(ParameterSpec.builder("deletionDate", Long::class.asClassName().isNullable(true)).defaultValue("null").build())
            classBuilder.addProperty(PropertySpec.builder("deletionDate", Long::class.asClassName().isNullable(true)).addModifiers(KModifier.OVERRIDE).initializer("deletionDate").addAnnotation(AnnotationSpec.builder(ann).addMember("\"deleted\"").build()).build())

            val mapStringAttachment = Map::class.asClassName().parameterizedBy(String::class.asTypeName(), ClassName("org.ektorp", "Attachment")).isNullable(true)
            primaryCtor.addParameter(ParameterSpec.builder("attachments", mapStringAttachment).defaultValue("null").build())
            classBuilder.addProperty(PropertySpec.builder("attachments", mapStringAttachment).addModifiers(KModifier.OVERRIDE).initializer("attachments").addAnnotation(AnnotationSpec.builder(ann).addMember("\"_attachments\"").build()).build())

            val listRevInfo = List::class.asClassName().parameterizedBy(ClassName("org.taktik.icure.entities.embed", "RevisionInfo")).isNullable(true)
            primaryCtor.addParameter(ParameterSpec.builder("revisionsInfo", listRevInfo).defaultValue("null").build())
            classBuilder.addProperty(PropertySpec.builder("revisionsInfo", listRevInfo).addModifiers(KModifier.OVERRIDE).initializer("revisionsInfo").addAnnotation(AnnotationSpec.builder(ann).addMember("\"_revs_info\"").build()).build())

            val listString = List::class.asClassName().parameterizedBy(String::class.asTypeName()).isNullable(true)
            primaryCtor.addParameter(ParameterSpec.builder("conflicts", listString).defaultValue("null").build())
            classBuilder.addProperty(PropertySpec.builder("conflicts", listString).addModifiers(KModifier.OVERRIDE).initializer("conflicts").addAnnotation(AnnotationSpec.builder(ann).addMember("\"_conflicts\"").build()).build())

            val mapStringString = Map::class.asClassName().parameterizedBy(String::class.asTypeName(), String::class.asTypeName()).isNullable(true)
            primaryCtor.addParameter(ParameterSpec.builder("revHistory", mapStringString).defaultValue("null").build())
            classBuilder.addProperty(PropertySpec.builder("revHistory", mapStringString).addModifiers(KModifier.OVERRIDE).initializer("revHistory").addAnnotation(AnnotationSpec.builder(ann).addMember("\"rev_history\"").build()).build())

            classBuilder.addSuperinterface(ClassName("org.taktik.icure.entities.base", "StoredDocument"))

            classBuilder.addFunction(FunSpec.builder("withIdRev").addModifiers(KModifier.OVERRIDE).returns(ClassName(packages[cls.name] ?: spec.packageName, cls.name)).addParameter("id", String::class.asClassName().isNullable(true)).addParameter("rev", String::class.asClassName()).addStatement("return if (id != null) this.copy(id = id, rev = rev) else this.copy(rev = rev)").build())
            classBuilder.addFunction(FunSpec.builder("withDeletionDate").addModifiers(KModifier.OVERRIDE).returns(ClassName(packages[cls.name] ?: spec.packageName, cls.name)).addParameter("deletionDate", Long::class.asClassName().isNullable(true)).addStatement("return this.copy(deletionDate = deletionDate)").build())
        }

        hierarchy.flatMap { it.properties.entries.map { it.key to it.value} }.toMap().toSortedMap().forEach { (_, prop) ->
            val forceNotNull = if (isTopLevel) Settings.topLevelNotNulls.contains(prop.name) else false
            primaryCtor.addParameter(makePropertyParameter(prop, packages, forceNotNull = forceNotNull))
            val overriden = hierarchy.filterIndexed { idx, _ -> idx < hierarchy.size - 1 }.any { it.properties.any { (_, it) -> it.name == prop.name } }
            classBuilder.addProperty(makeProperty(prop, packages, false, jsonName = if (isTopLevel) Settings.topLevelMappings[prop.name] else null, forceNotNull = forceNotNull, isInConstructor = true, isOverriden = overriden))
        }

        cls.superClass?.let { classBuilder.addSuperinterface(ClassName(packages[it.name] ?: spec.packageName, it.name)) }
        classBuilder.addAnnotation(AnnotationSpec.builder(ClassName("com.fasterxml.jackson.annotation","JsonInclude")).addMember("JsonInclude.Include.NON_NULL").build())
        classBuilder.addAnnotation(AnnotationSpec.builder(ClassName("com.fasterxml.jackson.annotation","JsonIgnoreProperties")).addMember("ignoreUnknown = true").build())
        classBuilder.addAnnotation(AnnotationSpec.builder(ClassName("com.github.pozo","KotlinBuilder")).build())
        classBuilder.addKdoc("%L\n\n%L\n", cls.short, cls.formal)
        classBuilder.primaryConstructor(primaryCtor.build())

        return classBuilder.build()
    }

    private fun buildMapper(cls: FhirClass, packages: Map<String, String> = mapOf(), entityPackage: String, dtoPackage: String, topLevelClasses: List<String> = listOf(), superClasses: List<FhirClass>): TypeSpec {
        val hierarchy = mutableListOf(cls)
        var marker = cls
        while(marker.superClass != null) {
            hierarchy.add(0, marker.superClass!!)
            marker = marker.superClass!!
        }
        val isTopLevel = topLevelClasses.contains(cls.name)

        val types = hierarchy.flatMap { it.properties.values.mapNotNull { mappedTypes(it, packages).second.let {
            if (it.packageName.startsWith(spec.packageName) && it.simpleName != cls.name && !superClasses.any { sc -> sc.name == it.simpleName}) ClassName(it.packageName.replace(spec.packageName, spec.mappersPackageName!!), it.simpleName + "Mapper") else null
        } } }.toSortedSet()
        val classBuilder = TypeSpec.interfaceBuilder(cls.name + "Mapper").addAnnotation(
                AnnotationSpec.builder(ClassName("org.mapstruct","Mapper"))
                        .addMember("componentModel = %S", "spring")
                        .addMember("uses = [${types.map {"%T::class"}.joinToString(", ")}]", *types.toTypedArray())
                        .addMember("injectionStrategy = %M", MemberName(ClassName("org.mapstruct","InjectionStrategy"), "CONSTRUCTOR"))
                        .build())
                .addFunction(FunSpec.builder("map").addModifiers(KModifier.ABSTRACT).addParameter(cls.name.decapitalize(), ClassName(dtoPackage, cls.name)).let {
                    if(isTopLevel)
                        it.addAnnotation(
                                AnnotationSpec.builder(ClassName("org.mapstruct","Mappings"))
                                        .addMember("%L", AnnotationSpec.builder(ClassName("org.mapstruct","Mapping")).addMember("target = %S", "attachments").addMember("ignore = %L", true).build())
                                        .addMember("%L", AnnotationSpec.builder(ClassName("org.mapstruct","Mapping")).addMember("target = %S", "revHistory").addMember("ignore = %L", true).build())
                                        .addMember("%L", AnnotationSpec.builder(ClassName("org.mapstruct","Mapping")).addMember("target = %S", "conflicts").addMember("ignore = %L", true).build())
                                        .addMember("%L", AnnotationSpec.builder(ClassName("org.mapstruct","Mapping")).addMember("target = %S", "revisionsInfo").addMember("ignore = %L", true).build())
                                        .build()
                        )
                    else it
                }.returns(ClassName(entityPackage, cls.name)).build())
                .addFunction(FunSpec.builder("map").addModifiers(KModifier.ABSTRACT).addParameter(cls.name.decapitalize(), ClassName(entityPackage, cls.name)).returns(ClassName(dtoPackage, cls.name)).build())

        return classBuilder.build()
    }

    private fun makePropertyParameter(prop: FhirClassProperty, packages: Map<String, String> = mapOf(), forceNotNull: Boolean = false): ParameterSpec {
        val (mappedTypeName, typeClassName) = mappedTypes(prop, packages)

        val propName = Settings.reservedMap[prop.origName] ?: prop.origName // todo origName?

        return if (prop.isList()) {
            val arrayList = ClassName("kotlin.collections", "List")
            val listOfProps = arrayList.parameterizedBy(typeClassName)
            val parameterSpec = ParameterSpec.builder(propName, listOfProps).defaultValue(CodeBlock.of("listOf()"))

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

    private fun mappedTypes(prop: FhirClassProperty, packages: Map<String, String>): Pair<String, ClassName> {
        val mappedTypeName = Settings.classMap[prop.typeName.toLowerCase()] ?: prop.typeName
        val typeClassName = ClassName(packages[mappedTypeName] ?: spec.packageName, mappedTypeName)

        return Pair(mappedTypeName, typeClassName)
    }

    private fun makeProperty(prop: FhirClassProperty, packages: Map<String, String> = mapOf(), isInterface: Boolean, isInConstructor: Boolean, isOverriden: Boolean = false, jsonName: String? = null, forceNotNull: Boolean = false): PropertySpec {
        val (mappedTypeName, typeClassName) = mappedTypes(prop, packages)

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
        return "\n Generated from FHIR Version ${(data["info"] as FhirVersionInfo).version}\n"
    }
}

fun ClassName.isNullable(nullable: Boolean): ClassName {
    return copy(nullable = nullable) as ClassName
}

fun ParameterizedTypeName.isNullable(nullable: Boolean): ParameterizedTypeName {
    return copy(nullable = nullable) as ParameterizedTypeName
}
