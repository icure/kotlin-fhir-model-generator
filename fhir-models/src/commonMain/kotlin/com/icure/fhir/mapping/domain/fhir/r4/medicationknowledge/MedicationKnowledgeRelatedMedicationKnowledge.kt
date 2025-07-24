//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Associated or related medication information
 *
 * Associated or related knowledge about a medication.
 *
 * @param id Unique id for inter-element referencing
 * @param type Category of medicationKnowledge
 */
@SerialName("MedicationKnowledgeRelatedMedicationKnowledge")
@Serializable
public data class MedicationKnowledgeRelatedMedicationKnowledge(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Category of medicationKnowledge
   */
  public val type: CodeableConcept,
  public val reference: List<Reference> = emptyList(),
) : BackboneElement
