//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.conceptmap

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Property value for the source -> target mapping
 *
 * A property value for this source -> target mapping.
 *
 * @param id Unique id for inter-element referencing
 * @param code Reference to ConceptMap.property.code
 * @param valueCoding Value of the property for this concept
 * @param valueString Value of the property for this concept
 * @param valueInteger Value of the property for this concept
 * @param valueBoolean Value of the property for this concept
 * @param valueDateTime Value of the property for this concept
 * @param valueDecimal Value of the property for this concept
 * @param valueCode Value of the property for this concept
 */
@SerialName("ConceptMapGroupElementTargetProperty")
@Serializable
public data class ConceptMapGroupElementTargetProperty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reference to ConceptMap.property.code
   */
  public val code: String? = null,
  /**
   * Value of the property for this concept
   */
  public val valueCoding: Coding? = null,
  /**
   * Value of the property for this concept
   */
  public val valueString: String? = null,
  /**
   * Value of the property for this concept
   */
  public val valueInteger: Int? = null,
  /**
   * Value of the property for this concept
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Value of the property for this concept
   */
  public val valueDateTime: String? = null,
  /**
   * Value of the property for this concept
   */
  public val valueDecimal: Float? = null,
  /**
   * Value of the property for this concept
   */
  public val valueCode: String? = null,
) : BackboneElement
