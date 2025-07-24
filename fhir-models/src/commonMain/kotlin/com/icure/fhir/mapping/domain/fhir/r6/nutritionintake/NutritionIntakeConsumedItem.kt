//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.nutritionintake

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.timing.Timing
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What food or fluid product or item was consumed
 *
 * What food or fluid product or item was consumed.
 *
 * @param id Unique id for inter-element referencing
 * @param type The type of food or fluid product
 * @param nutritionProduct Code that identifies the food or fluid product that was consumed
 * @param schedule Scheduled frequency of consumption
 * @param amount Quantity of the specified food
 * @param rate Rate at which enteral feeding was administered
 * @param notConsumed Flag to indicate if the food or fluid item was refused or otherwise not
 * consumed
 * @param notConsumedReason Reason food or fluid was not consumed
 */
@SerialName("NutritionIntakeConsumedItem")
@Serializable
public data class NutritionIntakeConsumedItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of food or fluid product
   */
  public val type: CodeableConcept,
  /**
   * Code that identifies the food or fluid product that was consumed
   */
  public val nutritionProduct: CodeableReference,
  /**
   * Scheduled frequency of consumption
   */
  public val schedule: Timing? = null,
  /**
   * Quantity of the specified food
   */
  public val amount: Quantity? = null,
  /**
   * Rate at which enteral feeding was administered
   */
  public val rate: Quantity? = null,
  /**
   * Flag to indicate if the food or fluid item was refused or otherwise not consumed
   */
  public val notConsumed: Boolean? = null,
  /**
   * Reason food or fluid was not consumed
   */
  public val notConsumedReason: CodeableConcept? = null,
) : BackboneElement
