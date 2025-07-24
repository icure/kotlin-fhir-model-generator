//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.availability

import com.icure.fhir.mapping.domain.fhir.r6.Element
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Not available during this time due to provided reason
 *
 * The {item} is not available during this period of time due to the provided reason.
 *
 * @param id Unique id for inter-element referencing
 * @param description Reason presented to the user explaining why time not available
 * @param during Service not available during this period
 */
@SerialName("AvailabilityNotAvailableTime")
@Serializable
public data class AvailabilityNotAvailableTime(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Reason presented to the user explaining why time not available
   */
  public val description: String? = null,
  /**
   * Service not available during this period
   */
  public val during: Period? = null,
) : Element
