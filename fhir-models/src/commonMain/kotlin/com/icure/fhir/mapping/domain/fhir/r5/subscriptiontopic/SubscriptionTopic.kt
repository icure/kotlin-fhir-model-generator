//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.subscriptiontopic

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.usagecontext.UsageContext
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
 * @param url Canonical identifier for this subscription topic, represented as an absolute URI
 * (globally unique)
 * @param version Business version of the subscription topic
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this subscription topic (computer friendly)
 * @param title Name for this subscription topic (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental If for testing purposes, not real usage
 * @param date Date status first applied
 * @param publisher The name of the individual or organization that published the SubscriptionTopic
 * @param description Natural language description of the SubscriptionTopic
 * @param purpose Why this SubscriptionTopic is defined
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
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
   * Canonical identifier for this subscription topic, represented as an absolute URI (globally
   * unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the subscription topic
   */
  public val version: String? = null,
  /**
   * How to compare versions
   */
  public val versionAlgorithmString: String? = null,
  /**
   * How to compare versions
   */
  public val versionAlgorithmCoding: Coding? = null,
  /**
   * Name for this subscription topic (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this subscription topic (human friendly)
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
   * Copyright holder and year(s)
   */
  public val copyrightLabel: String? = null,
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
