//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.nutritionorder

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
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
  public val schedule: List<Timing> = emptyList(),
  public val nutrient: List<NutritionOrderOralDietNutrient> = emptyList(),
  public val texture: List<NutritionOrderOralDietTexture> = emptyList(),
  public val fluidConsistencyType: List<CodeableConcept> = emptyList(),
  /**
   * Instructions or additional information about the oral diet
   */
  public val instruction: String? = null,
) : BackboneElement
