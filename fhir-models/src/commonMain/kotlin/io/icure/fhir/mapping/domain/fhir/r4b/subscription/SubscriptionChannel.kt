//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.subscription

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The channel on which to report matches to the criteria
 *
 * Details where to send notifications when resources are received that meet the criteria.
 *
 * @param id Unique id for inter-element referencing
 * @param type rest-hook | websocket | email | sms | message
 * @param endpoint Where the channel points to
 * @param payload MIME type to send, or omit for no payload
 */
@SerialName("SubscriptionChannel")
@Serializable
public data class SubscriptionChannel(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * rest-hook | websocket | email | sms | message
   */
  public val type: String? = null,
  /**
   * Where the channel points to
   */
  public val endpoint: String? = null,
  /**
   * MIME type to send, or omit for no payload
   */
  public val payload: String? = null,
  public val `header`: List<String> = emptyList(),
) : BackboneElement
