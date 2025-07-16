//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.plandefinition

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.range.Range
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Target outcome for the goal
 *
 * Indicates what should be done and within what timeframe.
 *
 * @param id Unique id for inter-element referencing
 * @param measure The parameter whose value is to be tracked
 * @param detailQuantity The target value to be achieved
 * @param detailRange The target value to be achieved
 * @param detailCodeableConcept The target value to be achieved
 * @param due Reach goal within
 */
@SerialName("PlanDefinitionGoalTarget")
@Serializable
public data class PlanDefinitionGoalTarget(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The parameter whose value is to be tracked
   */
  public val measure: CodeableConcept? = null,
  /**
   * The target value to be achieved
   */
  public val detailQuantity: Quantity? = null,
  /**
   * The target value to be achieved
   */
  public val detailRange: Range? = null,
  /**
   * The target value to be achieved
   */
  public val detailCodeableConcept: CodeableConcept? = null,
  /**
   * Reach goal within
   */
  public val due: Duration? = null,
) : BackboneElement
