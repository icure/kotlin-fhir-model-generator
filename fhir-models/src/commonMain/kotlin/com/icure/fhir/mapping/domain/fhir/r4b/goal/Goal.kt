//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.goal

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes the intended objective(s) for a patient, group or organization
 *
 * Describes the intended objective(s) for a patient, group or organization care, for example,
 * weight loss, restoring an activity of daily living, obtaining herd immunity via immunization,
 * meeting a process improvement objective, etc.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param lifecycleStatus proposed | planned | accepted | active | on-hold | completed | cancelled |
 * entered-in-error | rejected
 * @param achievementStatus in-progress | improving | worsening | no-change | achieved | sustaining
 * | not-achieved | no-progress | not-attainable
 * @param priority high-priority | medium-priority | low-priority
 * @param description Code or text describing goal
 * @param subject Who this goal is intended for
 * @param startDate When goal pursuit begins
 * @param startCodeableConcept When goal pursuit begins
 * @param statusDate When goal status took effect
 * @param statusReason Reason for current status
 * @param expressedBy Who's responsible for creating Goal?
 */
@SerialName("Goal")
@Serializable
public data class Goal(
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
   * proposed | planned | accepted | active | on-hold | completed | cancelled | entered-in-error |
   * rejected
   */
  public val lifecycleStatus: String? = null,
  /**
   * in-progress | improving | worsening | no-change | achieved | sustaining | not-achieved |
   * no-progress | not-attainable
   */
  public val achievementStatus: CodeableConcept? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * high-priority | medium-priority | low-priority
   */
  public val priority: CodeableConcept? = null,
  /**
   * Code or text describing goal
   */
  public val description: CodeableConcept,
  /**
   * Who this goal is intended for
   */
  public val subject: Reference,
  /**
   * When goal pursuit begins
   */
  public val startDate: String? = null,
  /**
   * When goal pursuit begins
   */
  public val startCodeableConcept: CodeableConcept? = null,
  public val target: List<GoalTarget> = emptyList(),
  /**
   * When goal status took effect
   */
  public val statusDate: String? = null,
  /**
   * Reason for current status
   */
  public val statusReason: String? = null,
  /**
   * Who's responsible for creating Goal?
   */
  public val expressedBy: Reference? = null,
  public val addresses: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val outcomeCode: List<CodeableConcept> = emptyList(),
  public val outcomeReference: List<Reference> = emptyList(),
) : DomainResource
