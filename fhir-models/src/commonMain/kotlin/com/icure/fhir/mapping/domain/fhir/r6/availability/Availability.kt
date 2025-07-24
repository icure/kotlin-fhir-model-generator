//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.availability

import com.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Availability data for an {item}
 *
 * Availability data for an {item}, declaring what days/times are available, and any exceptions. The
 * exceptions could be textual only, e.g. Public holidays, or could be time period specific and
 * indicate a specific years dates.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("Availability")
@Serializable
public data class Availability(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  public val availableTime: List<AvailabilityAvailableTime> = emptyList(),
  public val notAvailableTime: List<AvailabilityNotAvailableTime> = emptyList(),
) : DataType
