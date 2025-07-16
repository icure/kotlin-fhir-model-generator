//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.structuremap

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Named instance provided when invoking the map
 *
 * A name assigned to an instance of data. The instance must be provided when the mapping is
 * invoked.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name for this instance of data
 * @param type Type for this instance of data
 * @param mode source | target
 * @param documentation Documentation for this instance of data
 */
@SerialName("StructureMapGroupInput")
@Serializable
public data class StructureMapGroupInput(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name for this instance of data
   */
  public val name: String? = null,
  /**
   * Type for this instance of data
   */
  public val type: String? = null,
  /**
   * source | target
   */
  public val mode: String? = null,
  /**
   * Documentation for this instance of data
   */
  public val documentation: String? = null,
) : BackboneElement
