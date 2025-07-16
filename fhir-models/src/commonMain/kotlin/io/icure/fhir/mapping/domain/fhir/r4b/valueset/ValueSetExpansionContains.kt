//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.valueset

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Codes in the value set
 *
 * The codes that are contained in the value set expansion.
 *
 * @param id Unique id for inter-element referencing
 * @param system System value for the code
 * @param abstract If user cannot select this entry
 * @param inactive If concept is inactive in the code system
 * @param version Version in which this code/display is defined
 * @param code Code - if blank, this is not a selectable code
 * @param display User display for the concept
 */
@SerialName("ValueSetExpansionContains")
@Serializable
public data class ValueSetExpansionContains(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * System value for the code
   */
  public val system: String? = null,
  /**
   * If user cannot select this entry
   */
  public val `abstract`: Boolean? = null,
  /**
   * If concept is inactive in the code system
   */
  public val inactive: Boolean? = null,
  /**
   * Version in which this code/display is defined
   */
  public val version: String? = null,
  /**
   * Code - if blank, this is not a selectable code
   */
  public val code: String? = null,
  /**
   * User display for the concept
   */
  public val display: String? = null,
  public val designation: List<ValueSetComposeIncludeConceptDesignation> = emptyList(),
  public val contains: List<ValueSetExpansionContains> = emptyList(),
) : BackboneElement
