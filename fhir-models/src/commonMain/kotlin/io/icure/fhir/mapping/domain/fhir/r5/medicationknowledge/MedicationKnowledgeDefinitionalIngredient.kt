//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.ratio.Ratio
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
