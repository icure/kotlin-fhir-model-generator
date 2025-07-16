//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.compartmentdefinition

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
