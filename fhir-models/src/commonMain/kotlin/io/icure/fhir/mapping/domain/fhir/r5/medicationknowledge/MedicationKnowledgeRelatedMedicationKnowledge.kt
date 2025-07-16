//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
