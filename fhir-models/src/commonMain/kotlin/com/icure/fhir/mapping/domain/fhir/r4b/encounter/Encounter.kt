//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.encounter

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * An interaction during which services are provided to the patient
 *
 * An interaction between a patient and healthcare provider(s) for the purpose of providing
 * healthcare service(s) or assessing the health status of a patient.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status planned | arrived | triaged | in-progress | onleave | finished | cancelled +
 * @param class_fhir Classification of patient encounter
 * @param serviceType Specific type of service
 * @param priority Indicates the urgency of the encounter
 * @param subject The patient or group present at the encounter
 * @param period The start and end time of the encounter
 * @param length Quantity of time the encounter lasted (less time absent)
 * @param hospitalization Details about the admission to a healthcare service
 * @param serviceProvider The organization (facility) responsible for this encounter
 * @param partOf Another Encounter this encounter is part of
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
   * planned | arrived | triaged | in-progress | onleave | finished | cancelled +
   */
  public val status: String? = null,
  public val statusHistory: List<EncounterStatusHistory> = emptyList(),
  /**
   * Classification of patient encounter
   */
  @JsonNames("class")
  public val class_fhir: Coding,
  public val classHistory: List<EncounterClassHistory> = emptyList(),
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * Specific type of service
   */
  public val serviceType: CodeableConcept? = null,
  /**
   * Indicates the urgency of the encounter
   */
  public val priority: CodeableConcept? = null,
  /**
   * The patient or group present at the encounter
   */
  public val subject: Reference? = null,
  public val episodeOfCare: List<Reference> = emptyList(),
  public val basedOn: List<Reference> = emptyList(),
  public val participant: List<EncounterParticipant> = emptyList(),
  public val appointment: List<Reference> = emptyList(),
  /**
   * The start and end time of the encounter
   */
  public val period: Period? = null,
  /**
   * Quantity of time the encounter lasted (less time absent)
   */
  public val length: Duration? = null,
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  public val diagnosis: List<EncounterDiagnosis> = emptyList(),
  public val account: List<Reference> = emptyList(),
  /**
   * Details about the admission to a healthcare service
   */
  public val hospitalization: EncounterHospitalization? = null,
  public val location: List<EncounterLocation> = emptyList(),
  /**
   * The organization (facility) responsible for this encounter
   */
  public val serviceProvider: Reference? = null,
  /**
   * Another Encounter this encounter is part of
   */
  public val partOf: Reference? = null,
) : DomainResource
