//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.condition

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4.age.Age
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.range.Range
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Detailed information about conditions, problems or diagnoses
 *
 * A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept
 * that has risen to a level of concern.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param clinicalStatus active | recurrence | relapse | inactive | remission | resolved
 * @param verificationStatus unconfirmed | provisional | differential | confirmed | refuted |
 * entered-in-error
 * @param severity Subjective severity of condition
 * @param code Identification of the condition, problem or diagnosis
 * @param subject Who has the condition?
 * @param encounter Encounter created as part of
 * @param onsetDateTime Estimated or actual date,  date-time, or age
 * @param onsetAge Estimated or actual date,  date-time, or age
 * @param onsetPeriod Estimated or actual date,  date-time, or age
 * @param onsetRange Estimated or actual date,  date-time, or age
 * @param onsetString Estimated or actual date,  date-time, or age
 * @param abatementDateTime When in resolution/remission
 * @param abatementAge When in resolution/remission
 * @param abatementPeriod When in resolution/remission
 * @param abatementRange When in resolution/remission
 * @param abatementString When in resolution/remission
 * @param recordedDate Date record was first recorded
 * @param recorder Who recorded the condition
 * @param asserter Person who asserts this condition
 */
@SerialName("Condition")
@Serializable
public data class Condition(
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
   * active | recurrence | relapse | inactive | remission | resolved
   */
  public val clinicalStatus: CodeableConcept? = null,
  /**
   * unconfirmed | provisional | differential | confirmed | refuted | entered-in-error
   */
  public val verificationStatus: CodeableConcept? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Subjective severity of condition
   */
  public val severity: CodeableConcept? = null,
  /**
   * Identification of the condition, problem or diagnosis
   */
  public val code: CodeableConcept? = null,
  public val bodySite: List<CodeableConcept> = emptyList(),
  /**
   * Who has the condition?
   */
  public val subject: Reference,
  /**
   * Encounter created as part of
   */
  public val encounter: Reference? = null,
  /**
   * Estimated or actual date,  date-time, or age
   */
  public val onsetDateTime: String? = null,
  /**
   * Estimated or actual date,  date-time, or age
   */
  public val onsetAge: Age? = null,
  /**
   * Estimated or actual date,  date-time, or age
   */
  public val onsetPeriod: Period? = null,
  /**
   * Estimated or actual date,  date-time, or age
   */
  public val onsetRange: Range? = null,
  /**
   * Estimated or actual date,  date-time, or age
   */
  public val onsetString: String? = null,
  /**
   * When in resolution/remission
   */
  public val abatementDateTime: String? = null,
  /**
   * When in resolution/remission
   */
  public val abatementAge: Age? = null,
  /**
   * When in resolution/remission
   */
  public val abatementPeriod: Period? = null,
  /**
   * When in resolution/remission
   */
  public val abatementRange: Range? = null,
  /**
   * When in resolution/remission
   */
  public val abatementString: String? = null,
  /**
   * Date record was first recorded
   */
  public val recordedDate: String? = null,
  /**
   * Who recorded the condition
   */
  public val recorder: Reference? = null,
  /**
   * Person who asserts this condition
   */
  public val asserter: Reference? = null,
  public val stage: List<ConditionStage> = emptyList(),
  public val evidence: List<ConditionEvidence> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
