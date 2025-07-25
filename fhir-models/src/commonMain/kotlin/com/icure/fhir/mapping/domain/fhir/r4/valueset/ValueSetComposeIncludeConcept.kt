//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.valueset

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A concept defined in the system
 *
 * Specifies a concept to be included or excluded.
 *
 * @param id Unique id for inter-element referencing
 * @param code Code or expression from system
 * @param display Text to display for this code for this value set in this valueset
 */
@SerialName("ValueSetComposeIncludeConcept")
@Serializable
public data class ValueSetComposeIncludeConcept(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code or expression from system
   */
  public val code: String? = null,
  /**
   * Text to display for this code for this value set in this valueset
   */
  public val display: String? = null,
  public val designation: List<ValueSetComposeIncludeConceptDesignation> = emptyList(),
) : BackboneElement
