pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://maven.taktik.be/content/groups/public") }
        maven { url = uri("https://jitpack.io") }
    }
}

include(
    ":fhir-models",
    ":generator"
)

include(
    listOf(
        ":sdk-codegen:sdk-codegen",
        ":sdk-codegen:python-poet",
        ":sdk-codegen:ksp-json-processor",
    )
)

rootProject.name = "kotlin-fhir-model-generator"
