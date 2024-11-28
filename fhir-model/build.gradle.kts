import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform) apply true
    alias(libs.plugins.kotlinSerialization) apply true
    alias(libs.plugins.androidLibrary) apply true
    alias(libs.plugins.vanniktech.mavenPublish) apply true
}

group = "com.icure"
version = "1.0.0"

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
//    macosArm64()
//    watchosX64()
    linuxX64()

    sourceSets {
        val commonMain by getting {
            dependencies {
//                implementation(libs.org.jetbrains.kotlin.kotlin.stdlib)
                implementation(libs.org.jetbrains.kotlinx.kotlinx.serialization.json)
            }
            kotlin.srcDir("src/commonMain/kotlin")
        }
//        val commonTest by getting {
//            dependencies {
//                implementation(libs.org.jetbrains.kotlin.kotlin.test)
//            }
//        }
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
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    signAllPublications()

    coordinates(group.toString(), "fhir-model", version.toString())

    pom {
        name = "My library"
        description = "A library."
        inceptionYear = "2024"
        url = "https://github.com/kotlin/multiplatform-library-template/"
        licenses {
            license {
                name = "XXX"
                url = "YYY"
                distribution = "ZZZ"
            }
        }
        developers {
            developer {
                id = "XXX"
                name = "YYY"
                url = "ZZZ"
            }
        }
        scm {
            url = "XXX"
            connection = "YYY"
            developerConnection = "ZZZ"
        }
    }
}
