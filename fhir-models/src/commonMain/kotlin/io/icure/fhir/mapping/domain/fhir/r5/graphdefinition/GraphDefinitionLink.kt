//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.graphdefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
 * @param description Why this link is specified
 * @param min Minimum occurrences for this link
 * @param max Maximum occurrences for this link
 * @param sourceId Source Node for this link
 * @param path Path in the resource that contains the link
 * @param sliceName Which slice (if profiled)
 * @param targetId Target Node for this link
 * @param params Criteria for reverse lookup
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
   * Why this link is specified
   */
  public val description: String? = null,
  /**
   * Minimum occurrences for this link
   */
  public val min: Int? = null,
  /**
   * Maximum occurrences for this link
   */
  public val max: String? = null,
  /**
   * Source Node for this link
   */
  public val sourceId: String? = null,
  /**
   * Path in the resource that contains the link
   */
  public val path: String? = null,
  /**
   * Which slice (if profiled)
   */
  public val sliceName: String? = null,
  /**
   * Target Node for this link
   */
  public val targetId: String? = null,
  /**
   * Criteria for reverse lookup
   */
  public val params: String? = null,
  public val compartment: List<GraphDefinitionLinkCompartment> = emptyList(),
) : BackboneElement
