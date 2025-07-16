//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.nutritionorder

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Required  nutrient modifications
 *
 * Class that defines the quantity and type of nutrient modifications (for example carbohydrate,
 * fiber or sodium) required for the oral diet.
 *
 * @param id Unique id for inter-element referencing
 * @param modifier Type of nutrient that is being modified
 * @param amount Quantity of the specified nutrient
 */
@SerialName("NutritionOrderOralDietNutrient")
@Serializable
public data class NutritionOrderOralDietNutrient(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of nutrient that is being modified
   */
  public val modifier: CodeableConcept? = null,
  /**
   * Quantity of the specified nutrient
   */
  public val amount: Quantity? = null,
) : BackboneElement
