//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.allergyintolerance

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who or what participated in the activities related to the allergy or intolerance and how they
 * were involved
 *
 * Indicates who or what participated in the activities related to the allergy or intolerance and
 * how they were involved.
 *
 * @param id Unique id for inter-element referencing
 * @param function Type of involvement
 * @param actor Who or what participated in the activities related to the allergy or intolerance
 */
@SerialName("AllergyIntoleranceParticipant")
@Serializable
public data class AllergyIntoleranceParticipant(
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
   * Who or what participated in the activities related to the allergy or intolerance
   */
  public val actor: Reference,
) : BackboneElement
