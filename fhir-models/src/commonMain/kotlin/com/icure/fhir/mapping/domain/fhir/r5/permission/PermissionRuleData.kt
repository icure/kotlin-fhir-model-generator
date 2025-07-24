//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.permission

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The selection criteria to identify data that is within scope of this provision
 *
 * A description or definition of which activities are allowed to be done on the data.
 *
 * @param id Unique id for inter-element referencing
 * @param expression Expression identifying the data
 */
@SerialName("PermissionRuleData")
@Serializable
public data class PermissionRuleData(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val resource: List<PermissionRuleDataResource> = emptyList(),
  public val security: List<Coding> = emptyList(),
  public val period: List<Period> = emptyList(),
  /**
   * Expression identifying the data
   */
  public val expression: Expression? = null,
) : BackboneElement
