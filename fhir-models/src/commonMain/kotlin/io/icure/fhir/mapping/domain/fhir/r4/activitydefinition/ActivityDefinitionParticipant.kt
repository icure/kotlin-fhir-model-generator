//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.activitydefinition

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
 * @param role E.g. Nurse, Surgeon, Parent, etc.
 */
@SerialName("ActivityDefinitionParticipant")
@Serializable
public data class ActivityDefinitionParticipant(
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
   * E.g. Nurse, Surgeon, Parent, etc.
   */
  public val role: CodeableConcept? = null,
) : BackboneElement
