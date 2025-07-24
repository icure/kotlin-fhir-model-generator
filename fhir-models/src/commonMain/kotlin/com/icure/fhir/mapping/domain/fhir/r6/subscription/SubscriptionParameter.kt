//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.subscription

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Channel type
 *
 * Channel-dependent information to send as part of the notification (e.g., HTTP Headers).
 *
 * @param id Unique id for inter-element referencing
 * @param name Name (key) of the parameter
 * @param value Value of the parameter to use or pass through
 */
@SerialName("SubscriptionParameter")
@Serializable
public data class SubscriptionParameter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name (key) of the parameter
   */
  public val name: String? = null,
  /**
   * Value of the parameter to use or pass through
   */
  public val `value`: String? = null,
) : BackboneElement
