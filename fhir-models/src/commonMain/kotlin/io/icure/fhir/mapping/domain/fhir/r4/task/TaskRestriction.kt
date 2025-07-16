//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.task

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Constraints on fulfillment tasks
 *
 * If the Task.focus is a request resource and the task is seeking fulfillment (i.e. is asking for
 * the request to be actioned), this element identifies any limitations on what parts of the referenced
 * request should be actioned.
 *
 * @param id Unique id for inter-element referencing
 * @param repetitions How many times to repeat
 * @param period When fulfillment sought
 */
@SerialName("TaskRestriction")
@Serializable
public data class TaskRestriction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * How many times to repeat
   */
  public val repetitions: Int? = null,
  /**
   * When fulfillment sought
   */
  public val period: Period? = null,
  public val recipient: List<Reference> = emptyList(),
) : BackboneElement
