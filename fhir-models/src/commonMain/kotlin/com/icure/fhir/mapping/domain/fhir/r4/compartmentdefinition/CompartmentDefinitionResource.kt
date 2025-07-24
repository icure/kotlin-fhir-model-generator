//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.compartmentdefinition

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * How a resource is related to the compartment
 *
 * Information about how a resource is related to the compartment.
 *
 * @param id Unique id for inter-element referencing
 * @param code Name of resource type
 * @param documentation Additional documentation about the resource and compartment
 */
@SerialName("CompartmentDefinitionResource")
@Serializable
public data class CompartmentDefinitionResource(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name of resource type
   */
  public val code: String? = null,
  public val `param`: List<String> = emptyList(),
  /**
   * Additional documentation about the resource and compartment
   */
  public val documentation: String? = null,
) : BackboneElement
