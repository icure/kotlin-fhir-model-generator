//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.healthcareservice

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Times the Service Site is available
 *
 * A collection of times that the Service Site is available.
 *
 * @param id Unique id for inter-element referencing
 * @param allDay Always available? e.g. 24 hour service
 * @param availableStartTime Opening time of day (ignored if allDay = true)
 * @param availableEndTime Closing time of day (ignored if allDay = true)
 */
@SerialName("HealthcareServiceAvailableTime")
@Serializable
public data class HealthcareServiceAvailableTime(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val daysOfWeek: List<String> = emptyList(),
  /**
   * Always available? e.g. 24 hour service
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
) : BackboneElement
