//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.practitionerrole

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Times the Service Site is available
 *
 * A collection of times the practitioner is available or performing this role at the location
 * and/or healthcareservice.
 *
 * @param id Unique id for inter-element referencing
 * @param allDay Always available? e.g. 24 hour service
 * @param availableStartTime Opening time of day (ignored if allDay = true)
 * @param availableEndTime Closing time of day (ignored if allDay = true)
 */
@SerialName("PractitionerRoleAvailableTime")
@Serializable
public data class PractitionerRoleAvailableTime(
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
