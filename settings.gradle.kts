import java.util.Properties

val localPropertiesFile = file("local.properties")
val properties = Properties()

if (localPropertiesFile.exists()) {
    localPropertiesFile.inputStream().use { properties.load(it) }
}

val githubUsername = properties.getProperty("githubUsername")
val githubPassword = properties.getProperty("githubPassword")

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
        maven {
            url = uri("https://maven.pkg.github.com/icure/charix")
            credentials {
                username = githubUsername
                password = githubPassword
            }
        }
    }
}

include(
    ":fhir-models",
    ":generator"
)

includeBuild("ksp-json-processor") {
    dependencySubstitution {
        substitute(module("com.icure:ksp-json-processor"))
            .using(project(":library"))
    }
}

rootProject.name = "kotlin-fhir-model-generator"
