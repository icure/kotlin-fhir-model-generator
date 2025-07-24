//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.ratio.Ratio
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
 * @param item Substances contained in the medication
 * @param type A code that defines the type of ingredient, active, base, etc
 * @param strengthRatio Quantity of ingredient present
 * @param strengthCodeableConcept Quantity of ingredient present
 * @param strengthQuantity Quantity of ingredient present
 */
@SerialName("MedicationKnowledgeDefinitionalIngredient")
@Serializable
public data class MedicationKnowledgeDefinitionalIngredient(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Substances contained in the medication
   */
  public val item: CodeableReference,
  /**
   * A code that defines the type of ingredient, active, base, etc
   */
  public val type: CodeableConcept? = null,
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
