//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.appointment

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the recurrence pattern/template used to generate occurrences
 *
 * The details of the recurrence pattern or template that is used to generate recurring
 * appointments.
 *
 * @param id Unique id for inter-element referencing
 * @param timezone The timezone of the occurrences
 * @param recurrenceType The frequency of the recurrence
 * @param lastOccurrenceDate The date when the recurrence should end
 * @param occurrenceCount The number of planned occurrences
 * @param weeklyTemplate Information about weekly recurring appointments
 * @param monthlyTemplate Information about monthly recurring appointments
 * @param yearlyTemplate Information about yearly recurring appointments
 */
@SerialName("AppointmentRecurrenceTemplate")
@Serializable
public data class AppointmentRecurrenceTemplate(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The timezone of the occurrences
   */
  public val timezone: CodeableConcept? = null,
  /**
   * The frequency of the recurrence
   */
  public val recurrenceType: CodeableConcept,
  /**
   * The date when the recurrence should end
   */
  public val lastOccurrenceDate: String? = null,
  /**
   * The number of planned occurrences
   */
  public val occurrenceCount: Int? = null,
  public val occurrenceDate: List<String> = emptyList(),
  /**
   * Information about weekly recurring appointments
   */
  public val weeklyTemplate: AppointmentRecurrenceTemplateWeeklyTemplate? = null,
  /**
   * Information about monthly recurring appointments
   */
  public val monthlyTemplate: AppointmentRecurrenceTemplateMonthlyTemplate? = null,
  /**
   * Information about yearly recurring appointments
   */
  public val yearlyTemplate: AppointmentRecurrenceTemplateYearlyTemplate? = null,
  public val excludingDate: List<String> = emptyList(),
  public val excludingRecurrenceId: List<Int> = emptyList(),
) : BackboneElement
