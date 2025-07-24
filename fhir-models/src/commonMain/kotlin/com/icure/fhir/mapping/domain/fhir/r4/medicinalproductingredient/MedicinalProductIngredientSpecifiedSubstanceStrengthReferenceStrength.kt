//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproductingredient

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.ratio.Ratio
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Strength expressed in terms of a reference substance
 *
 * Strength expressed in terms of a reference substance.
 *
 * @param id Unique id for inter-element referencing
 * @param substance Relevant reference substance
 * @param strength Strength expressed in terms of a reference substance
 * @param strengthLowLimit Strength expressed in terms of a reference substance
 * @param measurementPoint For when strength is measured at a particular point or distance
 */
@SerialName("MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength")
@Serializable
public data class MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Relevant reference substance
   */
  public val substance: CodeableConcept? = null,
  /**
   * Strength expressed in terms of a reference substance
   */
  public val strength: Ratio,
  /**
   * Strength expressed in terms of a reference substance
   */
  public val strengthLowLimit: Ratio? = null,
  /**
   * For when strength is measured at a particular point or distance
   */
  public val measurementPoint: String? = null,
  public val country: List<CodeableConcept> = emptyList(),
) : BackboneElement
