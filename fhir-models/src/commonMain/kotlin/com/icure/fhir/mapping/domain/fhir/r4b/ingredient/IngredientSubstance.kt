//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.ingredient

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
