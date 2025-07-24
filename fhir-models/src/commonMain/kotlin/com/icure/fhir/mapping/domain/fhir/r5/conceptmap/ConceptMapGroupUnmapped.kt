//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.conceptmap

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What to do when there is no mapping target for the source concept and
 * ConceptMap.group.element.noMap is not true
 *
 * What to do when there is no mapping to a target concept from the source concept and
 * ConceptMap.group.element.noMap is not true. This provides the "default" to be applied when there is
 * no target concept mapping specified or the expansion of ConceptMap.group.element.target.valueSet is
 * empty.
 *
 * @param id Unique id for inter-element referencing
 * @param mode use-source-code | fixed | other-map
 * @param code Fixed code when mode = fixed
 * @param display Display for the code
 * @param valueSet Fixed code set when mode = fixed
 * @param relationship related-to | equivalent | source-is-narrower-than-target |
 * source-is-broader-than-target | not-related-to
 * @param otherMap canonical reference to an additional ConceptMap to use for mapping if the source
 * concept is unmapped
 */
@SerialName("ConceptMapGroupUnmapped")
@Serializable
public data class ConceptMapGroupUnmapped(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * use-source-code | fixed | other-map
   */
  public val mode: String? = null,
  /**
   * Fixed code when mode = fixed
   */
  public val code: String? = null,
  /**
   * Display for the code
   */
  public val display: String? = null,
  /**
   * Fixed code set when mode = fixed
   */
  public val valueSet: String? = null,
  /**
   * related-to | equivalent | source-is-narrower-than-target | source-is-broader-than-target |
   * not-related-to
   */
  public val relationship: String? = null,
  /**
   * canonical reference to an additional ConceptMap to use for mapping if the source concept is
   * unmapped
   */
  public val otherMap: String? = null,
) : BackboneElement
