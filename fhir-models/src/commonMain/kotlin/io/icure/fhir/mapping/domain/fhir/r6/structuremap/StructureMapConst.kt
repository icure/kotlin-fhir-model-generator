//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.structuremap

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Definition of the constant value used in the map rules
 *
 * Definition of a constant value used in the map rules.
 *
 * @param id Unique id for inter-element referencing
 * @param name Constant name
 * @param value FHIRPath exression - value of the constant
 */
@SerialName("StructureMapConst")
@Serializable
public data class StructureMapConst(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Constant name
   */
  public val name: String? = null,
  /**
   * FHIRPath exression - value of the constant
   */
  public val `value`: String? = null,
) : BackboneElement
