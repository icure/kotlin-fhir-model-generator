//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.subscription

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Notification about a SubscriptionTopic
 *
 * The subscription resource describes a particular client's request to be notified about a
 * SubscriptionTopic.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param name Human readable name for this subscription
 * @param status requested | active | error | off | entered-in-error
 * @param topic Reference to the subscription topic being subscribed to
 * @param end When to automatically delete the subscription
 * @param managingEntity Entity responsible for Subscription changes
 * @param reason Description of why this subscription was created
 * @param channelType Channel type for notifications
 * @param endpoint Where the channel points to
 * @param heartbeatPeriod Interval in seconds to send 'heartbeat' notification
 * @param timeout Timeout in seconds to attempt notification delivery
 * @param contentType MIME type to send, or omit for no payload
 * @param content empty | id-only | full-resource
 * @param maxCount Maximum number of events that can be combined in a single notification
 */
@SerialName("Subscription")
@Serializable
public data class Subscription(
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
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Human readable name for this subscription
   */
  public val name: String? = null,
  /**
   * requested | active | error | off | entered-in-error
   */
  public val status: String? = null,
  /**
   * Reference to the subscription topic being subscribed to
   */
  public val topic: String? = null,
  public val contact: List<ContactPoint> = emptyList(),
  /**
   * When to automatically delete the subscription
   */
  public val end: String? = null,
  /**
   * Entity responsible for Subscription changes
   */
  public val managingEntity: Reference? = null,
  /**
   * Description of why this subscription was created
   */
  public val reason: String? = null,
  public val filterBy: List<SubscriptionFilterBy> = emptyList(),
  /**
   * Channel type for notifications
   */
  public val channelType: Coding,
  /**
   * Where the channel points to
   */
  public val endpoint: String? = null,
  public val parameter: List<SubscriptionParameter> = emptyList(),
  /**
   * Interval in seconds to send 'heartbeat' notification
   */
  public val heartbeatPeriod: Int? = null,
  /**
   * Timeout in seconds to attempt notification delivery
   */
  public val timeout: Int? = null,
  /**
   * MIME type to send, or omit for no payload
   */
  public val contentType: String? = null,
  /**
   * empty | id-only | full-resource
   */
  public val content: String? = null,
  /**
   * Maximum number of events that can be combined in a single notification
   */
  public val maxCount: Int? = null,
) : DomainResource
