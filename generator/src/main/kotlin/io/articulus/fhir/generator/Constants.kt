package io.articulus.fhir.generator

object Constants {
    private const val BASE_PACKAGE_NAME = "com.icure.fhir.mapping.domain.fhir"

    fun getBasePackageName(): String {
        return buildString {
            append(BASE_PACKAGE_NAME)
            jvmOnly {
                append(".xml")
            }
        }
    }

    fun getBasePackagePath(): String {
        return buildString {
            append("/")
            append(getBasePackageName().replace(".", "/"))
        }
    }
}
