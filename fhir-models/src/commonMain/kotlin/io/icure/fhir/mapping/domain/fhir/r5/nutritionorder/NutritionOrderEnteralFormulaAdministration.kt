//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.nutritionorder

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.ratio.Ratio
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Formula feeding instruction as structured data
 *
 * Formula administration instructions as structured data.  This repeating structure allows for
 * changing the administration rate or volume over time for both bolus and continuous feeding.  An
 * example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
 *
 * @param id Unique id for inter-element referencing
 * @param schedule Scheduling information for enteral formula products
 * @param quantity The volume of formula to provide
 * @param rateQuantity Speed with which the formula is provided per period of time
 * @param rateRatio Speed with which the formula is provided per period of time
 */
@SerialName("NutritionOrderEnteralFormulaAdministration")
@Serializable
public data class NutritionOrderEnteralFormulaAdministration(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Scheduling information for enteral formula products
   */
  public val schedule: NutritionOrderEnteralFormulaAdministrationSchedule? = null,
  /**
   * The volume of formula to provide
   */
  public val quantity: Quantity? = null,
  /**
   * Speed with which the formula is provided per period of time
   */
  public val rateQuantity: Quantity? = null,
  /**
   * Speed with which the formula is provided per period of time
   */
  public val rateRatio: Ratio? = null,
) : BackboneElement
