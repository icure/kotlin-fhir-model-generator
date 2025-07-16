//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.researchstudy

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
import io.icure.fhir.mapping.domain.fhir.r5.relatedartifact.RelatedArtifact
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Investigation to increase healthcare-related patient-independent knowledge
 *
 * A scientific study of nature that sometimes includes processes involved in health and disease.
 * For example, clinical trials are research studies that involve people. These studies may be related
 * to new ways to screen, prevent, diagnose, and treat disease. They may also study certain outcomes
 * and certain groups of people by looking at data collected in the past or future.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this study resource
 * @param version The business version for the study record
 * @param name Name for this study (computer friendly)
 * @param title Human readable name of the study
 * @param date Date the resource last changed
 * @param status draft | active | retired | unknown
 * @param primaryPurposeType treatment | prevention | diagnostic | supportive-care | screening |
 * health-services-research | basic-science | device-feasibility
 * @param phase n-a | early-phase-1 | phase-1 | phase-1-phase-2 | phase-2 | phase-2-phase-3 |
 * phase-3 | phase-4
 * @param descriptionSummary Brief text explaining the study
 * @param description Detailed narrative of the study
 * @param period When the study began and ended
 * @param whyStopped accrual-goal-met | closed-due-to-toxicity |
 * closed-due-to-lack-of-study-progress | temporarily-closed-per-study-design
 * @param recruitment Target or actual group of participants enrolled in study
 */
@SerialName("ResearchStudy")
@Serializable
public data class ResearchStudy(
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
   * Canonical identifier for this study resource
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * The business version for the study record
   */
  public val version: String? = null,
  /**
   * Name for this study (computer friendly)
   */
  public val name: String? = null,
  /**
   * Human readable name of the study
   */
  public val title: String? = null,
  public val label: List<ResearchStudyLabel> = emptyList(),
  public val protocol: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  /**
   * Date the resource last changed
   */
  public val date: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * treatment | prevention | diagnostic | supportive-care | screening | health-services-research |
   * basic-science | device-feasibility
   */
  public val primaryPurposeType: CodeableConcept? = null,
  /**
   * n-a | early-phase-1 | phase-1 | phase-1-phase-2 | phase-2 | phase-2-phase-3 | phase-3 | phase-4
   */
  public val phase: CodeableConcept? = null,
  public val studyDesign: List<CodeableConcept> = emptyList(),
  public val focus: List<CodeableReference> = emptyList(),
  public val condition: List<CodeableConcept> = emptyList(),
  public val keyword: List<CodeableConcept> = emptyList(),
  public val region: List<CodeableConcept> = emptyList(),
  /**
   * Brief text explaining the study
   */
  public val descriptionSummary: String? = null,
  /**
   * Detailed narrative of the study
   */
  public val description: String? = null,
  /**
   * When the study began and ended
   */
  public val period: Period? = null,
  public val site: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val classifier: List<CodeableConcept> = emptyList(),
  public val associatedParty: List<ResearchStudyAssociatedParty> = emptyList(),
  public val progressStatus: List<ResearchStudyProgressStatus> = emptyList(),
  /**
   * accrual-goal-met | closed-due-to-toxicity | closed-due-to-lack-of-study-progress |
   * temporarily-closed-per-study-design
   */
  public val whyStopped: CodeableConcept? = null,
  /**
   * Target or actual group of participants enrolled in study
   */
  public val recruitment: ResearchStudyRecruitment? = null,
  public val comparisonGroup: List<ResearchStudyComparisonGroup> = emptyList(),
  public val objective: List<ResearchStudyObjective> = emptyList(),
  public val outcomeMeasure: List<ResearchStudyOutcomeMeasure> = emptyList(),
  public val result: List<Reference> = emptyList(),
) : DomainResource
