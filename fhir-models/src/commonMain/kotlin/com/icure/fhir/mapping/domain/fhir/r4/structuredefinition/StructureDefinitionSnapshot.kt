//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.structuredefinition

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.elementdefinition.ElementDefinition
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Snapshot view of the structure
 *
 * A snapshot view is expressed in a standalone form that can be used and interpreted without
 * considering the base StructureDefinition.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("StructureDefinitionSnapshot")
@Serializable
public data class StructureDefinitionSnapshot(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val element: List<ElementDefinition> = emptyList(),
) : BackboneElement
