package io.articulus.fhir.generator

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.WildcardTypeName.Companion.producerOf
import java.io.File
import java.util.Locale

class FhirStructureDefinitionRenderer(private val spec: FhirSpec) {

    private val log by logger()

    private fun FhirClass.isResource(): Boolean {
        return this.superClass?.name == "Resource" || this.superClass?.isResource() == true
    }

    private fun FhirClass.isQuantity(): Boolean {
        return this.superClass?.name == "Quantity" || this.superClass?.isQuantity() == true
    }

    fun render() {
        val resourcesSubClasses = mutableListOf<FhirClass>()
        val quantitySubClasses = mutableListOf<FhirClass>()

        renderManualValueClasses()
        renderManualClasses()
        renderManualInterfaces()

        val allClasses = spec.writeableProfile().flatMap { it.writeableClasses() }
        val superClasses = allClasses.filter { c -> allClasses.any { it.superClass == c } }
        val undeclaredSuperClasses = allClasses.mapNotNull { c -> c.superClass }.filter { c -> !allClasses.contains(c) }
        val packages = spec.writeableProfile().flatMap { p ->
            p.writeableClasses().map { c -> c.name to spec.packageName + "." + p.targetName.lowercase() }
        }.toMap() +
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

            undeclaredSuperClasses.filter { c -> !Settings.natives.contains(c.name) && !Settings.blackList.contains(c.name) }
                .forEach { c ->
                    val packageName = packages[c.name] ?: spec.packageName
                    val out = FileSpec.builder(packageName, c.name)
                    out.addFileComment(header)
                    val classBody = buildInterface(c, packages, spec.makeReadonlyProperties)
                    out.addType(classBody)
                    log.debug("Building interface {}", c.name)
                    val dir = spec.info.directory
                    out.build().writeTo(File(dir))
                }

            classes.filter { c -> !Settings.natives.contains(c.name) && !Settings.blackList.contains(c.name) }
                .forEach { c ->
                    val packageName = packages[c.name] ?: spec.packageName
                    val out = FileSpec.builder(packageName, c.name)
                    out.addFileComment(header)
                    val classBody = if (superClasses.contains(c)) {
                        buildInterface(
                            c,
                            packages,
                            spec.makeReadonlyProperties
                        ).also {
                            if (Settings.forcedImplementedInterfaces.contains(c.name)) {
                                val extra = FileSpec.builder("$packageName.${c.name.lowercase(Locale.getDefault())}", c.name)
                                extra.addFileComment(header)
                                extra.addType(buildClass(c.copy(superClass = c, properties = mutableMapOf()), packages, spec.topLevelClasses))
                                log.debug("Building class {}", c.name)
                                val dir = spec.info.directory
                                extra.build().writeTo(File(dir))
                            }
                        }
                    } else {
                        kmpOnly {
                            if (c.isResource()) {
                                resourcesSubClasses.add(c)
                            }

                            if (c.isQuantity()) {
                                quantitySubClasses.add(c)
                            }
                        }

                        buildClass(c, packages, spec.topLevelClasses)
                    }

                    out.addType(classBody)
                    log.debug("Building class {}", c.name)
                    val dir = spec.info.directory
                    out.build().writeTo(File(dir))
                }
        }

        kmpOnly {
            renderSerializationModule(
                resourcesSubClasses.sortedBy { klass -> klass.name },
                quantitySubClasses.sortedBy { klass -> klass.name }
            )
        }
    }

    private fun renderSerializationModule(
        resourcesClasses: List<FhirClass>,
        quantitySubClasses: List<FhirClass>
    ) {
        val name = "SerializationModule"
        val resourcesClassName = ClassName("${Constants.getBasePackageName()}.${Settings.modelVersion}", "Resource")
        val quantityClassName = ClassName("${Constants.getBasePackageName()}.${Settings.modelVersion}", "Quantity")
        val genericQuantityClassName = ClassName("${Constants.getBasePackageName()}.${Settings.modelVersion}.quantity", "Quantity")
        val outResourceClassName = producerOf(resourcesClassName)

        val quantitySerializer = TypeSpec.objectBuilder("QuantitySerializer")
            .addSuperinterface(ClassName("kotlinx.serialization", "KSerializer").parameterizedBy(quantityClassName))
            .addProperty(
                PropertySpec.builder("descriptor", ClassName("kotlinx.serialization.descriptors", "SerialDescriptor"))
                    .addModifiers(KModifier.OVERRIDE)
                    .initializer(
                        CodeBlock.builder()
                            .addStatement("%T.serializer().descriptor", genericQuantityClassName)
                            .build()
                    )
                    .build()
            )
            .addFunction(
                FunSpec.builder("deserialize")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameter("decoder", ClassName("kotlinx.serialization.encoding", "Decoder"))
                    .returns(quantityClassName)
                    .addStatement("return decoder.decodeSerializableValue(%T.serializer())", genericQuantityClassName)
                    .build()
            )
            .addFunction(
                FunSpec.builder("serialize")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameter(
                        "encoder",
                        ClassName("kotlinx.serialization.encoding", "Encoder")
                    )
                    .addParameter(
                        "value",
                        quantityClassName
                    )
                    .returns(UNIT)
                    .beginControlFlow("return when (value) {")
                    .apply {
                        quantitySubClasses.forEach { cls ->
                            addStatement("is %T -> %T.serializer().serialize(encoder, value)", ClassName("${spec.packageName}.${cls.name.lowercase()}", cls.name), ClassName("${spec.packageName}.${cls.name.lowercase()}", cls.name))
                        }
                        addStatement("is %T -> %T.serializer().serialize(encoder, value)", genericQuantityClassName, genericQuantityClassName)
                        addStatement("else -> error(\"Unknown Quantity type: \$value\")")
                    }
                    .endControlFlow()
                    .build()
            )
            .build()


        val resourceSerializer = TypeSpec.objectBuilder("ResourceSerializer")
            .superclass(ClassName("io.icure.fhir.mapping.domain.fhir", "CustomJsonPolymorphicSerializer").parameterizedBy(ClassName("${Constants.getBasePackageName()}.${Settings.modelVersion}", "Resource")))
            .addSuperclassConstructorParameter("%S, %S", "resourceType", "Resource")
            .addFunction(
                FunSpec.builder("getSerializerBySerialName")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameter("serialName", STRING)
                    .returns(ClassName("kotlinx.serialization", "KSerializer").isNullable(true).parameterizedBy(outResourceClassName))
                    .beginControlFlow("return when (serialName) {")
                    .apply {
                        resourcesClasses.forEach { cls ->
                            addStatement("\"${cls.name}\" -> %T.serializer()", ClassName("${spec.packageName}.${cls.name.lowercase()}", cls.name))
                        }
                        addStatement("else -> error(\"Unknown Resource type: \$serialName\")")
                    }
                    .endControlFlow()
                    .build()
            )
            .addFunction(
                FunSpec.builder("getSerializerByClass")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameter(
                        "kclass",
                        ClassName("kotlin.reflect", "KClass")
                            .isNullable(true)
                            .parameterizedBy(outResourceClassName)
                    )
                    .returns(ClassName("kotlinx.serialization", "KSerializer").isNullable(true).parameterizedBy(outResourceClassName))
                    .beginControlFlow("return when (kclass) {")
                    .apply {
                        resourcesClasses.forEach { cls ->
                            addStatement("%T::class -> %T.serializer()", ClassName("${spec.packageName}.${cls.name.lowercase()}", cls.name), ClassName("${spec.packageName}.${cls.name.lowercase()}", cls.name))
                        }
                        addStatement("else -> error(\"Unknown resource type: \$kclass\")")
                    }
                    .endControlFlow()
                    .build()
            )
            .build()

        val out = FileSpec.builder(spec.packageName, name)
        out.addType(quantitySerializer)
        out.addType(resourceSerializer)
        out.build().writeTo(File(Settings.destinationSrcDir))
    }

    private fun renderManualClasses() {
        Settings.manualClasses.forEach { (name, props) ->
            val out = FileSpec.builder(spec.packageName, name)
            val classBuilder = TypeSpec.classBuilder(name).addModifiers(KModifier.OPEN)

            props.forEach { (propName, typeInfo) ->
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

    private fun renderManualValueClasses() {
        Settings.manualValueClasses.forEach { (name, property) ->
            val packageName = spec.packageName + ".${name.lowercase()}"
            val out = FileSpec.builder(packageName, name)
            val classBuilder = TypeSpec.classBuilder(name).addModifiers(KModifier.VALUE)

            val (propName, typeInfo) = property
            val className = ClassName(packageName, typeInfo.first)
            val propBuilder = PropertySpec.builder(propName, className)
            if (typeInfo.second.isNotBlank()) {
                propBuilder.initializer(typeInfo.second)
            }

            jvmOnly {
                classBuilder.addAnnotation(ClassName("kotlin.jvm", "JvmInline"))
                classBuilder.addAnnotation(
                    AnnotationSpec.builder(
                        ClassName(
                            "com.fasterxml.jackson.databind.annotation",
                            "JsonDeserialize"
                        )
                    ).addMember("using = %T.None::class", ClassName("com.fasterxml.jackson.databind", "JsonDeserializer"))
                        .build()
                )
            }

            classBuilder.addAnnotation(
                AnnotationSpec.builder(ClassName("kotlinx.serialization", "Serializable"))
                    .build()
            )

            classBuilder.addProperty(propBuilder.build())

            classBuilder.primaryConstructor(
                FunSpec.constructorBuilder().addParameter(
                    ParameterSpec.builder(propName, className).build()
                ).build()
            )

            out.addType(classBuilder.build())
            out.build().writeTo(File(Settings.destinationSrcDir))
        }
    }

    private fun renderManualInterfaces() {
        Settings.manualInterfaces.forEach {
            val out = FileSpec.builder(it.fullPackageName(spec.packageName), it.name)
            val classBuilder = TypeSpec.interfaceBuilder(it.name)

            out.addType(classBuilder.build())
            out.build().writeTo(File(Settings.destinationSrcDir))
        }
    }

    private fun TypeSpec.Builder.addAdditionalInterfaces(className: String): TypeSpec.Builder {
        if (Settings.extraSuperInterfaces.containsKey(className)) {
            this.addSuperinterfaces(
                Settings.extraSuperInterfaces[className]!!.map { extraInterface ->
                    extraInterface.className(spec.packageName)
                }
            )
        }
        return this
    }

    private fun buildInterface(
        cls: FhirClass,
        packages: Map<String, String> = mapOf(),
        makeReadonlyProperties: Boolean = true
    ): TypeSpec {
        val classBuilder = TypeSpec.interfaceBuilder(cls.name)

        classBuilder.addAdditionalInterfaces(cls.name)

        classBuilder.addKdoc("%L\n\n%L\n", cls.short, cls.formal)

        cls.properties.toSortedMap().forEach { (_, prop) ->
            classBuilder.addProperty(makeProperty(prop, packages, true, false))
        }

        kmpOnly {
            if (cls.name == "Resource" || cls.name == "Quantity") {
                classBuilder.addAnnotation(
                    AnnotationSpec.builder(ClassName("kotlinx.serialization", "Serializable"))
                        .addMember(
                            "with = %T::class",
                            when (cls.name) {
                                "Resource" -> ClassName(spec.packageName, "ResourceSerializer")
                                "Quantity" -> ClassName(spec.packageName, "QuantitySerializer")
                                else -> throw IllegalStateException("Unknown class name: ${cls.name}")
                            }
                        )
                        .build()
                )
            }
        }

        cls.superClass?.let {
            classBuilder.addSuperinterface(
                ClassName(
                    packages[it.name] ?: spec.packageName,
                    it.name
                )
            )
        }

        return classBuilder.build()
    }

    private fun buildClass(
        cls: FhirClass,
        packages: Map<String, String> = emptyMap(),
        topLevelClasses: List<String> = emptyList(),
        extraInterfaces: List<ClassName> = emptyList()
    ): TypeSpec {
        val classBuilder = TypeSpec.classBuilder(cls.name).addModifiers(KModifier.DATA)

        classBuilder.addAdditionalInterfaces(cls.name)

        kmpOnly {
            classBuilder.addAnnotation(
                AnnotationSpec.builder(ClassName("kotlinx.serialization", "SerialName"))
                    .addMember("\"${cls.name}\"")
                    .build()
            )
        }

        val hierarchy = mutableListOf(cls)
        var marker = cls
        while (marker.superClass != null) {
            hierarchy.add(0, marker.superClass!!)
            marker = marker.superClass!!
        }
        val primaryCtor = FunSpec.constructorBuilder()
        val isTopLevel = topLevelClasses.contains(cls.name)

        val properties = hierarchy.flatMap { it.properties.entries.map { it.key to it.value } }

        properties.forEach { (_, prop) ->
            val forceNotNull = if (isTopLevel) Settings.topLevelNotNulls.contains(prop.name) else false
            primaryCtor.addParameter(makePropertyParameter(prop, packages, forceNotNull = forceNotNull))
            val overriden = hierarchy.filterIndexed { idx, _ -> idx < hierarchy.size - 1 }
                .any { it.properties.any { (_, it) -> it.name == prop.name } }
            classBuilder.addProperty(
                makeProperty(
                    prop,
                    packages,
                    false,
                    jsonName = if (isTopLevel) Settings.topLevelMappings[prop.name] else null,
                    forceNotNull = forceNotNull,
                    isInConstructor = true,
                    isOverriden = overriden
                )
            )
        }

        cls.superClass?.let {
            classBuilder.addSuperinterface(
                ClassName(
                    packages[it.name] ?: spec.packageName,
                    it.name
                )
            )
        }

        extraInterfaces.forEach {
            classBuilder.addSuperinterface(it)
        }

        classBuilder.addAnnotation(
            AnnotationSpec.builder(ClassName("kotlinx.serialization", "Serializable"))
                .build()
        )

        jvmOnly {
            classBuilder.addAnnotation(
                AnnotationSpec.builder(ClassName("com.fasterxml.jackson.annotation", "JsonInclude"))
                    .addMember("JsonInclude.Include.NON_NULL").build()
            )
            classBuilder.addAnnotation(
                AnnotationSpec.builder(
                    ClassName(
                        "com.fasterxml.jackson.annotation",
                        "JsonIgnoreProperties"
                    )
                ).addMember("ignoreUnknown = true").build()
            )
            classBuilder.addAnnotation(
                AnnotationSpec.builder(
                    ClassName(
                        "com.fasterxml.jackson.databind.annotation",
                        "JsonDeserialize"
                    )
                ).addMember("using = %T.None::class", ClassName("com.fasterxml.jackson.databind", "JsonDeserializer"))
                    .build()
            )
            classBuilder.addAnnotation(
                AnnotationSpec.builder(
                    ClassName(
                        "com.fasterxml.jackson.annotation",
                        "JsonPropertyOrder"
                    )
                ).also {
                    properties.forEach { (propName, _) -> it.addMember("%S", propName) }
                }.build()
            )
        }

        classBuilder.addKdoc("%L\n\n%L\n", cls.short, cls.formal)
        classBuilder.primaryConstructor(primaryCtor.build())

        return classBuilder.build()
    }

    private fun makePropertyParameter(
        prop: FhirClassProperty,
        packages: Map<String, String> = mapOf(),
        forceNotNull: Boolean = false
    ): ParameterSpec {
        val (mappedTypeName, typeClassName) = mappedTypes(prop, packages)

        val propName = Settings.reservedMap[prop.origName] ?: prop.origName // todo origName?

        return if (prop.isList()) {
            val arrayList = ClassName("kotlin.collections", "List")
            val listOfProps = arrayList.parameterizedBy(typeClassName)
            val parameterSpec = ParameterSpec.builder(propName, listOfProps).defaultValue(CodeBlock.of("emptyList()"))

            parameterSpec.build()
        } else {
            val isNullable = (prop.min == 0 || prop.oneOfMany?.let { propName.startsWith(it) } == true) && !forceNotNull
            val parameterSpec =
                ParameterSpec.builder(propName, typeClassName.isNullable(isNullable))

            if (isNullable) {
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
        val mappedTypeName = Settings.classMap[prop.typeName.lowercase()] ?: prop.typeName
        val typeClassName = ClassName(packages[mappedTypeName] ?: spec.packageName, mappedTypeName)

        return Pair(mappedTypeName, typeClassName)
    }

    private fun makeProperty(
        prop: FhirClassProperty,
        packages: Map<String, String> = mapOf(),
        isInterface: Boolean,
        isInConstructor: Boolean,
        isOverriden: Boolean = false,
        jsonName: String? = null,
        forceNotNull: Boolean = false
    ): PropertySpec {
        val (mappedTypeName, typeClassName) = mappedTypes(prop, packages)

        val propName = Settings.reservedMap[prop.origName] ?: prop.origName // todo origName?

        return if (prop.isList()) {
            val arrayList = ClassName("kotlin.collections", "List")
            val listOfProps = arrayList.parameterizedBy(typeClassName)
            PropertySpec.builder(propName, listOfProps).let {
                if (!isInterface && Settings.target == Settings.GenerationTarget.JVM) {
                    it.addAnnotation(
                        AnnotationSpec.builder(
                            ClassName(
                                "com.fasterxml.jackson.dataformat.xml.annotation",
                                "JacksonXmlElementWrapper"
                            )
                        )
                            .useSiteTarget(AnnotationSpec.UseSiteTarget.FIELD)
                            .addMember("useWrapping = false").build()
                    )
                } else it
            }.let {
                if (isInConstructor) it.initializer(propName) else if (isInterface) it else it.initializer(
                    CodeBlock.of(
                        "emptyList()"
                    )
                )
            }
        } else {
            val isNullable = (prop.min == 0 || prop.oneOfMany?.let { propName.startsWith(it) } == true) && !forceNotNull
            PropertySpec.builder(propName, typeClassName.isNullable(isNullable))
                .addKdoc("%L\n", prop.shortDesc).let {
                if (isInConstructor) it.initializer(propName) else if (isInterface) it else {
                    if (isNullable) {
                        it.initializer("null")
                    } else if (prop.min == 1) {
                        if (Settings.defaultValues.contains(mappedTypeName)) {
                            it.initializer(Settings.defaultValues[mappedTypeName]!!)
                        } else it
                    } else it
                }
            }
        }.let { if (isInterface) it else addSerializedNameAnnotation(propName, jsonName ?: prop.origName, it) }.let {
            if (isOverriden) it.addModifiers(KModifier.OVERRIDE) else it
        }.build()
    }

    private fun addSerializedNameAnnotation(
        propName: String,
        origName: String,
        propertySpec: PropertySpec.Builder
    ): PropertySpec.Builder {
        return if (propName != origName) {
            val foo = when (Settings.target) {
                Settings.GenerationTarget.JVM -> {
                    ClassName("com.fasterxml.jackson.annotation", "JsonProperty")
                }
                Settings.GenerationTarget.KMP -> {
                    ClassName("kotlinx.serialization.json", "JsonNames")
                }
            }

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
