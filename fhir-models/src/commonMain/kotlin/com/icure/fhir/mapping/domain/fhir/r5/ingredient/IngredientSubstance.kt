//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.ingredient

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The substance that comprises this ingredient
 *
 * The substance that comprises this ingredient.
 *
 * @param id Unique id for inter-element referencing
 * @param code A code or full resource that represents the ingredient substance
 */
@SerialName("IngredientSubstance")
@Serializable
public data class IngredientSubstance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A code or full resource that represents the ingredient substance
   */
  public val code: CodeableReference,
  public val strength: List<IngredientSubstanceStrength> = emptyList(),
) : BackboneElement
