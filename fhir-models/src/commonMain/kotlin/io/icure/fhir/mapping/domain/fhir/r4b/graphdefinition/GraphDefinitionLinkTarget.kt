//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.graphdefinition

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
 * @param type Type of resource this link refers to
 * @param params Criteria for reverse lookup
 * @param profile Profile for the target resource
 */
@SerialName("GraphDefinitionLinkTarget")
@Serializable
public data class GraphDefinitionLinkTarget(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of resource this link refers to
   */
  public val type: String? = null,
  /**
   * Criteria for reverse lookup
   */
  public val params: String? = null,
  /**
   * Profile for the target resource
   */
  public val profile: String? = null,
  public val compartment: List<GraphDefinitionLinkTargetCompartment> = emptyList(),
  public val link: List<GraphDefinitionLink> = emptyList(),
) : BackboneElement
