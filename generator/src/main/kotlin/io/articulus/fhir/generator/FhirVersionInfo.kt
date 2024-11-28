package io.articulus.fhir.generator

import java.io.File
import java.time.LocalDateTime


class FhirVersionInfo(val spec: FhirSpec, val directory: String) {

    val now: LocalDateTime = LocalDateTime.now()
    val version: String = try { File("${Settings.downloadDir}/version.info")
            .readText(Charsets.UTF_8)
            .split("\r\n")[2]
            .substringAfterLast("=") } catch (e:Exception) { "obf" }

}
