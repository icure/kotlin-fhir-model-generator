//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.codesystem

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional representations for the concept
 *
 * Additional representations for the concept - other languages, aliases, specialized purposes, used
 * for particular purposes, etc.
 *
 * @param id Unique id for inter-element referencing
 * @param language Human language of the designation
 * @param use Details how this designation would be used
 * @param value The text value for this designation
 */
@SerialName("CodeSystemConceptDesignation")
@Serializable
public data class CodeSystemConceptDesignation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Human language of the designation
   */
  public val language: String? = null,
  /**
   * Details how this designation would be used
   */
  public val use: Coding? = null,
  /**
   * The text value for this designation
   */
  public val `value`: String? = null,
) : BackboneElement
