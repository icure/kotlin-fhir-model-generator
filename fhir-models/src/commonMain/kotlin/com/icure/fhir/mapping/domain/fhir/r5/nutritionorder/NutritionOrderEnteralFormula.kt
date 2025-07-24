//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.nutritionorder

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Enteral formula components
 *
 * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers
 * nutrition distal to the oral cavity.
 *
 * @param id Unique id for inter-element referencing
 * @param baseFormulaType Type of enteral or infant formula
 * @param baseFormulaProductName Product or brand name of the enteral or infant formula
 * @param caloricDensity Amount of energy per specified volume that is required
 * @param routeOfAdministration How the formula should enter the patient's gastrointestinal tract
 * @param maxVolumeToDeliver Upper limit on formula volume per unit of time
 * @param administrationInstruction Formula feeding instructions expressed as text
 */
@SerialName("NutritionOrderEnteralFormula")
@Serializable
public data class NutritionOrderEnteralFormula(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of enteral or infant formula
   */
  public val baseFormulaType: CodeableReference? = null,
  /**
   * Product or brand name of the enteral or infant formula
   */
  public val baseFormulaProductName: String? = null,
  public val deliveryDevice: List<CodeableReference> = emptyList(),
  public val additive: List<NutritionOrderEnteralFormulaAdditive> = emptyList(),
  /**
   * Amount of energy per specified volume that is required
   */
  public val caloricDensity: Quantity? = null,
  /**
   * How the formula should enter the patient's gastrointestinal tract
   */
  public val routeOfAdministration: CodeableConcept? = null,
  public val administration: List<NutritionOrderEnteralFormulaAdministration> = emptyList(),
  /**
   * Upper limit on formula volume per unit of time
   */
  public val maxVolumeToDeliver: Quantity? = null,
  /**
   * Formula feeding instructions expressed as text
   */
  public val administrationInstruction: String? = null,
) : BackboneElement
