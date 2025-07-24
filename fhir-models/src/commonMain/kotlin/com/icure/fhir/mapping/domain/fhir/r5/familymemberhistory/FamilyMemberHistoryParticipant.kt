//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.familymemberhistory

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who or what participated in the activities related to the family member history and how they were
 * involved
 *
 * Indicates who or what participated in the activities related to the family member history and how
 * they were involved.
 *
 * @param id Unique id for inter-element referencing
 * @param function Type of involvement
 * @param actor Who or what participated in the activities related to the family member history
 */
@SerialName("FamilyMemberHistoryParticipant")
@Serializable
public data class FamilyMemberHistoryParticipant(
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
   * Who or what participated in the activities related to the family member history
   */
  public val actor: Reference,
) : BackboneElement
