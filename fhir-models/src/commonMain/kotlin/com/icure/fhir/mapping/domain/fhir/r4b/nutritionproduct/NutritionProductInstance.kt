//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.nutritionproduct

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * One or several physical instances or occurrences of the nutrition product
 *
 * Conveys instance-level information about this product item. One or several physical, countable
 * instances or occurrences of the product.
 *
 * @param id Unique id for inter-element referencing
 * @param quantity The amount of items or instances
 * @param lotNumber The identification of the batch or lot of the product
 * @param expiry The expiry date or date and time for the product
 * @param useBy The date until which the product is expected to be good for consumption
 */
@SerialName("NutritionProductInstance")
@Serializable
public data class NutritionProductInstance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The amount of items or instances
   */
  public val quantity: Quantity? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * The identification of the batch or lot of the product
   */
  public val lotNumber: String? = null,
  /**
   * The expiry date or date and time for the product
   */
  public val expiry: String? = null,
  /**
   * The date until which the product is expected to be good for consumption
   */
  public val useBy: String? = null,
) : BackboneElement
