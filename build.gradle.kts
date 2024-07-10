import java.text.SimpleDateFormat
import java.util.Date

val mavenReleasesRepository: String by project
val repoUsername: String by project
val repoPassword: String by project

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.24"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.24" apply true
    id("com.taktik.gradle.git-version") version "2.0.13-gd2de854853"
    id("com.google.devtools.ksp") version "1.9.24-1.0.20"
    id("application")
    `maven-publish`
}

val gitVersion: String? by project

group = "io.icure.fhir"
version = gitVersion ?: "0.0.1-SNAPSHOT"
description = "Kotlin on FHIR Model Generator"

application {
    mainClass = "io.articulus.fhir.generator.GeneratorKt"
}

tasks.register<Jar>("api-jar") {
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
        val file = File("./build/publications/kotlin-fhir-model-generator/pom-default.xml")
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
    api(libs.org.jetbrains.kotlin.kotlin.stdlib.jdk8)
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

tasks {
    register<Jar>("fatJar") {
        dependsOn.addAll(listOf("compileJava", "compileKotlin", "processResources"))
        archiveClassifier.set("fhirModelGenerator") // Naming the jar
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
        manifest { attributes(mapOf("Main-Class" to application.mainClass)) }
        val sourcesMain = sourceSets.main.get()
        val contents = configurations.runtimeClasspath.get()
            .map { if (it.isDirectory) it else zipTree(it) } +
                sourcesMain.output
        from(contents)
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_21.toString()
}