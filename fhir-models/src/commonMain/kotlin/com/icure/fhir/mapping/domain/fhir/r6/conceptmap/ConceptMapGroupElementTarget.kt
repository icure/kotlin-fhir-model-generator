//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.conceptmap

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Concept in target system for element
 *
 * A concept from the target value set that this concept maps to.
 *
 * @param id Unique id for inter-element referencing
 * @param code Code that identifies the target element
 * @param display Display for the code
 * @param valueSet Identifies the set of target concepts
 * @param relationship related-to | equivalent | source-is-narrower-than-target |
 * source-is-broader-than-target | not-related-to
 * @param comment Description of status/issues in mapping
 */
@SerialName("ConceptMapGroupElementTarget")
@Serializable
public data class ConceptMapGroupElementTarget(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code that identifies the target element
   */
  public val code: String? = null,
  /**
   * Display for the code
   */
  public val display: String? = null,
  /**
   * Identifies the set of target concepts
   */
  public val valueSet: String? = null,
  /**
   * related-to | equivalent | source-is-narrower-than-target | source-is-broader-than-target |
   * not-related-to
   */
  public val relationship: String? = null,
  /**
   * Description of status/issues in mapping
   */
  public val comment: String? = null,
  public val `property`: List<ConceptMapGroupElementTargetProperty> = emptyList(),
  public val dependsOn: List<ConceptMapGroupElementTargetDependsOn> = emptyList(),
  public val product: List<ConceptMapGroupElementTargetDependsOn> = emptyList(),
) : BackboneElement
