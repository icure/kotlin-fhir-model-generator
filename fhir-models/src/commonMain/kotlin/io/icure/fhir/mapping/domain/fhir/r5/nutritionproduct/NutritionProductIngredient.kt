//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.nutritionproduct

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.ratio.Ratio
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Ingredients contained in this product
 *
 * Ingredients contained in this product.
 *
 * @param id Unique id for inter-element referencing
 * @param item The ingredient contained in the product
 */
@SerialName("NutritionProductIngredient")
@Serializable
public data class NutritionProductIngredient(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The ingredient contained in the product
   */
  public val item: CodeableReference,
  public val amount: List<Ratio> = emptyList(),
) : BackboneElement
