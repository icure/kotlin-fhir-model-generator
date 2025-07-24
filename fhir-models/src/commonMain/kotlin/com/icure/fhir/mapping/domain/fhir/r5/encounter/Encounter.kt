//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.encounter

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r5.virtualservicedetail.VirtualServiceDetail
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * An interaction during which services are provided to the patient
 *
 * An interaction between a patient and healthcare provider(s) for the purpose of providing
 * healthcare service(s) or assessing the health status of a patient.  Encounter is primarily used to
 * record information about the actual activities that occurred, where Appointment is used to record
 * planned activities.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status planned | in-progress | on-hold | discharged | completed | cancelled | discontinued
 * | entered-in-error | unknown
 * @param priority Indicates the urgency of the encounter
 * @param subject The patient or group related to this encounter
 * @param subjectStatus The current status of the subject in relation to the Encounter
 * @param partOf Another Encounter this encounter is part of
 * @param serviceProvider The organization (facility) responsible for this encounter
 * @param actualPeriod The actual start and end time of the encounter
 * @param plannedStartDate The planned start date/time (or admission date) of the encounter
 * @param plannedEndDate The planned end date/time (or discharge date) of the encounter
 * @param length Actual quantity of time the encounter lasted (less time absent)
 * @param admission Details about the admission to a healthcare service
 */
@SerialName("Encounter")
@Serializable
public data class Encounter(
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
   * planned | in-progress | on-hold | discharged | completed | cancelled | discontinued |
   * entered-in-error | unknown
   */
  public val status: String? = null,
  @JsonNames("class")
  public val class_fhir: List<CodeableConcept> = emptyList(),
  /**
   * Indicates the urgency of the encounter
   */
  public val priority: CodeableConcept? = null,
  public val type: List<CodeableConcept> = emptyList(),
  public val serviceType: List<CodeableReference> = emptyList(),
  /**
   * The patient or group related to this encounter
   */
  public val subject: Reference? = null,
  /**
   * The current status of the subject in relation to the Encounter
   */
  public val subjectStatus: CodeableConcept? = null,
  public val episodeOfCare: List<Reference> = emptyList(),
  public val basedOn: List<Reference> = emptyList(),
  public val careTeam: List<Reference> = emptyList(),
  /**
   * Another Encounter this encounter is part of
   */
  public val partOf: Reference? = null,
  /**
   * The organization (facility) responsible for this encounter
   */
  public val serviceProvider: Reference? = null,
  public val participant: List<EncounterParticipant> = emptyList(),
  public val appointment: List<Reference> = emptyList(),
  public val virtualService: List<VirtualServiceDetail> = emptyList(),
  /**
   * The actual start and end time of the encounter
   */
  public val actualPeriod: Period? = null,
  /**
   * The planned start date/time (or admission date) of the encounter
   */
  public val plannedStartDate: String? = null,
  /**
   * The planned end date/time (or discharge date) of the encounter
   */
  public val plannedEndDate: String? = null,
  /**
   * Actual quantity of time the encounter lasted (less time absent)
   */
  public val length: Duration? = null,
  public val reason: List<EncounterReason> = emptyList(),
  public val diagnosis: List<EncounterDiagnosis> = emptyList(),
  public val account: List<Reference> = emptyList(),
  public val dietPreference: List<CodeableConcept> = emptyList(),
  public val specialArrangement: List<CodeableConcept> = emptyList(),
  public val specialCourtesy: List<CodeableConcept> = emptyList(),
  /**
   * Details about the admission to a healthcare service
   */
  public val admission: EncounterAdmission? = null,
  public val location: List<EncounterLocation> = emptyList(),
) : DomainResource
