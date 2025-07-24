//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.plandefinition

import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.range.Range
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
