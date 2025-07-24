//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.nutritionintake

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Total nutrient for the whole meal, product, serving
 *
 * Total nutrient amounts for the whole meal, product, serving, etc.
 *
 * @param id Unique id for inter-element referencing
 * @param nutrient Total nutrient consumed
 * @param amount Total amount of nutrient consumed
 */
@SerialName("NutritionIntakeIngredientLabel")
@Serializable
public data class NutritionIntakeIngredientLabel(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Total nutrient consumed
   */
  public val nutrient: CodeableReference,
  /**
   * Total amount of nutrient consumed
   */
  public val amount: Quantity,
) : BackboneElement
