//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.clinicalimpression

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param status preparation | in-progress | not-done | on-hold | stopped | completed |
 * entered-in-error | unknown
 * @param statusReason Reason for current status
 * @param description Why/how the assessment was performed
 * @param subject Patient or group assessed
 * @param encounter The Encounter during which this ClinicalImpression was created
 * @param effectiveDateTime Time of assessment
 * @param effectivePeriod Time of assessment
 * @param date When the assessment was documented
 * @param performer The clinician performing the assessment
 * @param previous Reference to last assessment
 * @param changePattern Change in the status/pattern of a subject's condition since previously
 * assessed, such as worsening, improving, or no change
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
   * preparation | in-progress | not-done | on-hold | stopped | completed | entered-in-error |
   * unknown
   */
  public val status: String? = null,
  /**
   * Reason for current status
   */
  public val statusReason: CodeableConcept? = null,
  /**
   * Why/how the assessment was performed
   */
  public val description: String? = null,
  /**
   * Patient or group assessed
   */
  public val subject: Reference,
  /**
   * The Encounter during which this ClinicalImpression was created
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
  public val performer: Reference? = null,
  /**
   * Reference to last assessment
   */
  public val previous: Reference? = null,
  public val problem: List<Reference> = emptyList(),
  /**
   * Change in the status/pattern of a subject's condition since previously assessed, such as
   * worsening, improving, or no change
   */
  public val changePattern: CodeableConcept? = null,
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
