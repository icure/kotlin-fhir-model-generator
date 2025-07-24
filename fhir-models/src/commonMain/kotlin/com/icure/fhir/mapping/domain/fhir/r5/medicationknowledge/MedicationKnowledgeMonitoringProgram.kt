//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Program under which a medication is reviewed
 *
 * The program under which the medication is reviewed.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of program under which the medication is monitored
 * @param name Name of the reviewing program
 */
@SerialName("MedicationKnowledgeMonitoringProgram")
@Serializable
public data class MedicationKnowledgeMonitoringProgram(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of program under which the medication is monitored
   */
  public val type: CodeableConcept? = null,
  /**
   * Name of the reviewing program
   */
  public val name: String? = null,
) : BackboneElement
