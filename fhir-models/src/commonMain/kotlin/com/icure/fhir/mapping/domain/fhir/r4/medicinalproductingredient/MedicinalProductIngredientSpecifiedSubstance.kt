//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproductingredient

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A specified substance that comprises this ingredient
 *
 * A specified substance that comprises this ingredient.
 *
 * @param id Unique id for inter-element referencing
 * @param code The specified substance
 * @param group The group of specified substance, e.g. group 1 to 4
 * @param confidentiality Confidentiality level of the specified substance as the ingredient
 */
@SerialName("MedicinalProductIngredientSpecifiedSubstance")
@Serializable
public data class MedicinalProductIngredientSpecifiedSubstance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The specified substance
   */
  public val code: CodeableConcept,
  /**
   * The group of specified substance, e.g. group 1 to 4
   */
  public val group: CodeableConcept,
  /**
   * Confidentiality level of the specified substance as the ingredient
   */
  public val confidentiality: CodeableConcept? = null,
  public val strength: List<MedicinalProductIngredientSpecifiedSubstanceStrength> = emptyList(),
) : BackboneElement
