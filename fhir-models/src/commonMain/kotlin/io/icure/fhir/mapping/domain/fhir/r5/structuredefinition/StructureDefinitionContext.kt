//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.structuredefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * If an extension, where it can be used in instances
 *
 * Identifies the types of resource or data type elements to which the extension can be applied. For
 * more guidance on using the 'context' element, see the [defining extensions
 * page](defining-extensions.html#context).
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
