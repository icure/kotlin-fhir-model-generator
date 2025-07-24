//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.availability

import com.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Availability data for an {item}
 *
 * Availability data for an {item}.
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
