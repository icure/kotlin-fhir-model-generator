//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.subscriptionstatus

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param eventNumber Event number
 * @param timestamp The instant this event occurred
 * @param focus The focus of this event
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
   * Event number
   */
  public val eventNumber: String? = null,
  /**
   * The instant this event occurred
   */
  public val timestamp: String? = null,
  /**
   * The focus of this event
   */
  public val focus: Reference? = null,
  public val additionalContext: List<Reference> = emptyList(),
) : BackboneElement
