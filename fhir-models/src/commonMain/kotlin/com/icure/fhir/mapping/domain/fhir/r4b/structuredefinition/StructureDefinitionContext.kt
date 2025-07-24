//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.structuredefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * If an extension, where it can be used in instances
 *
 * Identifies the types of resource or data type elements to which the extension can be applied.
 *
 * @param id Unique id for inter-element referencing
 * @param type fhirpath | element | extension
 * @param expression Where the extension can be used in instances
 */
@SerialName("StructureDefinitionContext")
@Serializable
public data class StructureDefinitionContext(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * fhirpath | element | extension
   */
  public val type: String? = null,
  /**
   * Where the extension can be used in instances
   */
  public val expression: String? = null,
) : BackboneElement
