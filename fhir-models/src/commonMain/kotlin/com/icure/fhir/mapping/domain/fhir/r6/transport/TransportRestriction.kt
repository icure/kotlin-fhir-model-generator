//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.transport

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Constraints on fulfillment transports
 *
 * If the Transport.focus is a request resource and the transport is seeking fulfillment (i.e. is
 * asking for the request to be actioned), this element identifies any limitations on what parts of the
 * referenced request should be actioned.
 *
 * @param id Unique id for inter-element referencing
 * @param repetitions How many times to repeat
 * @param period When fulfillment sought
 */
@SerialName("TransportRestriction")
@Serializable
public data class TransportRestriction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * How many times to repeat
   */
  public val repetitions: Int? = null,
  /**
   * When fulfillment sought
   */
  public val period: Period? = null,
  public val recipient: List<Reference> = emptyList(),
) : BackboneElement
