//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.elementdefinition

import com.icure.fhir.mapping.domain.fhir.r5.Element
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Map element to another set of definitions
 *
 * Identifies a concept from an external specification that roughly corresponds to this element.
 *
 * @param id Unique id for inter-element referencing
 * @param identity Reference to mapping declaration
 * @param language Computable language of mapping
 * @param map Details of the mapping
 * @param comment Comments about the mapping or its use
 */
@SerialName("ElementDefinitionMapping")
@Serializable
public data class ElementDefinitionMapping(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Reference to mapping declaration
   */
  public val identity: String? = null,
  /**
   * Computable language of mapping
   */
  public val language: String? = null,
  /**
   * Details of the mapping
   */
  public val map: String? = null,
  /**
   * Comments about the mapping or its use
   */
  public val comment: String? = null,
) : Element
