//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproductingredient

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The ingredient substance
 *
 * The ingredient substance.
 *
 * @param id Unique id for inter-element referencing
 * @param code The ingredient substance
 */
@SerialName("MedicinalProductIngredientSubstance")
@Serializable
public data class MedicinalProductIngredientSubstance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The ingredient substance
   */
  public val code: CodeableConcept,
  public val strength: List<MedicinalProductIngredientSpecifiedSubstanceStrength> = emptyList(),
) : BackboneElement
