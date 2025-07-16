//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.conceptmap

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Mappings for a concept from the source set
 *
 * Mappings for an individual concept in the source to one or more concepts in the target.
 *
 * @param id Unique id for inter-element referencing
 * @param code Identifies element being mapped
 * @param display Display for the code
 */
@SerialName("ConceptMapGroupElement")
@Serializable
public data class ConceptMapGroupElement(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifies element being mapped
   */
  public val code: String? = null,
  /**
   * Display for the code
   */
  public val display: String? = null,
  public val target: List<ConceptMapGroupElementTarget> = emptyList(),
) : BackboneElement
