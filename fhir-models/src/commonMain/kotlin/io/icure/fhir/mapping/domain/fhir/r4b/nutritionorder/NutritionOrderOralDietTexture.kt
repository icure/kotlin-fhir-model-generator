//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.nutritionorder

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Required  texture modifications
 *
 * Class that describes any texture modifications required for the patient to safely consume various
 * types of solid foods.
 *
 * @param id Unique id for inter-element referencing
 * @param modifier Code to indicate how to alter the texture of the foods, e.g. pureed
 * @param foodType Concepts that are used to identify an entity that is ingested for nutritional
 * purposes
 */
@SerialName("NutritionOrderOralDietTexture")
@Serializable
public data class NutritionOrderOralDietTexture(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code to indicate how to alter the texture of the foods, e.g. pureed
   */
  public val modifier: CodeableConcept? = null,
  /**
   * Concepts that are used to identify an entity that is ingested for nutritional purposes
   */
  public val foodType: CodeableConcept? = null,
) : BackboneElement
