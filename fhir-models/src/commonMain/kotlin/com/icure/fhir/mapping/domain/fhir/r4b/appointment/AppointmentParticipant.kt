//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.appointment

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Participants involved in appointment
 *
 * List of participants involved in the appointment.
 *
 * @param id Unique id for inter-element referencing
 * @param actor Person, Location/HealthcareService or Device
 * @param required required | optional | information-only
 * @param status accepted | declined | tentative | needs-action
 * @param period Participation period of the actor
 */
@SerialName("AppointmentParticipant")
@Serializable
public data class AppointmentParticipant(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * Person, Location/HealthcareService or Device
   */
  public val actor: Reference? = null,
  /**
   * required | optional | information-only
   */
  public val required: String? = null,
  /**
   * accepted | declined | tentative | needs-action
   */
  public val status: String? = null,
  /**
   * Participation period of the actor
   */
  public val period: Period? = null,
) : BackboneElement
