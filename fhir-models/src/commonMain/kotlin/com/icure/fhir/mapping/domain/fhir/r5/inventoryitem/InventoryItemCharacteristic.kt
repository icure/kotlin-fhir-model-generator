//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.inventoryitem

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.address.Address
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import com.icure.fhir.mapping.domain.fhir.r5.ratio.Ratio
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Characteristic of the item
 *
 * The descriptive or identifying characteristics of the item.
 *
 * @param id Unique id for inter-element referencing
 * @param characteristicType The characteristic that is being defined
 * @param valueString The value of the attribute
 * @param valueInteger The value of the attribute
 * @param valueDecimal The value of the attribute
 * @param valueBoolean The value of the attribute
 * @param valueUrl The value of the attribute
 * @param valueDateTime The value of the attribute
 * @param valueQuantity The value of the attribute
 * @param valueRange The value of the attribute
 * @param valueRatio The value of the attribute
 * @param valueAnnotation The value of the attribute
 * @param valueAddress The value of the attribute
 * @param valueDuration The value of the attribute
 * @param valueCodeableConcept The value of the attribute
 */
@SerialName("InventoryItemCharacteristic")
@Serializable
public data class InventoryItemCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The characteristic that is being defined
   */
  public val characteristicType: CodeableConcept,
  /**
   * The value of the attribute
   */
  public val valueString: String? = null,
  /**
   * The value of the attribute
   */
  public val valueInteger: Int? = null,
  /**
   * The value of the attribute
   */
  public val valueDecimal: Float? = null,
  /**
   * The value of the attribute
   */
  public val valueBoolean: Boolean? = null,
  /**
   * The value of the attribute
   */
  public val valueUrl: String? = null,
  /**
   * The value of the attribute
   */
  public val valueDateTime: String? = null,
  /**
   * The value of the attribute
   */
  public val valueQuantity: Quantity? = null,
  /**
   * The value of the attribute
   */
  public val valueRange: Range? = null,
  /**
   * The value of the attribute
   */
  public val valueRatio: Ratio? = null,
  /**
   * The value of the attribute
   */
  public val valueAnnotation: Annotation? = null,
  /**
   * The value of the attribute
   */
  public val valueAddress: Address? = null,
  /**
   * The value of the attribute
   */
  public val valueDuration: Duration? = null,
  /**
   * The value of the attribute
   */
  public val valueCodeableConcept: CodeableConcept? = null,
) : BackboneElement
