//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.graphdefinition

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Links this graph makes rules about
 *
 * Links this graph makes rules about.
 *
 * @param id Unique id for inter-element referencing
 * @param path Path in the resource that contains the link
 * @param sliceName Which slice (if profiled)
 * @param min Minimum occurrences for this link
 * @param max Maximum occurrences for this link
 * @param description Why this link is specified
 */
@SerialName("GraphDefinitionLink")
@Serializable
public data class GraphDefinitionLink(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Path in the resource that contains the link
   */
  public val path: String? = null,
  /**
   * Which slice (if profiled)
   */
  public val sliceName: String? = null,
  /**
   * Minimum occurrences for this link
   */
  public val min: Int? = null,
  /**
   * Maximum occurrences for this link
   */
  public val max: String? = null,
  /**
   * Why this link is specified
   */
  public val description: String? = null,
  public val target: List<GraphDefinitionLinkTarget> = emptyList(),
) : BackboneElement
