import java.text.SimpleDateFormat
import java.util.Date

val mavenReleasesRepository: String by project
val repoUsername: String by project
val repoPassword: String by project

plugins {
    alias(libs.plugins.kotlinJvm)
    id("com.google.devtools.ksp") version "2.0.21-1.0.28"
    id("application")
    `maven-publish`
}

group = "com.icure.fhir"
version = "1.0.1"
description = "Kotlin on FHIR Model Generator"

application {
    mainClass = "io.articulus.fhir.generator.GeneratorKt"
}

configurations {
    all {
        exclude(group = "org.slf4j", module = "slf4j-log4j12")
        exclude(group = "log4j", module = "log4j")
    }
}

tasks.register<Jar>("api-jar") {
    from("gen/src/main/kotlin")
    from(sourceSets.main.get().output.classesDirs)
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from("gen/src/main/kotlin")
    from(sourceSets.main.get().output.classesDirs)
}

tasks.withType<GenerateModuleMetadata> {
    dependsOn(tasks.getByName("api-jar"))
}

publishing {
    publications {
        create<MavenPublication>("kotlin-fhir-model-generator") {
            artifactId = "kotlin-fhir-model-generator"
            artifact(tasks.getByName("api-jar"))
            artifact(sourcesJar.get())
        }
    }

    repositories {
        maven {
            name = "Taktik"
            url = uri(mavenReleasesRepository)
            credentials {
                username = repoUsername
                password = repoPassword
            }
        }
    }
}

kotlin {
    jvmToolchain(21)
    sourceSets {
        val main by getting {
            kotlin.srcDir("src/main/kotlin")
            kotlin.srcDir("gen/src/main/kotlin")
            resources.srcDir("src/main/resources")
        }
        val test by getting {
            kotlin.srcDir("src/main/kotlin")
            kotlin.srcDir("gen/src/main/kotlin")
            resources.srcDir("src/test/resources")
            resources.srcDir("gen/src/main/resources")
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21

    withSourcesJar()
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}

tasks.withType<PublishToMavenRepository> {
    doFirst {
        println("Artifact >>> ${project.group}:${project.name}:${project.version} <<< published to Maven repository")
    }
}

tasks.withType<GenerateMavenPom>().all {
    doLast {
        val file = File("${project.rootDir}/generator/build/publications/kotlin-fhir-model-generator/pom-default.xml")
        var text = file.readText()
        val regex = "(?s)(<dependencyManagement>.+?<dependencies>)(.+?)(</dependencies>.+?</dependencyManagement>)".toRegex()
        val matcher = regex.find(text)
        if (matcher != null) {
            text = regex.replaceFirst(text, "")
            val firstDeps = matcher.groups[2]!!.value
            text = regex.replaceFirst(text, "$1$2$firstDeps$3")
        }
        file.writeText(text)
    }
}

tasks.withType<Jar> {
    manifest {
        attributes(mapOf(
            "Built-By"        to System.getProperties()["user.name"],
            "Build-Timestamp" to SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(Date()),
            "Build-Revision"  to version,
            "Created-By"      to "Gradle ${gradle.gradleVersion}",
            "Build-Jdk"       to "${System.getProperties()["java.version"]} (${System.getProperties()["java.vendor"]} ${System.getProperties()["java.vm.version"]})",
            "Build-OS"        to "${System.getProperties()["os.name"]} ${System.getProperties()["os.arch"]} ${System.getProperties()["os.version"]}"
        ))
    }
}
dependencies {
    ksp(project(":sdk-codegen:ksp-json-processor"))
    api(libs.org.jetbrains.kotlin.kotlin.reflect)
    api(libs.org.jetbrains.kotlinx.kotlinx.serialization.json)
    api(libs.com.google.code.gson.gson)
    api(libs.com.squareup.kotlinpoet)
    api(libs.org.slf4j.slf4j.api)
    api(libs.ch.qos.logback.logback.classic)
    api(libs.com.google.guava.guava)
    api(libs.com.github.fge.json.patch)
    api(libs.com.fasterxml.jackson.module.kotlin)
    api(libs.com.fasterxml.jackson.core)
    api(libs.com.fasterxml.jackson.annotations)
    api(libs.com.fasterxml.jackson.dataformat.xml)
    api(libs.com.google.devtools.ksp.kotlin)

    testImplementation(libs.org.jetbrains.kotlin.kotlin.test)
    testImplementation(libs.org.junit.jupiter.junit.jupiter.api)
    testImplementation(libs.org.junit.jupiter.junit.jupiter.params)
}

val fhirVersionsMatrix = mapOf(
    "r4" to "R4",
    "r4b" to "R4B",
    "r5" to "R5",
    "r6" to "6.0.0-ballot1"
)

val targetMatrix = mapOf(
    "JVM" to listOf("${project.rootDir}/generator/gen/src/main/kotlin", "${project.rootDir}/generator/gen/src/test/kotlin", "${project.rootDir}/generator/gen/src/main/resources/samples"),
    "KMP" to listOf("${project.rootDir}/fhir-models/src/commonMain/kotlin", "${project.rootDir}/fhir-models/src/commonTest/kotlin", "${project.rootDir}/fhir-models/src/commonMain/resources/samples")
)

val filesToCopy = mapOf(
    "JVM" to listOf(
        "${project.rootDir}/fhir-models/src/commonMain/kotlin/io/icure/fhir/mapping/domain/fhir/ExactMeasure.kt" to
            "${project.rootDir}/generator/gen/src/main/kotlin/io/icure/fhir/mapping/domain/fhir",
    )
)

tasks {
    withType<Copy> {
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }

    register<Jar>("fatJar") {
        dependsOn.addAll(listOf("compileJava", "compileKotlin", "processResources"))
        archiveClassifier.set("fhirModelGenerator")
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
        manifest { attributes(mapOf("Main-Class" to application.mainClass)) }
        val sourcesMain = sourceSets.main.get()
        val contents = configurations.runtimeClasspath.get()
            .map { if (it.isDirectory) it else zipTree(it) } +
                sourcesMain.output
        from(contents)
    }

    register("generateModels") {
        dependsOn("fatJar")
        doLast {
            val libsDir = file("${project.rootDir}/generator/build/libs")

            val jarFile = libsDir.listFiles()?.find { it.name.endsWith("-fhirModelGenerator.jar") }

            if (jarFile != null) {
                val renamedJar = file("${libsDir}/fhirModelGenerator.jar")
                jarFile.renameTo(renamedJar)
                println("Renamed ${jarFile.name} to ${renamedJar.name}")
            } else {
                throw GradleException("Jar file not found in ${libsDir}")
            }

            val jarPath = "${libsDir}/fhirModelGenerator.jar"
            targetMatrix.forEach { target, params ->
                fhirVersionsMatrix.forEach { (version, path) ->
                    exec {
                        commandLine(
                            "java", "-jar", jarPath,
                            params[0],
                            params[1],
                            params[2],
                            "https://hl7.org/fhir/$path/",
                            version,
                            target
                        )
                    }
                }
                filesToCopy[target]?.forEach { (src, dst) ->
                    copy {
                        from(src)
                        into(dst)
                    }
                }
            }
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_21.toString()
}
