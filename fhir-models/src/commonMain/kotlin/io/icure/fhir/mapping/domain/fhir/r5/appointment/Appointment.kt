//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.appointment

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r5.virtualservicedetail.VirtualServiceDetail
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

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
 * @param cancellationReason The coded reason for the appointment being cancelled
 * @param appointmentType The style of appointment or patient that has been booked in the slot (not
 * service type)
 * @param priority Used to make informed decisions if needing to re-prioritize
 * @param description Shown on a subject line in a meeting request, or appointment list
 * @param previousAppointment The previous appointment in a series
 * @param originatingAppointment The originating appointment in a recurring set of appointments
 * @param start When appointment is to take place
 * @param end When appointment is to conclude
 * @param minutesDuration Can be less than start/end (e.g. estimate)
 * @param created The date that this appointment was initially created
 * @param cancellationDate When the appointment was cancelled
 * @param subject The patient or group associated with the appointment
 * @param recurrenceId The sequence number in the recurrence
 * @param occurrenceChanged Indicates that this appointment varies from a recurrence pattern
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
  public val cancellationReason: CodeableConcept? = null,
  @JsonNames("class")
  public val class_fhir: List<CodeableConcept> = emptyList(),
  public val serviceCategory: List<CodeableConcept> = emptyList(),
  public val serviceType: List<CodeableReference> = emptyList(),
  public val specialty: List<CodeableConcept> = emptyList(),
  /**
   * The style of appointment or patient that has been booked in the slot (not service type)
   */
  public val appointmentType: CodeableConcept? = null,
  public val reason: List<CodeableReference> = emptyList(),
  /**
   * Used to make informed decisions if needing to re-prioritize
   */
  public val priority: CodeableConcept? = null,
  /**
   * Shown on a subject line in a meeting request, or appointment list
   */
  public val description: String? = null,
  public val replaces: List<Reference> = emptyList(),
  public val virtualService: List<VirtualServiceDetail> = emptyList(),
  public val supportingInformation: List<Reference> = emptyList(),
  /**
   * The previous appointment in a series
   */
  public val previousAppointment: Reference? = null,
  /**
   * The originating appointment in a recurring set of appointments
   */
  public val originatingAppointment: Reference? = null,
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
  public val requestedPeriod: List<Period> = emptyList(),
  public val slot: List<Reference> = emptyList(),
  public val account: List<Reference> = emptyList(),
  /**
   * The date that this appointment was initially created
   */
  public val created: String? = null,
  /**
   * When the appointment was cancelled
   */
  public val cancellationDate: String? = null,
  public val note: List<Annotation> = emptyList(),
  public val patientInstruction: List<CodeableReference> = emptyList(),
  public val basedOn: List<Reference> = emptyList(),
  /**
   * The patient or group associated with the appointment
   */
  public val subject: Reference? = null,
  public val participant: List<AppointmentParticipant> = emptyList(),
  /**
   * The sequence number in the recurrence
   */
  public val recurrenceId: Int? = null,
  /**
   * Indicates that this appointment varies from a recurrence pattern
   */
  public val occurrenceChanged: Boolean? = null,
  public val recurrenceTemplate: List<AppointmentRecurrenceTemplate> = emptyList(),
) : DomainResource
