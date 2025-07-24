//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.adverseevent

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
