//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medication

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.ratio.Ratio
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Active or inactive ingredient
 *
 * Identifies a particular constituent of interest in the product.
 *
 * @param id Unique id for inter-element referencing
 * @param item The ingredient (substance or medication) that the ingredient.strength relates to
 * @param isActive Active ingredient indicator
 * @param strengthRatio Quantity of ingredient present
 * @param strengthCodeableConcept Quantity of ingredient present
 * @param strengthQuantity Quantity of ingredient present
 */
@SerialName("MedicationIngredient")
@Serializable
public data class MedicationIngredient(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The ingredient (substance or medication) that the ingredient.strength relates to
   */
  public val item: CodeableReference,
  /**
   * Active ingredient indicator
   */
  public val isActive: Boolean? = null,
  /**
   * Quantity of ingredient present
   */
  public val strengthRatio: Ratio? = null,
  /**
   * Quantity of ingredient present
   */
  public val strengthCodeableConcept: CodeableConcept? = null,
  /**
   * Quantity of ingredient present
   */
  public val strengthQuantity: Quantity? = null,
) : BackboneElement
