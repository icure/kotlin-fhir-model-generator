//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.subscription

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Server push subscription criteria
 *
 * The subscription resource is used to define a push-based subscription from a server to another
 * system. Once a subscription is registered with the server, the server checks every resource that is
 * created or updated, and if the resource matches the given criteria, it sends a message on the
 * defined "channel" so that another system can take an appropriate action.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status requested | active | error | off
 * @param end When to automatically delete the subscription
 * @param reason Description of why this subscription was created
 * @param criteria Rule for server push
 * @param error Latest error note
 * @param channel The channel on which to report matches to the criteria
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
  /**
   * requested | active | error | off
   */
  public val status: String? = null,
  public val contact: List<ContactPoint> = emptyList(),
  /**
   * When to automatically delete the subscription
   */
  public val end: String? = null,
  /**
   * Description of why this subscription was created
   */
  public val reason: String? = null,
  /**
   * Rule for server push
   */
  public val criteria: String? = null,
  /**
   * Latest error note
   */
  public val error: String? = null,
  /**
   * The channel on which to report matches to the criteria
   */
  public val channel: SubscriptionChannel,
) : DomainResource
