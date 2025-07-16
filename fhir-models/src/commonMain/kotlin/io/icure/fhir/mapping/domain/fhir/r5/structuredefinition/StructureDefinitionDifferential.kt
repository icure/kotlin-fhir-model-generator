//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.structuredefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.elementdefinition.ElementDefinition
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
