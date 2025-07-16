//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.subscriptionstatus

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Detailed information about any events relevant to this notification
 *
 * Detailed information about events relevant to this subscription notification.
 *
 * @param id Unique id for inter-element referencing
 * @param eventNumber Sequencing index of this event
 * @param timestamp The instant this event occurred
 * @param focus Reference to the primary resource or information of this event
 */
@SerialName("SubscriptionStatusNotificationEvent")
@Serializable
public data class SubscriptionStatusNotificationEvent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Sequencing index of this event
   */
  public val eventNumber: Int? = null,
  /**
   * The instant this event occurred
   */
  public val timestamp: String? = null,
  /**
   * Reference to the primary resource or information of this event
   */
  public val focus: Reference? = null,
  public val additionalContext: List<Reference> = emptyList(),
) : BackboneElement
