//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.appointment

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or
 * device(s) for a specific date/time. This may result in one or more Encounter(s)
 *
 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or
 * device(s) for a specific date/time. This may result in one or more Encounter(s).
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status proposed | pending | booked | arrived | fulfilled | cancelled | noshow |
 * entered-in-error | checked-in | waitlist
 * @param cancelationReason The coded reason for the appointment being cancelled
 * @param appointmentType The style of appointment or patient that has been booked in the slot (not
 * service type)
 * @param priority Used to make informed decisions if needing to re-prioritize
 * @param description Shown on a subject line in a meeting request, or appointment list
 * @param start When appointment is to take place
 * @param end When appointment is to conclude
 * @param minutesDuration Can be less than start/end (e.g. estimate)
 * @param created The date that this appointment was initially created
 * @param comment Additional comments
 * @param patientInstruction Detailed information and instructions for the patient
 */
@SerialName("Appointment")
@Serializable
public data class Appointment(
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
   * proposed | pending | booked | arrived | fulfilled | cancelled | noshow | entered-in-error |
   * checked-in | waitlist
   */
  public val status: String? = null,
  /**
   * The coded reason for the appointment being cancelled
   */
  public val cancelationReason: CodeableConcept? = null,
  public val serviceCategory: List<CodeableConcept> = emptyList(),
  public val serviceType: List<CodeableConcept> = emptyList(),
  public val specialty: List<CodeableConcept> = emptyList(),
  /**
   * The style of appointment or patient that has been booked in the slot (not service type)
   */
  public val appointmentType: CodeableConcept? = null,
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  /**
   * Used to make informed decisions if needing to re-prioritize
   */
  public val priority: Int? = null,
  /**
   * Shown on a subject line in a meeting request, or appointment list
   */
  public val description: String? = null,
  public val supportingInformation: List<Reference> = emptyList(),
  /**
   * When appointment is to take place
   */
  public val start: String? = null,
  /**
   * When appointment is to conclude
   */
  public val end: String? = null,
  /**
   * Can be less than start/end (e.g. estimate)
   */
  public val minutesDuration: Int? = null,
  public val slot: List<Reference> = emptyList(),
  /**
   * The date that this appointment was initially created
   */
  public val created: String? = null,
  /**
   * Additional comments
   */
  public val comment: String? = null,
  /**
   * Detailed information and instructions for the patient
   */
  public val patientInstruction: String? = null,
  public val basedOn: List<Reference> = emptyList(),
  public val participant: List<AppointmentParticipant> = emptyList(),
  public val requestedPeriod: List<Period> = emptyList(),
) : DomainResource
