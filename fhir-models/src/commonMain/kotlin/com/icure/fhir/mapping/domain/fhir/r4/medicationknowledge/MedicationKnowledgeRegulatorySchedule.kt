//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
