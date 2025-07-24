//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.immunization

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
 * @param detail Additional information on reaction
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
  public val detail: Reference? = null,
  /**
   * Indicates self-reported reaction
   */
  public val reported: Boolean? = null,
) : BackboneElement
