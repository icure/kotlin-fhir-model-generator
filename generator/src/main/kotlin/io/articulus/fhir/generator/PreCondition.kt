package io.articulus.fhir.generator

internal inline fun jvmOnly(block: () -> Unit) {
    if (Settings.target == Settings.GenerationTarget.JVM) block()
}