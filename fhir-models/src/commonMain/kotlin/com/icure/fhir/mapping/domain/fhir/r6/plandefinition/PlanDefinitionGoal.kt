//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.plandefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.relatedartifact.RelatedArtifact
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What the plan is trying to accomplish
 *
 * A goal describes an expected outcome that activities within the plan are intended to achieve. For
 * example, weight loss, restoring an activity of daily living, obtaining herd immunity via
 * immunization, meeting a process improvement objective, meeting the acceptance criteria for a test as
 * specified by a quality specification, etc.
 *
 * @param id Unique id for inter-element referencing
 * @param category E.g. Treatment, dietary, behavioral
 * @param description Code or text describing the goal
 * @param priority high-priority | medium-priority | low-priority
 * @param start When goal pursuit begins
 */
@SerialName("PlanDefinitionGoal")
@Serializable
public data class PlanDefinitionGoal(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * E.g. Treatment, dietary, behavioral
   */
  public val category: CodeableConcept? = null,
  /**
   * Code or text describing the goal
   */
  public val description: CodeableConcept,
  /**
   * high-priority | medium-priority | low-priority
   */
  public val priority: CodeableConcept? = null,
  /**
   * When goal pursuit begins
   */
  public val start: CodeableConcept? = null,
  public val addresses: List<CodeableConcept> = emptyList(),
  public val documentation: List<RelatedArtifact> = emptyList(),
  public val target: List<PlanDefinitionGoalTarget> = emptyList(),
) : BackboneElement
