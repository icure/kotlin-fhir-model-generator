import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform) apply true
    alias(libs.plugins.kotlinSerialization) apply true
    alias(libs.plugins.androidLibrary) apply true
    alias(libs.plugins.vanniktech.mavenPublish) apply true
    alias(libs.plugins.kotest.multiplatform)
    signing
}

val gitVersion: String? by project

group = "com.icure"
version = gitVersion ?: "1.0.0-RC.13"

kotlin {
    jvm()
    androidTarget {
        publishLibraryVariants("release")
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_1_8)
        }
    }
    iosSimulatorArm64()
    iosX64()
    iosArm64()
    linuxX64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(libs.org.jetbrains.kotlinx.kotlinx.serialization.json)
            }
            kotlin.srcDir("src/commonMain/kotlin")
        }

        val commonTest by getting {
            dependencies {
                implementation(libs.kotest.assertions.core)
                implementation(libs.kotest.framework.engine)
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
            kotlin.srcDir("src/commonTest/kotlin")
        }
    }
}

android {
    namespace = "org.jetbrains.kotlinx.multiplatform.library.template"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL, automaticRelease = true)

    if (projectHasSignatureProperties()) {
        signAllPublications()
    }

    coordinates(group.toString(), "fhir-models", version.toString())

    pom {
        name = "fhir-models"
        description = "FHIR Models for Kotlin Multiplatform"
        inceptionYear = "2024"
        url = "https://github.com/icure/kotlin-fhir-model-generator"
        licenses {
            license {
                name = "Apache-2.0 license"
                url = "https://choosealicense.com/licenses/apache-2.0/"
                distribution = "https://choosealicense.com/licenses/apache-2.0/"
            }
        }
        developers {
            developer {
                id = "icure"
                name = "iCure"
                url = "https://github.com/iCure/"
            }
        }
        scm {
            url.set("https://github.com/icure/kotlin-fhir-model-generator")
            connection.set("scm:git:git://github.com/icure/kotlin-fhir-model-generator.git")
            developerConnection.set("scm:git:ssh://git@github.com:icure/kotlin-fhir-model-generator.git")
        }
    }
}

fun projectHasSignatureProperties() =
    project.hasProperty("signing.keyId") && project.hasProperty("signing.secretKeyRingFile") && project.hasProperty("signing.password")

if (projectHasSignatureProperties()) {
    signing {
        useInMemoryPgpKeys(
            file(project.property("signing.secretKeyRingFile") as String).readText(),
            project.property("signing.password") as String
        )
        sign(publishing.publications)
    }
}

if (!projectHasSignatureProperties()) {
    tasks.withType<PublishToMavenRepository> {
        doFirst {
            throw IllegalStateException("Cannot publish to Maven Central without signing properties")
        }
    }
}