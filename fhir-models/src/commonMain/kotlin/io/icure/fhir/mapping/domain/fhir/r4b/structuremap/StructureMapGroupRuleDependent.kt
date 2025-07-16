//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.structuremap

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
  public val variable: List<String> = emptyList(),
) : BackboneElement
