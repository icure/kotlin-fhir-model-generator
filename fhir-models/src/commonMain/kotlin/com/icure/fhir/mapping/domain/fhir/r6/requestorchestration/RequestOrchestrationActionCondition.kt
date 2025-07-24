//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.requestorchestration

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Whether or not the action is applicable
 *
 * An expression that describes applicability criteria, or start/stop conditions for the action.
 *
 * @param id Unique id for inter-element referencing
 * @param kind applicability | start | stop
 * @param expression Boolean-valued expression
 */
@SerialName("RequestOrchestrationActionCondition")
@Serializable
public data class RequestOrchestrationActionCondition(
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
