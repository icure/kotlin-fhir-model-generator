//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.adverseevent

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who was involved in the adverse event or the potential adverse event and what they did
 *
 * Indicates who or what participated in the adverse event and how they were involved.
 *
 * @param id Unique id for inter-element referencing
 * @param function Type of involvement
 * @param actor Who was involved in the adverse event or the potential adverse event
 */
@SerialName("AdverseEventParticipant")
@Serializable
public data class AdverseEventParticipant(
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
   * Who was involved in the adverse event or the potential adverse event
   */
  public val actor: Reference,
) : BackboneElement
