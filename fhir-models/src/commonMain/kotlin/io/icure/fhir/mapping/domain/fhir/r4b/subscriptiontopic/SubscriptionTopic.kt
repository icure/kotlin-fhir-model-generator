//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.subscriptiontopic

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The definition of a specific topic for triggering events within the Subscriptions framework
 *
 * Describes a stream of resource state changes or events and annotated with labels useful to filter
 * projections from this topic.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this subscription topic definition, represented as a URI
 * (globally unique)
 * @param version Business version of the subscription topic
 * @param title Name for this subscription topic (Human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental If for testing purposes, not real usage
 * @param date Date status first applied
 * @param publisher The name of the individual or organization that published the SubscriptionTopic
 * @param description Natural language description of the SubscriptionTopic
 * @param purpose Why this SubscriptionTopic is defined
 * @param copyright Use and/or publishing restrictions
 * @param approvalDate When SubscriptionTopic is/was approved by publisher
 * @param lastReviewDate Date the Subscription Topic was last reviewed by the publisher
 * @param effectivePeriod The effective date range for the SubscriptionTopic
 */
@SerialName("SubscriptionTopic")
@Serializable
public data class SubscriptionTopic(
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
   * Canonical identifier for this subscription topic definition, represented as a URI (globally
   * unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the subscription topic
   */
  public val version: String? = null,
  /**
   * Name for this subscription topic (Human friendly)
   */
  public val title: String? = null,
  public val derivedFrom: List<String> = emptyList(),
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * If for testing purposes, not real usage
   */
  public val experimental: Boolean? = null,
  /**
   * Date status first applied
   */
  public val date: String? = null,
  /**
   * The name of the individual or organization that published the SubscriptionTopic
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  /**
   * Natural language description of the SubscriptionTopic
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this SubscriptionTopic is defined
   */
  public val purpose: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * When SubscriptionTopic is/was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * Date the Subscription Topic was last reviewed by the publisher
   */
  public val lastReviewDate: String? = null,
  /**
   * The effective date range for the SubscriptionTopic
   */
  public val effectivePeriod: Period? = null,
  public val resourceTrigger: List<SubscriptionTopicResourceTrigger> = emptyList(),
  public val eventTrigger: List<SubscriptionTopicEventTrigger> = emptyList(),
  public val canFilterBy: List<SubscriptionTopicCanFilterBy> = emptyList(),
  public val notificationShape: List<SubscriptionTopicNotificationShape> = emptyList(),
) : DomainResource
