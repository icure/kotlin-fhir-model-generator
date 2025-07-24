//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.structuredefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.elementdefinition.ElementDefinition
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Differential view of the structure
 *
 * A differential view is expressed relative to the base StructureDefinition - a statement of
 * differences that it applies.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("StructureDefinitionDifferential")
@Serializable
public data class StructureDefinitionDifferential(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val element: List<ElementDefinition> = emptyList(),
) : BackboneElement
