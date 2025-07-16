//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.appointment

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
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
 * @param period Participation period of the actor
 * @param actor The individual, device, location, or service participating in the appointment
 * @param required The participant is required to attend (optional when false)
 * @param status accepted | declined | tentative | needs-action
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
   * Participation period of the actor
   */
  public val period: Period? = null,
  /**
   * The individual, device, location, or service participating in the appointment
   */
  public val actor: Reference? = null,
  /**
   * The participant is required to attend (optional when false)
   */
  public val required: Boolean? = null,
  /**
   * accepted | declined | tentative | needs-action
   */
  public val status: String? = null,
) : BackboneElement
