//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.subscriptiontopic

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Query based trigger rule
 *
 * The FHIR query based rules that the server should use to determine when to trigger a notification
 * for this subscription topic.
 *
 * @param id Unique id for inter-element referencing
 * @param previous Rule applied to previous resource state
 * @param resultForCreate test-passes | test-fails
 * @param current Rule applied to current resource state
 * @param resultForDelete test-passes | test-fails
 * @param requireBoth Both must be true flag
 */
@SerialName("SubscriptionTopicResourceTriggerQueryCriteria")
@Serializable
public data class SubscriptionTopicResourceTriggerQueryCriteria(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Rule applied to previous resource state
   */
  public val previous: String? = null,
  /**
   * test-passes | test-fails
   */
  public val resultForCreate: String? = null,
  /**
   * Rule applied to current resource state
   */
  public val current: String? = null,
  /**
   * test-passes | test-fails
   */
  public val resultForDelete: String? = null,
  /**
   * Both must be true flag
   */
  public val requireBoth: Boolean? = null,
) : BackboneElement
