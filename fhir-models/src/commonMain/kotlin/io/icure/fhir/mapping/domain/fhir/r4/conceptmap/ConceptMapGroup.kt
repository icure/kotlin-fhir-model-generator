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
 * Same source and target systems
 *
 * A group of mappings that all have the same source and target system.
 *
 * @param id Unique id for inter-element referencing
 * @param source Source system where concepts to be mapped are defined
 * @param sourceVersion Specific version of the  code system
 * @param target Target system that the concepts are to be mapped to
 * @param targetVersion Specific version of the  code system
 * @param unmapped What to do when there is no mapping for the source concept
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
   * Specific version of the  code system
   */
  public val sourceVersion: String? = null,
  /**
   * Target system that the concepts are to be mapped to
   */
  public val target: String? = null,
  /**
   * Specific version of the  code system
   */
  public val targetVersion: String? = null,
  public val element: List<ConceptMapGroupElement> = emptyList(),
  /**
   * What to do when there is no mapping for the source concept
   */
  public val unmapped: ConceptMapGroupUnmapped? = null,
) : BackboneElement
