//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Associated or related medication information
 *
 * Associated or related medications. For example, if the medication is a branded product (e.g.
 * Crestor), this is the Therapeutic Moeity (e.g. Rosuvastatin) or if this is a generic medication
 * (e.g. Rosuvastatin), this would link to a branded product (e.g. Crestor.
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
