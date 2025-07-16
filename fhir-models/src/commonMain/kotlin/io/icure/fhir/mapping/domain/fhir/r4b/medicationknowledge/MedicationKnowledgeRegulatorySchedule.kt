//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specifies the schedule of a medication in jurisdiction
 *
 * Specifies the schedule of a medication in jurisdiction.
 *
 * @param id Unique id for inter-element referencing
 * @param schedule Specifies the specific drug schedule
 */
@SerialName("MedicationKnowledgeRegulatorySchedule")
@Serializable
public data class MedicationKnowledgeRegulatorySchedule(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Specifies the specific drug schedule
   */
  public val schedule: CodeableConcept,
) : BackboneElement
