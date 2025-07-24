//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.valueset

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * SubProperty value for the concept
 *
 * A subproperty value for this concept.
 *
 * @param id Unique id for inter-element referencing
 * @param code Reference to ValueSet.expansion.property.code
 * @param valueCode Value of the subproperty for this concept
 * @param valueCoding Value of the subproperty for this concept
 * @param valueString Value of the subproperty for this concept
 * @param valueInteger Value of the subproperty for this concept
 * @param valueBoolean Value of the subproperty for this concept
 * @param valueDateTime Value of the subproperty for this concept
 * @param valueDecimal Value of the subproperty for this concept
 */
@SerialName("ValueSetExpansionContainsPropertySubProperty")
@Serializable
public data class ValueSetExpansionContainsPropertySubProperty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reference to ValueSet.expansion.property.code
   */
  public val code: String? = null,
  /**
   * Value of the subproperty for this concept
   */
  public val valueCode: String? = null,
  /**
   * Value of the subproperty for this concept
   */
  public val valueCoding: Coding? = null,
  /**
   * Value of the subproperty for this concept
   */
  public val valueString: String? = null,
  /**
   * Value of the subproperty for this concept
   */
  public val valueInteger: Int? = null,
  /**
   * Value of the subproperty for this concept
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Value of the subproperty for this concept
   */
  public val valueDateTime: String? = null,
  /**
   * Value of the subproperty for this concept
   */
  public val valueDecimal: Float? = null,
) : BackboneElement
