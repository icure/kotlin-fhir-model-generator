//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.graphdefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Potential target for the link
 *
 * Potential target for the link.
 *
 * @param id Unique id for inter-element referencing
 * @param nodeId Internal ID - target for link references
 * @param description Why this node is specified
 * @param type Type of resource this link refers to
 * @param profile Profile for the target resource
 */
@SerialName("GraphDefinitionNode")
@Serializable
public data class GraphDefinitionNode(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Internal ID - target for link references
   */
  public val nodeId: String? = null,
  /**
   * Why this node is specified
   */
  public val description: String? = null,
  /**
   * Type of resource this link refers to
   */
  public val type: String? = null,
  /**
   * Profile for the target resource
   */
  public val profile: String? = null,
) : BackboneElement
