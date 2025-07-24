//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.plandefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Whether or not the action is applicable
 *
 * An expression that describes applicability criteria or start/stop conditions for the action.
 *
 * @param id Unique id for inter-element referencing
 * @param kind applicability | start | stop
 * @param expression Boolean-valued expression
 */
@SerialName("PlanDefinitionActionCondition")
@Serializable
public data class PlanDefinitionActionCondition(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * applicability | start | stop
   */
  public val kind: String? = null,
  /**
   * Boolean-valued expression
   */
  public val expression: Expression? = null,
) : BackboneElement
