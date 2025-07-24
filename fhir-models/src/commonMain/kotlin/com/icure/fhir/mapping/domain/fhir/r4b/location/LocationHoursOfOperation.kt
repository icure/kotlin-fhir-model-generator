//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.location

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What days/times during a week is this location usually open
 *
 * What days/times during a week is this location usually open.
 *
 * @param id Unique id for inter-element referencing
 * @param allDay The Location is open all day
 * @param openingTime Time that the Location opens
 * @param closingTime Time that the Location closes
 */
@SerialName("LocationHoursOfOperation")
@Serializable
public data class LocationHoursOfOperation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val daysOfWeek: List<String> = emptyList(),
  /**
   * The Location is open all day
   */
  public val allDay: Boolean? = null,
  /**
   * Time that the Location opens
   */
  public val openingTime: String? = null,
  /**
   * Time that the Location closes
   */
  public val closingTime: String? = null,
) : BackboneElement
