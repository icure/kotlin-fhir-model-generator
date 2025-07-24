//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.appointment

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about monthly recurring appointments
 *
 * Information about monthly recurring appointments.
 *
 * @param id Unique id for inter-element referencing
 * @param dayOfMonth Recurs on a specific day of the month
 * @param nthWeekOfMonth Indicates which week of the month the appointment should occur
 * @param dayOfWeek Indicates which day of the week the appointment should occur
 * @param monthInterval Recurs every nth month
 */
@SerialName("AppointmentRecurrenceTemplateMonthlyTemplate")
@Serializable
public data class AppointmentRecurrenceTemplateMonthlyTemplate(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Recurs on a specific day of the month
   */
  public val dayOfMonth: Int? = null,
  /**
   * Indicates which week of the month the appointment should occur
   */
  public val nthWeekOfMonth: Coding? = null,
  /**
   * Indicates which day of the week the appointment should occur
   */
  public val dayOfWeek: Coding? = null,
  /**
   * Recurs every nth month
   */
  public val monthInterval: Int? = null,
) : BackboneElement
