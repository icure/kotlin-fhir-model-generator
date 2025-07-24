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
 * Named sections for reader convenience
 *
 * Organizes the mapping into managable chunks for human review/ease of maintenance.
 *
 * @param id Unique id for inter-element referencing
 * @param name Human-readable label
 * @param extends Another group that this group adds rules to
 * @param typeMode types | type-and-types
 * @param documentation Additional description/explanation for group
 */
@SerialName("StructureMapGroup")
@Serializable
public data class StructureMapGroup(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Human-readable label
   */
  public val name: String? = null,
  /**
   * Another group that this group adds rules to
   */
  public val extends: String? = null,
  /**
   * types | type-and-types
   */
  public val typeMode: String? = null,
  /**
   * Additional description/explanation for group
   */
  public val documentation: String? = null,
  public val input: List<StructureMapGroupInput> = emptyList(),
  public val rule: List<StructureMapGroupRule> = emptyList(),
) : BackboneElement
