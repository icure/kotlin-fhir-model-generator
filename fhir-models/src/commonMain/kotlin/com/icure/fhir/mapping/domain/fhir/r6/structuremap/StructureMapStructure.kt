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
 * Structure Definition used by this map
 *
 * A structure definition used by this map. The structure definition may describe instances that are
 * converted, or the instances that are produced.
 *
 * @param id Unique id for inter-element referencing
 * @param url Canonical reference to structure definition
 * @param mode source | queried | target | produced
 * @param alias Name for type in this map
 * @param documentation Documentation on use of structure
 */
@SerialName("StructureMapStructure")
@Serializable
public data class StructureMapStructure(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Canonical reference to structure definition
   */
  public val url: String? = null,
  /**
   * source | queried | target | produced
   */
  public val mode: String? = null,
  /**
   * Name for type in this map
   */
  public val alias: String? = null,
  /**
   * Documentation on use of structure
   */
  public val documentation: String? = null,
) : BackboneElement
