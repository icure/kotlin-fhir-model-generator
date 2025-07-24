//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
 * @param sourceString The source of the classification
 * @param sourceUri The source of the classification
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
  /**
   * The source of the classification
   */
  public val sourceString: String? = null,
  /**
   * The source of the classification
   */
  public val sourceUri: String? = null,
  public val classification: List<CodeableConcept> = emptyList(),
) : BackboneElement
