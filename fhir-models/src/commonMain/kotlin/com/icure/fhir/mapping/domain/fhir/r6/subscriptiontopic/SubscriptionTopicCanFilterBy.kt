//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.subscriptiontopic

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Properties by which a Subscription can filter notifications from the SubscriptionTopic
 *
 * List of properties by which Subscriptions on the SubscriptionTopic can be filtered. May be
 * defined Search Parameters (e.g., Encounter.patient) or parameters defined within this
 * SubscriptionTopic context (e.g., hub.event).
 *
 * @param id Unique id for inter-element referencing
 * @param description Description of this filter parameter
 * @param resource URL of the triggering Resource that this filter applies to
 * @param filterParameter Human-readable and computation-friendly name for a filter parameter usable
 * by subscriptions on this topic, via Subscription.filterBy.filterParameter
 * @param filterDefinition Canonical URL for a filterParameter definition
 */
@SerialName("SubscriptionTopicCanFilterBy")
@Serializable
public data class SubscriptionTopicCanFilterBy(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of this filter parameter
   */
  public val description: String? = null,
  /**
   * URL of the triggering Resource that this filter applies to
   */
  public val resource: String? = null,
  /**
   * Human-readable and computation-friendly name for a filter parameter usable by subscriptions on
   * this topic, via Subscription.filterBy.filterParameter
   */
  public val filterParameter: String? = null,
  /**
   * Canonical URL for a filterParameter definition
   */
  public val filterDefinition: String? = null,
  public val comparator: List<String> = emptyList(),
  public val modifier: List<String> = emptyList(),
) : BackboneElement
