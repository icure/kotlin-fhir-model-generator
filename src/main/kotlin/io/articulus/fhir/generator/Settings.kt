package io.articulus.fhir.generator

object Settings {
        val topLevelClasses: List<String> = listOf("Patient","Encounter","EpisodeOfCare","CareTeam","Device","Organization","HealthcareService","Practitioner","AllergyIntolerance","AdverseEvent","Condition","Procedure")
        val topLevelMappings: Map<String,String> = mapOf("id" to "_id")
        val topLevelNotNulls: List<String> = listOf("id")

        /**
         * http://hl7.org/fhir is the latest release. To generate other versions go to
         * http://hl7.org/fhir/directory.html and select which version to use.
         */
        const val baseUrl = "http://hl7.org/fhir/"
        const val modelVersion = "r4"

        val downloadFiles = (System.getenv("downloadFiles") ?: "true").equals("true", true)

        const val downloadDir = "./download"
        private const val destinationBaseDir = "."
        var destinationSrcDir = "$destinationBaseDir/src/main/kotlin"
        var destinationTestDir = "$destinationBaseDir/src/test/kotlin"
        var samplesDir = "$destinationBaseDir/src/test/resources/model/sample_data/$modelVersion"

        val reservedMap = mapOf(
                "for" to "for_fhir",
                "from" to "from_fhir",
                "class" to "class_fhir",
                "import" to "import_fhir",
                "global" to "global_fhir",
                "assert" to "assert_fhir",
                "when" to "when_fhir",
                "package" to "package_fhir"
        )

        val  classMap = mapOf(
                "Any" to "Resource",
                "Practitioner.role" to "PractRole",  // to avoid Practitioner.role and PractitionerRole generating the same class
                "bool" to "Boolean",
                "integer" to "Int",
                "positiveint" to "Int",
                "unsignedint" to "Int",
                "date" to "String",
                "datetime" to "String",
                "instant" to "String",
                "time" to "String",
                "decimal" to "Float",
                "markdown" to "String",
                "id" to "String",
                "code" to "String",
                "uri" to "String",
                "url" to "String",
                "canonical" to "String",
                "oid" to "String",
                "uuid" to "String",
                "xhtml" to "String",
                "base64binary" to "String",
                "http://hl7.org/fhirpath/system.string" to "String"
        )


        val primitives = listOf(
                "String",
                "Int",
                "Boolean",
                "Float",
                "FhirDate"
        )

        val enumNameMap = mapOf(
                "httpto//hl7.org/fhir/contracttermsubtypecodes" to "ContractTermSubtypeCodes",
                "httpto//hl7.org/fhir/coverage-exception" to "CoverageExceptionCodes",
                "httpto//hl7.org/fhir/resource-type-link" to "ResourceTypeLink"
        )

        val jsonmap = mapOf(
                "str" to "String",
                "int" to "Int",
                "bool" to "Boolean",
                "float" to "Float"
        )

        const val jsonMapDefault = "dict"

        // Which class names are native to the language (or can be treated this way)
        val natives = listOf("Int", "Float", "Boolean", "String", "List",
                "LocalDateTime", "FhirDate")

        val defaultValues = mapOf(
                "String" to """""""",
                "Boolean" to "false",
                "Int" to "0",
                "Float" to "0.0f",
                "LocalDate" to "LocalDate.now()",
                "LocalDateTime" to "LocalDateTime.now()",
                "FhirDate" to "FhirDate.now()"
        )

        val manualClasses = mapOf(
                "FhirAbstractResource" to mapOf(
                        "resourceType" to Pair("String?", "null")
                )
        )
}

