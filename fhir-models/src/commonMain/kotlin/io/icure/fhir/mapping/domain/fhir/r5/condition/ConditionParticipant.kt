//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.condition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who or what participated in the activities related to the condition and how they were involved
 *
 * Indicates who or what participated in the activities related to the condition and how they were
 * involved.
 *
 * @param id Unique id for inter-element referencing
 * @param function Type of involvement
 * @param actor Who or what participated in the activities related to the condition
 */
@SerialName("ConditionParticipant")
@Serializable
public data class ConditionParticipant(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of involvement
   */
  public val function: CodeableConcept? = null,
  /**
   * Who or what participated in the activities related to the condition
   */
  public val actor: Reference,
) : BackboneElement
