//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.availability

import io.icure.fhir.mapping.domain.fhir.r5.Element
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Times the {item} is available
 *
 * Times the {item} is available.
 *
 * @param id Unique id for inter-element referencing
 * @param allDay Always available? i.e. 24 hour service
 * @param availableStartTime Opening time of day (ignored if allDay = true)
 * @param availableEndTime Closing time of day (ignored if allDay = true)
 */
@SerialName("AvailabilityAvailableTime")
@Serializable
public data class AvailabilityAvailableTime(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  public val daysOfWeek: List<String> = emptyList(),
  /**
   * Always available? i.e. 24 hour service
   */
  public val allDay: Boolean? = null,
  /**
   * Opening time of day (ignored if allDay = true)
   */
  public val availableStartTime: String? = null,
  /**
   * Closing time of day (ignored if allDay = true)
   */
  public val availableEndTime: String? = null,
) : Element
