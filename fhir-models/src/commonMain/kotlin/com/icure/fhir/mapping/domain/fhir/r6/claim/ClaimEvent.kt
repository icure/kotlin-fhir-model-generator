//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.claim

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Event information
 *
 * Information code for an event with a corresponding date or period.
 *
 * @param id Unique id for inter-element referencing
 * @param type Specific event
 * @param whenDateTime Occurance date or period
 * @param whenPeriod Occurance date or period
 */
@SerialName("ClaimEvent")
@Serializable
public data class ClaimEvent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Specific event
   */
  public val type: CodeableConcept,
  /**
   * Occurance date or period
   */
  public val whenDateTime: String? = null,
  /**
   * Occurance date or period
   */
  public val whenPeriod: Period? = null,
) : BackboneElement
