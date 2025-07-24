//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.subscriptionstatus

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Status information about a Subscription provided during event notification
 *
 * The SubscriptionStatus resource describes the state of a Subscription during notifications.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status requested | active | error | off | entered-in-error
 * @param type handshake | heartbeat | event-notification | query-status | query-event
 * @param eventsSinceSubscriptionStart Events since the Subscription was created
 * @param subscription Reference to the Subscription responsible for this notification
 * @param topic Reference to the SubscriptionTopic this notification relates to
 */
@SerialName("SubscriptionStatus")
@Serializable
public data class SubscriptionStatus(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * requested | active | error | off | entered-in-error
   */
  public val status: String? = null,
  /**
   * handshake | heartbeat | event-notification | query-status | query-event
   */
  public val type: String? = null,
  /**
   * Events since the Subscription was created
   */
  public val eventsSinceSubscriptionStart: Int? = null,
  public val notificationEvent: List<SubscriptionStatusNotificationEvent> = emptyList(),
  /**
   * Reference to the Subscription responsible for this notification
   */
  public val subscription: Reference,
  /**
   * Reference to the SubscriptionTopic this notification relates to
   */
  public val topic: String? = null,
  public val error: List<CodeableConcept> = emptyList(),
) : DomainResource
