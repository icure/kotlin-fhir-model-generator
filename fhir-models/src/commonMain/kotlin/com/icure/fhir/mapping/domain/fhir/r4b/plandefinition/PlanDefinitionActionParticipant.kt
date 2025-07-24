//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.plandefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who should participate in the action
 *
 * Indicates who should participate in performing the action described.
 *
 * @param id Unique id for inter-element referencing
 * @param type patient | practitioner | related-person | device
 * @param role E.g. Nurse, Surgeon, Parent
 */
@SerialName("PlanDefinitionActionParticipant")
@Serializable
public data class PlanDefinitionActionParticipant(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * patient | practitioner | related-person | device
   */
  public val type: String? = null,
  /**
   * E.g. Nurse, Surgeon, Parent
   */
  public val role: CodeableConcept? = null,
) : BackboneElement
