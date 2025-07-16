//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.appointment

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about weekly recurring appointments
 *
 * Information about weekly recurring appointments.
 *
 * @param id Unique id for inter-element referencing
 * @param monday Recurs on Mondays
 * @param tuesday Recurs on Tuesday
 * @param wednesday Recurs on Wednesday
 * @param thursday Recurs on Thursday
 * @param friday Recurs on Friday
 * @param saturday Recurs on Saturday
 * @param sunday Recurs on Sunday
 * @param weekInterval Recurs every nth week
 */
@SerialName("AppointmentRecurrenceTemplateWeeklyTemplate")
@Serializable
public data class AppointmentRecurrenceTemplateWeeklyTemplate(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Recurs on Mondays
   */
  public val monday: Boolean? = null,
  /**
   * Recurs on Tuesday
   */
  public val tuesday: Boolean? = null,
  /**
   * Recurs on Wednesday
   */
  public val wednesday: Boolean? = null,
  /**
   * Recurs on Thursday
   */
  public val thursday: Boolean? = null,
  /**
   * Recurs on Friday
   */
  public val friday: Boolean? = null,
  /**
   * Recurs on Saturday
   */
  public val saturday: Boolean? = null,
  /**
   * Recurs on Sunday
   */
  public val sunday: Boolean? = null,
  /**
   * Recurs every nth week
   */
  public val weekInterval: Int? = null,
) : BackboneElement
