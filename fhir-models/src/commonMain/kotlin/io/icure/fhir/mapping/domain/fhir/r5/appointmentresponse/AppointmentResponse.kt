//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.appointmentresponse

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or
 * rejection
 *
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or
 * rejection.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param appointment Appointment this response relates to
 * @param proposedNewTime Indicator for a counter proposal
 * @param start Time from appointment, or requested new start time
 * @param end Time from appointment, or requested new end time
 * @param actor Person(s), Location, HealthcareService, or Device
 * @param participantStatus accepted | declined | tentative | needs-action | entered-in-error
 * @param comment Additional comments
 * @param recurring This response is for all occurrences in a recurring request
 * @param occurrenceDate Original date within a recurring request
 * @param recurrenceId The recurrence ID of the specific recurring request
 */
@SerialName("AppointmentResponse")
@Serializable
public data class AppointmentResponse(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Appointment this response relates to
   */
  public val appointment: Reference,
  /**
   * Indicator for a counter proposal
   */
  public val proposedNewTime: Boolean? = null,
  /**
   * Time from appointment, or requested new start time
   */
  public val start: String? = null,
  /**
   * Time from appointment, or requested new end time
   */
  public val end: String? = null,
  public val participantType: List<CodeableConcept> = emptyList(),
  /**
   * Person(s), Location, HealthcareService, or Device
   */
  public val actor: Reference? = null,
  /**
   * accepted | declined | tentative | needs-action | entered-in-error
   */
  public val participantStatus: String? = null,
  /**
   * Additional comments
   */
  public val comment: String? = null,
  /**
   * This response is for all occurrences in a recurring request
   */
  public val recurring: Boolean? = null,
  /**
   * Original date within a recurring request
   */
  public val occurrenceDate: String? = null,
  /**
   * The recurrence ID of the specific recurring request
   */
  public val recurrenceId: Int? = null,
) : DomainResource
