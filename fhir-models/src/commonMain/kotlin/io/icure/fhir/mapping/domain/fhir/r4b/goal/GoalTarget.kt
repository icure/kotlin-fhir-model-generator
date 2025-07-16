//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.goal

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.range.Range
import io.icure.fhir.mapping.domain.fhir.r4b.ratio.Ratio
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Target outcome for the goal
 *
 * Indicates what should be done by when.
 *
 * @param id Unique id for inter-element referencing
 * @param measure The parameter whose value is being tracked
 * @param detailQuantity The target value to be achieved
 * @param detailRange The target value to be achieved
 * @param detailCodeableConcept The target value to be achieved
 * @param detailString The target value to be achieved
 * @param detailBoolean The target value to be achieved
 * @param detailInteger The target value to be achieved
 * @param detailRatio The target value to be achieved
 * @param dueDate Reach goal on or before
 * @param dueDuration Reach goal on or before
 */
@SerialName("GoalTarget")
@Serializable
public data class GoalTarget(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The parameter whose value is being tracked
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
   * Reach goal on or before
   */
  public val dueDate: String? = null,
  /**
   * Reach goal on or before
   */
  public val dueDuration: Duration? = null,
) : BackboneElement
