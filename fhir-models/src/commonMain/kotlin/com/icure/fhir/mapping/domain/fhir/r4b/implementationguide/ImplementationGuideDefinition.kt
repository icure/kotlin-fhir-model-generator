//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.implementationguide

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information needed to build the IG
 *
 * The information needed by an IG publisher tool to publish the whole implementation guide.
 *
 * @param id Unique id for inter-element referencing
 * @param page Page/Section in the Guide
 */
@SerialName("ImplementationGuideDefinition")
@Serializable
public data class ImplementationGuideDefinition(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val grouping: List<ImplementationGuideDefinitionGrouping> = emptyList(),
  public val resource: List<ImplementationGuideDefinitionResource> = emptyList(),
  /**
   * Page/Section in the Guide
   */
  public val page: ImplementationGuideDefinitionPage? = null,
  public val parameter: List<ImplementationGuideDefinitionParameter> = emptyList(),
  public val template: List<ImplementationGuideDefinitionTemplate> = emptyList(),
) : BackboneElement
