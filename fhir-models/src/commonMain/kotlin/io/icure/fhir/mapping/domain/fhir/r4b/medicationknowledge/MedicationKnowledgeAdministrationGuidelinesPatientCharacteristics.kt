//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Characteristics of the patient that are relevant to the administration guidelines
 *
 * Characteristics of the patient that are relevant to the administration guidelines (for example,
 * height, weight, gender, etc.).
 *
 * @param id Unique id for inter-element referencing
 * @param characteristicCodeableConcept Specific characteristic that is relevant to the
 * administration guideline
 * @param characteristicQuantity Specific characteristic that is relevant to the administration
 * guideline
 */
@SerialName("MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics")
@Serializable
public data class MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Specific characteristic that is relevant to the administration guideline
   */
  public val characteristicCodeableConcept: CodeableConcept? = null,
  /**
   * Specific characteristic that is relevant to the administration guideline
   */
  public val characteristicQuantity: Quantity? = null,
  public val `value`: List<String> = emptyList(),
) : BackboneElement
