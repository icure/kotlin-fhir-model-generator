//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationadministration

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r6.timing.Timing
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Administration of medication to a patient
 *
 * Describes the event of a patient consuming or otherwise being administered a medication.  This
 * may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie
 * this event to the authorizing prescription, and the specific encounter between patient and health
 * care practitioner.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status in-progress | not-done | on-hold | completed | entered-in-error | stopped | unknown
 * @param medication What was administered
 * @param subject Who received medication
 * @param encounter Encounter administered as part of
 * @param occurenceDateTime Specific date/time or interval of time during which the administration
 * took place (or did not take place)
 * @param occurencePeriod Specific date/time or interval of time during which the administration
 * took place (or did not take place)
 * @param occurenceTiming Specific date/time or interval of time during which the administration
 * took place (or did not take place)
 * @param recorded When the MedicationAdministration was first captured in the subject's record
 * @param isSubPotent Full dose was not administered
 * @param request Request administration performed against
 * @param dosage Details of how medication was taken
 */
@SerialName("MedicationAdministration")
@Serializable
public data class MedicationAdministration(
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
  public val basedOn: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * in-progress | not-done | on-hold | completed | entered-in-error | stopped | unknown
   */
  public val status: String? = null,
  public val statusReason: List<CodeableConcept> = emptyList(),
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * What was administered
   */
  public val medication: CodeableReference,
  /**
   * Who received medication
   */
  public val subject: Reference,
  /**
   * Encounter administered as part of
   */
  public val encounter: Reference? = null,
  public val supportingInformation: List<Reference> = emptyList(),
  /**
   * Specific date/time or interval of time during which the administration took place (or did not
   * take place)
   */
  public val occurenceDateTime: String? = null,
  /**
   * Specific date/time or interval of time during which the administration took place (or did not
   * take place)
   */
  public val occurencePeriod: Period? = null,
  /**
   * Specific date/time or interval of time during which the administration took place (or did not
   * take place)
   */
  public val occurenceTiming: Timing? = null,
  /**
   * When the MedicationAdministration was first captured in the subject's record
   */
  public val recorded: String? = null,
  /**
   * Full dose was not administered
   */
  public val isSubPotent: Boolean? = null,
  public val subPotentReason: List<CodeableConcept> = emptyList(),
  public val performer: List<MedicationAdministrationPerformer> = emptyList(),
  public val reason: List<CodeableReference> = emptyList(),
  /**
   * Request administration performed against
   */
  public val request: Reference? = null,
  public val device: List<CodeableReference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  /**
   * Details of how medication was taken
   */
  public val dosage: MedicationAdministrationDosage? = null,
  public val eventHistory: List<Reference> = emptyList(),
) : DomainResource
