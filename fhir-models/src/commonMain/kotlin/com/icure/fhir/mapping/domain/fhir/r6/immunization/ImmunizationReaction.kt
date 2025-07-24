//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.immunization

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of a reaction that follows immunization
 *
 * Categorical data indicating that an adverse event is associated in time to an immunization.
 *
 * @param id Unique id for inter-element referencing
 * @param date When reaction started
 * @param manifestation Additional information on reaction
 * @param reported Indicates self-reported reaction
 */
@SerialName("ImmunizationReaction")
@Serializable
public data class ImmunizationReaction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * When reaction started
   */
  public val date: String? = null,
  /**
   * Additional information on reaction
   */
  public val manifestation: CodeableReference? = null,
  /**
   * Indicates self-reported reaction
   */
  public val reported: Boolean? = null,
) : BackboneElement
