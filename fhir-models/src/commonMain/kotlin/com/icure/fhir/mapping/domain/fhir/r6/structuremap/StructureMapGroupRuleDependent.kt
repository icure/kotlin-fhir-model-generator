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
 * Which other rules to apply in the context of this rule
 *
 * Which other rules to apply in the context of this rule.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name of a rule or group to apply
 */
@SerialName("StructureMapGroupRuleDependent")
@Serializable
public data class StructureMapGroupRuleDependent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name of a rule or group to apply
   */
  public val name: String? = null,
  public val parameter: List<StructureMapGroupRuleTargetParameter> = emptyList(),
) : BackboneElement
