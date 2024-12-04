package io.articulus.fhir.generator

internal inline fun jvmOnly(block: () -> Unit) {
    if (Settings.target == Settings.GenerationTarget.JVM) block()
}

internal inline fun kmpOnly(block: () -> Unit) {
    if (Settings.target == Settings.GenerationTarget.KMP) block()
}