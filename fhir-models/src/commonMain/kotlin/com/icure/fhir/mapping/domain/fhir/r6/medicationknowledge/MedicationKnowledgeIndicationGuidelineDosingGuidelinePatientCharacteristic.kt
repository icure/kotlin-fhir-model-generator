//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.range.Range
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
 * @param type Categorization of specific characteristic that is relevant to the administration
 * guideline
 * @param valueCodeableConcept The specific characteristic
 * @param valueQuantity The specific characteristic
 * @param valueRange The specific characteristic
 */
@SerialName("MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristic")
@Serializable
public data class MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Categorization of specific characteristic that is relevant to the administration guideline
   */
  public val type: CodeableConcept,
  /**
   * The specific characteristic
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * The specific characteristic
   */
  public val valueQuantity: Quantity? = null,
  /**
   * The specific characteristic
   */
  public val valueRange: Range? = null,
) : BackboneElement
