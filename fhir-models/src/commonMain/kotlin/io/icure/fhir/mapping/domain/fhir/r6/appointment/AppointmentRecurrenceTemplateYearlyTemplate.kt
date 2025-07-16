//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.appointment

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about yearly recurring appointments
 *
 * Information about yearly recurring appointments.
 *
 * @param id Unique id for inter-element referencing
 * @param yearInterval Recurs every nth year
 */
@SerialName("AppointmentRecurrenceTemplateYearlyTemplate")
@Serializable
public data class AppointmentRecurrenceTemplateYearlyTemplate(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Recurs every nth year
   */
  public val yearInterval: Int? = null,
) : BackboneElement
