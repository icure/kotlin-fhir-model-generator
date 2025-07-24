//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.researchstudy

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4.relatedartifact.RelatedArtifact
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Investigation to increase healthcare-related patient-independent knowledge
 *
 * A process where a researcher or organization plans and then executes a series of steps intended
 * to increase the field of healthcare-related knowledge.  This includes studies of safety, efficacy,
 * comparative effectiveness and other information about medications, devices, therapies and other
 * interventional and investigative techniques.  A ResearchStudy involves the gathering of information
 * about human or animal subjects.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param title Name for this study
 * @param status active | administratively-completed | approved | closed-to-accrual |
 * closed-to-accrual-and-intervention | completed | disapproved | in-review |
 * temporarily-closed-to-accrual | temporarily-closed-to-accrual-and-intervention | withdrawn
 * @param primaryPurposeType treatment | prevention | diagnostic | supportive-care | screening |
 * health-services-research | basic-science | device-feasibility
 * @param phase n-a | early-phase-1 | phase-1 | phase-1-phase-2 | phase-2 | phase-2-phase-3 |
 * phase-3 | phase-4
 * @param description What this is study doing
 * @param period When the study began and ended
 * @param sponsor Organization that initiates and is legally responsible for the study
 * @param principalInvestigator Researcher who oversees multiple aspects of the study
 * @param reasonStopped accrual-goal-met | closed-due-to-toxicity |
 * closed-due-to-lack-of-study-progress | temporarily-closed-per-study-design
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
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Name for this study
   */
  public val title: String? = null,
  public val protocol: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * active | administratively-completed | approved | closed-to-accrual |
   * closed-to-accrual-and-intervention | completed | disapproved | in-review |
   * temporarily-closed-to-accrual | temporarily-closed-to-accrual-and-intervention | withdrawn
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
  public val category: List<CodeableConcept> = emptyList(),
  public val focus: List<CodeableConcept> = emptyList(),
  public val condition: List<CodeableConcept> = emptyList(),
  public val contact: List<ContactDetail> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  public val keyword: List<CodeableConcept> = emptyList(),
  public val location: List<CodeableConcept> = emptyList(),
  /**
   * What this is study doing
   */
  public val description: String? = null,
  public val enrollment: List<Reference> = emptyList(),
  /**
   * When the study began and ended
   */
  public val period: Period? = null,
  /**
   * Organization that initiates and is legally responsible for the study
   */
  public val sponsor: Reference? = null,
  /**
   * Researcher who oversees multiple aspects of the study
   */
  public val principalInvestigator: Reference? = null,
  public val site: List<Reference> = emptyList(),
  /**
   * accrual-goal-met | closed-due-to-toxicity | closed-due-to-lack-of-study-progress |
   * temporarily-closed-per-study-design
   */
  public val reasonStopped: CodeableConcept? = null,
  public val note: List<Annotation> = emptyList(),
  public val arm: List<ResearchStudyArm> = emptyList(),
  public val objective: List<ResearchStudyObjective> = emptyList(),
) : DomainResource
