//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.nutritionorder

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
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
  public val type: CodeableConcept? = null,
  /**
   * Product or brand name of the nutritional supplement
   */
  public val productName: String? = null,
  public val schedule: List<Timing> = emptyList(),
  /**
   * Amount of the nutritional supplement
   */
  public val quantity: Quantity? = null,
  /**
   * Instructions or additional information about the oral supplement
   */
  public val instruction: String? = null,
) : BackboneElement
