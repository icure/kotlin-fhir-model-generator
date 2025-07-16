//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.nutritionproduct

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
@SerialName("NutritionProductProductCharacteristic")
@Serializable
public data class NutritionProductProductCharacteristic(
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
