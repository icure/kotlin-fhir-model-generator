//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.ingredient

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
