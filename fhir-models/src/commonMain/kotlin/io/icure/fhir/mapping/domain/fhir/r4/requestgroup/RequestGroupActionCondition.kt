//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.requestgroup

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
@SerialName("RequestGroupActionCondition")
@Serializable
public data class RequestGroupActionCondition(
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
