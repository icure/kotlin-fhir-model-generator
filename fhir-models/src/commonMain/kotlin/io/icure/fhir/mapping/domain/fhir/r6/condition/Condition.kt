//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.condition

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r6.age.Age
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.range.Range
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param clinicalStatus active | recurrence | relapse | inactive | remission | resolved | unknown
 * @param verificationStatus unconfirmed | provisional | differential | confirmed | refuted |
 * entered-in-error
 * @param severity Subjective severity of condition
 * @param code Identification of the condition, problem or diagnosis
 * @param bodyStructure Anatomical body structure
 * @param subject Who has the condition?
 * @param encounter The Encounter during which this Condition was created
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
 * @param recordedDate Date condition was first recorded
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
   * active | recurrence | relapse | inactive | remission | resolved | unknown
   */
  public val clinicalStatus: CodeableConcept,
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
   * Anatomical body structure
   */
  public val bodyStructure: Reference? = null,
  /**
   * Who has the condition?
   */
  public val subject: Reference,
  /**
   * The Encounter during which this Condition was created
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
   * Date condition was first recorded
   */
  public val recordedDate: String? = null,
  public val participant: List<ConditionParticipant> = emptyList(),
  public val stage: List<ConditionStage> = emptyList(),
  public val evidence: List<CodeableReference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
