//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.conceptmap

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
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
 * @param valueSet Identifies the set of concepts being mapped
 * @param noMap No mapping to a target concept for this source concept
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
  /**
   * Identifies the set of concepts being mapped
   */
  public val valueSet: String? = null,
  /**
   * No mapping to a target concept for this source concept
   */
  public val noMap: Boolean? = null,
  public val target: List<ConceptMapGroupElementTarget> = emptyList(),
) : BackboneElement
