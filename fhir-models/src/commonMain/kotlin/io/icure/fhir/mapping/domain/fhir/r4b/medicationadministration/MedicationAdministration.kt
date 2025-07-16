//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.medicationadministration

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param category Type of medication usage
 * @param medicationCodeableConcept What was administered
 * @param medicationReference What was administered
 * @param subject Who received medication
 * @param context Encounter or Episode of Care administered as part of
 * @param effectiveDateTime Start and end time of administration
 * @param effectivePeriod Start and end time of administration
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
  public val instantiates: List<String> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * in-progress | not-done | on-hold | completed | entered-in-error | stopped | unknown
   */
  public val status: String? = null,
  public val statusReason: List<CodeableConcept> = emptyList(),
  /**
   * Type of medication usage
   */
  public val category: CodeableConcept? = null,
  /**
   * What was administered
   */
  public val medicationCodeableConcept: CodeableConcept? = null,
  /**
   * What was administered
   */
  public val medicationReference: Reference? = null,
  /**
   * Who received medication
   */
  public val subject: Reference,
  /**
   * Encounter or Episode of Care administered as part of
   */
  public val context: Reference? = null,
  public val supportingInformation: List<Reference> = emptyList(),
  /**
   * Start and end time of administration
   */
  public val effectiveDateTime: String? = null,
  /**
   * Start and end time of administration
   */
  public val effectivePeriod: Period? = null,
  public val performer: List<MedicationAdministrationPerformer> = emptyList(),
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  /**
   * Request administration performed against
   */
  public val request: Reference? = null,
  public val device: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  /**
   * Details of how medication was taken
   */
  public val dosage: MedicationAdministrationDosage? = null,
  public val eventHistory: List<Reference> = emptyList(),
) : DomainResource
