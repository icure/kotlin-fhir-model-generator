//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.nutritionorder

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Components to add to the feeding
 *
 * Indicates modular components to be provided in addition or mixed with the base formula.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of modular component to add to the feeding
 * @param productName Product or brand name of the modular additive
 * @param quantity Amount of additive to be given or mixed in
 */
@SerialName("NutritionOrderEnteralFormulaAdditive")
@Serializable
public data class NutritionOrderEnteralFormulaAdditive(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of modular component to add to the feeding
   */
  public val type: CodeableReference? = null,
  /**
   * Product or brand name of the modular additive
   */
  public val productName: String? = null,
  /**
   * Amount of additive to be given or mixed in
   */
  public val quantity: Quantity? = null,
) : BackboneElement
