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
 * Same source and target systems
 *
 * A group of mappings that all have the same source and target system.
 *
 * @param id Unique id for inter-element referencing
 * @param source Source system where concepts to be mapped are defined
 * @param target Target system that the concepts are to be mapped to
 * @param unmapped What to do when there is no mapping target for the source concept and
 * ConceptMap.group.element.noMap is not true
 */
@SerialName("ConceptMapGroup")
@Serializable
public data class ConceptMapGroup(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Source system where concepts to be mapped are defined
   */
  public val source: String? = null,
  /**
   * Target system that the concepts are to be mapped to
   */
  public val target: String? = null,
  public val element: List<ConceptMapGroupElement> = emptyList(),
  /**
   * What to do when there is no mapping target for the source concept and
   * ConceptMap.group.element.noMap is not true
   */
  public val unmapped: ConceptMapGroupUnmapped? = null,
) : BackboneElement
