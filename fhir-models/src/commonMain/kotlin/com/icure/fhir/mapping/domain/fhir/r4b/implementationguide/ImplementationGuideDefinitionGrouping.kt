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
 * Grouping used to present related resources in the IG
 *
 * A logical group of resources. Logical groups can be used when building pages.
 *
 * @param id Unique id for inter-element referencing
 * @param name Descriptive name for the package
 * @param description Human readable text describing the package
 */
@SerialName("ImplementationGuideDefinitionGrouping")
@Serializable
public data class ImplementationGuideDefinitionGrouping(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Descriptive name for the package
   */
  public val name: String? = null,
  /**
   * Human readable text describing the package
   */
  public val description: String? = null,
) : BackboneElement
