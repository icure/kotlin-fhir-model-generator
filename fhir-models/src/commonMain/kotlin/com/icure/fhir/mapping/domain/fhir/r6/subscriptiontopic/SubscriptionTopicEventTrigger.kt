//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.subscriptiontopic

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Event definitions the SubscriptionTopic
 *
 * Event definition which can be used to trigger the SubscriptionTopic.
 *
 * @param id Unique id for inter-element referencing
 * @param description Text representation of the event trigger
 * @param event Event which can trigger a notification from the SubscriptionTopic
 * @param resource Data Type or Resource (reference to definition) for this trigger definition
 */
@SerialName("SubscriptionTopicEventTrigger")
@Serializable
public data class SubscriptionTopicEventTrigger(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Text representation of the event trigger
   */
  public val description: String? = null,
  /**
   * Event which can trigger a notification from the SubscriptionTopic
   */
  public val event: CodeableConcept,
  /**
   * Data Type or Resource (reference to definition) for this trigger definition
   */
  public val resource: String? = null,
) : BackboneElement
