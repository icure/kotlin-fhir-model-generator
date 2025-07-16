//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.plandefinition

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.range.Range
import io.icure.fhir.mapping.domain.fhir.r5.ratio.Ratio
import kotlin.Boolean
import kotlin.Int
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
 * @param detailString The target value to be achieved
 * @param detailBoolean The target value to be achieved
 * @param detailInteger The target value to be achieved
 * @param detailRatio The target value to be achieved
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
   * The target value to be achieved
   */
  public val detailString: String? = null,
  /**
   * The target value to be achieved
   */
  public val detailBoolean: Boolean? = null,
  /**
   * The target value to be achieved
   */
  public val detailInteger: Int? = null,
  /**
   * The target value to be achieved
   */
  public val detailRatio: Ratio? = null,
  /**
   * Reach goal within
   */
  public val due: Duration? = null,
) : BackboneElement
