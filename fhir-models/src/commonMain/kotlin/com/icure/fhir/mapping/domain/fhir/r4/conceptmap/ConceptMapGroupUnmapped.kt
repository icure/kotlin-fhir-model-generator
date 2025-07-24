//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.conceptmap

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What to do when there is no mapping for the source concept
 *
 * What to do when there is no mapping for the source concept. "Unmapped" does not include codes
 * that are unmatched, and the unmapped element is ignored in a code is specified to have equivalence =
 * unmatched.
 *
 * @param id Unique id for inter-element referencing
 * @param mode provided | fixed | other-map
 * @param code Fixed code when mode = fixed
 * @param display Display for the code
 * @param url canonical reference to an additional ConceptMap to use for mapping if the source
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
   * provided | fixed | other-map
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
   * canonical reference to an additional ConceptMap to use for mapping if the source concept is
   * unmapped
   */
  public val url: String? = null,
) : BackboneElement
