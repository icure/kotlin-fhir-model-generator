//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.requestgroup

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
