//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.encounterhistory

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
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A record of significant events/milestones key data throughout the history of an Encounter
 *
 * A record of significant events/milestones key data throughout the history of an Encounter, often
 * tracked for specific purposes such as billing.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param encounter The Encounter associated with this set of historic values
 * @param status planned | in-progress | on-hold | discharged | completed | cancelled | discontinued
 * | entered-in-error | unknown
 * @param class_fhir Classification of patient encounter
 * @param subject The patient or group related to this encounter
 * @param subjectStatus The current status of the subject in relation to the Encounter
 * @param actualPeriod The actual start and end time associated with this set of values associated
 * with the encounter
 * @param plannedStartDate The planned start date/time (or admission date) of the encounter
 * @param plannedEndDate The planned end date/time (or discharge date) of the encounter
 * @param length Actual quantity of time the encounter lasted (less time absent)
 */
@SerialName("EncounterHistory")
@Serializable
public data class EncounterHistory(
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
  /**
   * The Encounter associated with this set of historic values
   */
  public val encounter: Reference? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * planned | in-progress | on-hold | discharged | completed | cancelled | discontinued |
   * entered-in-error | unknown
   */
  public val status: String? = null,
  /**
   * Classification of patient encounter
   */
  @SerialName("class")
  public val class_fhir: CodeableConcept,
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
  /**
   * The actual start and end time associated with this set of values associated with the encounter
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
  public val location: List<EncounterHistoryLocation> = emptyList(),
) : DomainResource
