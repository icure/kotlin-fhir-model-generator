//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.availability

import io.icure.fhir.mapping.domain.fhir.r5.Element
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Not available during this time due to provided reason
 *
 * Not available during this time due to provided reason.
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
