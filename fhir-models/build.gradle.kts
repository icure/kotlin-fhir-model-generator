import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework
import java.util.Properties
import kotlin.apply

plugins {
    alias(libs.plugins.kotlinMultiplatform) apply true
    alias(libs.plugins.kotlinSerialization) apply true
    alias(libs.plugins.androidLibrary) apply true
    alias(libs.plugins.vanniktech.mavenPublish) apply true
    alias(libs.plugins.kotest.multiplatform)
    id("maven-publish")
    signing
}

group = "com.icure"
version = "1.0.2"

private fun Project.getLocalProperties() =
    Properties().apply {
        kotlin.runCatching {
            load(rootProject.file("local.properties").reader())
        }
    }

kotlin {
    val localProperties = getLocalProperties()

    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_1_8
        }
    }
    androidTarget {
        publishLibraryVariants("release")
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_1_8)
        }
    }
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    val frameworkName = rootProject.name.replaceFirstChar { it.uppercase() }.let { "${it}Kotlin" }
    val xcf = XCFramework(frameworkName)
    val iosSimulators = listOf(
        iosX64(),
        iosSimulatorArm64()
    )
    val iosAll = iosSimulators + iosArm64()
    iosAll.forEach { target ->
        target.binaries.framework {
            baseName = frameworkName
            xcf.add(this)
        }
    }
    iosSimulators.forEach { target ->
        target.testRuns.forEach { testRun ->
            (localProperties["ios.simulator"] as? String)?.let { testRun.deviceId = it }
        }
    }
    macosX64()
    macosArm64()

    val linuxArm64Target = linuxArm64()
    val linuxX64Target = linuxX64()
    listOf(
        linuxX64Target,
        linuxArm64Target
    ).onEach { target ->
        target.binaries {
            all {
                freeCompilerArgs += listOf("-linker-option", "--allow-shlib-undefined")
                localProperties["cinteropsLibsDir"]?.also { allDirs ->
                    (allDirs as String).split(";").forEach {
                        linkerOpts.add(0, "-L$it")
                    }
                }
            }
        }
    }
    mingwX64()
    applyDefaultHierarchyTemplate()

    js(IR) {
        moduleName = rootProject.name
        browser {
            testTask {
                useKarma {
                    useChromeHeadless()
                    useFirefoxHeadless()
                }
            }
        }
        nodejs { }
        binaries.library()
        generateTypeScriptDefinitions()
        useEsModules()
    }

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
    namespace = "com.icure.fhir.models"
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
    project.hasProperty("signingInMemoryKeyId")
        && project.hasProperty("signingInMemoryKeyPassword")
        && project.hasProperty("signingInMemoryKey")

//if (projectHasSignatureProperties()) {
//    signing {
//        useInMemoryPgpKeys(
//            file(project.property("signingSecretKeyRingFile") as String).readText(),
//            project.property("signingInMemoryKeyPassword") as String
//        )
//        sign(publishing.publications)
//    }
//}

if (!projectHasSignatureProperties()) {
    tasks.withType<PublishToMavenRepository> {
        doFirst {
            throw IllegalStateException("Cannot publish to Maven Central without signing properties")
        }
    }
}
