//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.subscriptiontopic

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
