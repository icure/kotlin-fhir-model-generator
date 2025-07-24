//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.subscriptiontopic

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Definition of a resource-based trigger for the subscription topic
 *
 * A definition of a resource-based event that triggers a notification based on the
 * SubscriptionTopic. The criteria may be just a human readable description and/or a full FHIR search
 * string or FHIRPath expression. Multiple triggers are considered OR joined (e.g., a resource update
 * matching ANY of the definitions will trigger a notification).
 *
 * @param id Unique id for inter-element referencing
 * @param description Text representation of the resource trigger
 * @param resource Data Type or Resource (reference to definition) for this trigger definition
 * @param queryCriteria Query based trigger rule
 * @param fhirPathCriteria FHIRPath based trigger rule
 */
@SerialName("SubscriptionTopicResourceTrigger")
@Serializable
public data class SubscriptionTopicResourceTrigger(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Text representation of the resource trigger
   */
  public val description: String? = null,
  /**
   * Data Type or Resource (reference to definition) for this trigger definition
   */
  public val resource: String? = null,
  public val supportedInteraction: List<String> = emptyList(),
  /**
   * Query based trigger rule
   */
  public val queryCriteria: SubscriptionTopicResourceTriggerQueryCriteria? = null,
  /**
   * FHIRPath based trigger rule
   */
  public val fhirPathCriteria: String? = null,
) : BackboneElement
