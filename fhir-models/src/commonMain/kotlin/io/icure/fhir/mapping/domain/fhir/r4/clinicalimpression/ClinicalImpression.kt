//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.clinicalimpression

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A clinical assessment performed when planning treatments and management strategies for a patient
 *
 * A record of a clinical assessment performed to determine what problem(s) may affect the patient
 * and before planning the treatments or management strategies that are best to manage a patient's
 * condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies
 * greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than
 * "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status in-progress | completed | entered-in-error
 * @param statusReason Reason for current status
 * @param code Kind of assessment performed
 * @param description Why/how the assessment was performed
 * @param subject Patient or group assessed
 * @param encounter Encounter created as part of
 * @param effectiveDateTime Time of assessment
 * @param effectivePeriod Time of assessment
 * @param date When the assessment was documented
 * @param assessor The clinician performing the assessment
 * @param previous Reference to last assessment
 * @param summary Summary of the assessment
 */
@SerialName("ClinicalImpression")
@Serializable
public data class ClinicalImpression(
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
   * in-progress | completed | entered-in-error
   */
  public val status: String? = null,
  /**
   * Reason for current status
   */
  public val statusReason: CodeableConcept? = null,
  /**
   * Kind of assessment performed
   */
  public val code: CodeableConcept? = null,
  /**
   * Why/how the assessment was performed
   */
  public val description: String? = null,
  /**
   * Patient or group assessed
   */
  public val subject: Reference,
  /**
   * Encounter created as part of
   */
  public val encounter: Reference? = null,
  /**
   * Time of assessment
   */
  public val effectiveDateTime: String? = null,
  /**
   * Time of assessment
   */
  public val effectivePeriod: Period? = null,
  /**
   * When the assessment was documented
   */
  public val date: String? = null,
  /**
   * The clinician performing the assessment
   */
  public val assessor: Reference? = null,
  /**
   * Reference to last assessment
   */
  public val previous: Reference? = null,
  public val problem: List<Reference> = emptyList(),
  public val investigation: List<ClinicalImpressionInvestigation> = emptyList(),
  public val protocol: List<String> = emptyList(),
  /**
   * Summary of the assessment
   */
  public val summary: String? = null,
  public val finding: List<ClinicalImpressionFinding> = emptyList(),
  public val prognosisCodeableConcept: List<CodeableConcept> = emptyList(),
  public val prognosisReference: List<Reference> = emptyList(),
  public val supportingInfo: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
