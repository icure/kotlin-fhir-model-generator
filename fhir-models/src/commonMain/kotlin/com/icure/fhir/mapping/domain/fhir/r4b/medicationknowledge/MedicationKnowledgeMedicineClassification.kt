//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Categorization of the medication within a formulary or classification system
 *
 * Categorization of the medication within a formulary or classification system.
 *
 * @param id Unique id for inter-element referencing
 * @param type The type of category for the medication (for example, therapeutic classification,
 * therapeutic sub-classification)
 */
@SerialName("MedicationKnowledgeMedicineClassification")
@Serializable
public data class MedicationKnowledgeMedicineClassification(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of category for the medication (for example, therapeutic classification, therapeutic
   * sub-classification)
   */
  public val type: CodeableConcept,
  public val classification: List<CodeableConcept> = emptyList(),
) : BackboneElement
