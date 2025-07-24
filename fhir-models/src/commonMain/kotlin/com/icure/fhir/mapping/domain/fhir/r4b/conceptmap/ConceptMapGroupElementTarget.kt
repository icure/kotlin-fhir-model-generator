//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.conceptmap

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
 * @param equivalence relatedto | equivalent | equal | wider | subsumes | narrower | specializes |
 * inexact | unmatched | disjoint
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
   * relatedto | equivalent | equal | wider | subsumes | narrower | specializes | inexact |
   * unmatched | disjoint
   */
  public val equivalence: String? = null,
  /**
   * Description of status/issues in mapping
   */
  public val comment: String? = null,
  public val dependsOn: List<ConceptMapGroupElementTargetDependsOn> = emptyList(),
  public val product: List<ConceptMapGroupElementTargetDependsOn> = emptyList(),
) : BackboneElement
