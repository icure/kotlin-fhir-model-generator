package io.articulus.fhir.generator


open class FhirRenderer(private val spec: FhirSpec) {
    fun build() {
        FhirStructureDefinitionRenderer(spec).render()
        //TestClassRenderer(spec)
    }
}


