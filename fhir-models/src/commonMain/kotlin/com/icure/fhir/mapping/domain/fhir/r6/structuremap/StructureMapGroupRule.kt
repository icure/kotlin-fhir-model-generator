//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.structuremap

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Transform Rule from source to target
 *
 * Transform Rule from source to target.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name of the rule for internal references
 * @param documentation Documentation for this instance of data
 */
@SerialName("StructureMapGroupRule")
@Serializable
public data class StructureMapGroupRule(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name of the rule for internal references
   */
  public val name: String? = null,
  public val source: List<StructureMapGroupRuleSource> = emptyList(),
  public val target: List<StructureMapGroupRuleTarget> = emptyList(),
  public val rule: List<StructureMapGroupRule> = emptyList(),
  public val dependent: List<StructureMapGroupRuleDependent> = emptyList(),
  /**
   * Documentation for this instance of data
   */
  public val documentation: String? = null,
) : BackboneElement
