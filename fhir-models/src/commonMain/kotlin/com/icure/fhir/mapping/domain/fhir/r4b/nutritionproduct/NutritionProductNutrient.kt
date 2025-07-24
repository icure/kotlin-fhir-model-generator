//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.nutritionproduct

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.ratio.Ratio
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The product's nutritional information expressed by the nutrients
 *
 * The product's nutritional information expressed by the nutrients.
 *
 * @param id Unique id for inter-element referencing
 * @param item The (relevant) nutrients in the product
 */
@SerialName("NutritionProductNutrient")
@Serializable
public data class NutritionProductNutrient(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The (relevant) nutrients in the product
   */
  public val item: CodeableReference? = null,
  public val amount: List<Ratio> = emptyList(),
) : BackboneElement
