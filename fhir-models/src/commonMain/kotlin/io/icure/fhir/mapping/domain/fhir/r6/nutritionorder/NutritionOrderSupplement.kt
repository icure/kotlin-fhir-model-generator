//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.nutritionorder

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Supplement components
 *
 * Oral nutritional products given in order to add further nutritional value to the patient's diet.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of supplement product requested
 * @param productName Product or brand name of the nutritional supplement
 * @param schedule Scheduling information for supplements
 * @param quantity Amount of the nutritional supplement
 * @param instruction Instructions or additional information about the oral supplement
 */
@SerialName("NutritionOrderSupplement")
@Serializable
public data class NutritionOrderSupplement(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of supplement product requested
   */
  public val type: CodeableReference? = null,
  /**
   * Product or brand name of the nutritional supplement
   */
  public val productName: String? = null,
  /**
   * Scheduling information for supplements
   */
  public val schedule: NutritionOrderSupplementSchedule? = null,
  /**
   * Amount of the nutritional supplement
   */
  public val quantity: Quantity? = null,
  /**
   * Instructions or additional information about the oral supplement
   */
  public val instruction: String? = null,
) : BackboneElement
