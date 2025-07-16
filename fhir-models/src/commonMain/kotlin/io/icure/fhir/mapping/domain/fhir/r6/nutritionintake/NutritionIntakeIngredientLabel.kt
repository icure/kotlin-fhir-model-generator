//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.nutritionintake

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
