//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.valueset

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional representations for this concept
 *
 * Additional representations for this concept when used in this value set - other languages,
 * aliases, specialized purposes, used for particular purposes, etc.
 *
 * @param id Unique id for inter-element referencing
 * @param language Human language of the designation
 * @param use Types of uses of designations
 * @param value The text value for this designation
 */
@SerialName("ValueSetComposeIncludeConceptDesignation")
@Serializable
public data class ValueSetComposeIncludeConceptDesignation(
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
   * Types of uses of designations
   */
  public val use: Coding? = null,
  public val additionalUse: List<Coding> = emptyList(),
  /**
   * The text value for this designation
   */
  public val `value`: String? = null,
) : BackboneElement
