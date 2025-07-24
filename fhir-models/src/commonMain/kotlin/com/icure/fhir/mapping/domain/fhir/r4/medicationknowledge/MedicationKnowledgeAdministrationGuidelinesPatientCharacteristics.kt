//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
