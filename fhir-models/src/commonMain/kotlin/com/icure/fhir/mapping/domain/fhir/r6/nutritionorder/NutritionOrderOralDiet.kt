//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.nutritionorder

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Oral diet components
 *
 * Diet given orally in contrast to enteral (tube) feeding.
 *
 * @param id Unique id for inter-element referencing
 * @param schedule Scheduling information for oral diets
 * @param instruction Instructions or additional information about the oral diet
 */
@SerialName("NutritionOrderOralDiet")
@Serializable
public data class NutritionOrderOralDiet(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * Scheduling information for oral diets
   */
  public val schedule: NutritionOrderOralDietSchedule? = null,
  public val nutrient: List<NutritionOrderOralDietNutrient> = emptyList(),
  public val texture: List<NutritionOrderOralDietTexture> = emptyList(),
  public val fluidConsistencyType: List<CodeableConcept> = emptyList(),
  /**
   * Instructions or additional information about the oral diet
   */
  public val instruction: String? = null,
) : BackboneElement
