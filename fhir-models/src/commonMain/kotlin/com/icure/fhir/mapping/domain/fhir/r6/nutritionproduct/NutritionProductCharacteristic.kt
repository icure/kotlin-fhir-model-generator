//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.nutritionproduct

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
