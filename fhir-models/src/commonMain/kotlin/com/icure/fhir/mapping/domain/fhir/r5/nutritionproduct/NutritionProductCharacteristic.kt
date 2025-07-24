//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.nutritionproduct

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specifies descriptive properties of the nutrition product
 *
 * Specifies descriptive properties of the nutrition product.
 *
 * @param id Unique id for inter-element referencing
 * @param type Code specifying the type of characteristic
 * @param valueCodeableConcept The value of the characteristic
 * @param valueString The value of the characteristic
 * @param valueQuantity The value of the characteristic
 * @param valueBase64Binary The value of the characteristic
 * @param valueAttachment The value of the characteristic
 * @param valueBoolean The value of the characteristic
 */
@SerialName("NutritionProductCharacteristic")
@Serializable
public data class NutritionProductCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code specifying the type of characteristic
   */
  public val type: CodeableConcept,
  /**
   * The value of the characteristic
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * The value of the characteristic
   */
  public val valueString: String? = null,
  /**
   * The value of the characteristic
   */
  public val valueQuantity: Quantity? = null,
  /**
   * The value of the characteristic
   */
  public val valueBase64Binary: String? = null,
  /**
   * The value of the characteristic
   */
  public val valueAttachment: Attachment? = null,
  /**
   * The value of the characteristic
   */
  public val valueBoolean: Boolean? = null,
) : BackboneElement
