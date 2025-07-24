//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.ingredient

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.ratio.Ratio
import com.icure.fhir.mapping.domain.fhir.r4b.ratiorange.RatioRange
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Strength expressed in terms of a reference substance
 *
 * Strength expressed in terms of a reference substance. For when the ingredient strength is
 * additionally expressed as equivalent to the strength of some other closely related substance (e.g.
 * salt vs. base). Reference strength represents the strength (quantitative composition) of the active
 * moiety of the active substance. There are situations when the active substance and active moiety are
 * different, therefore both a strength and a reference strength are needed.
 *
 * @param id Unique id for inter-element referencing
 * @param substance Relevant reference substance
 * @param strengthRatio Strength expressed in terms of a reference substance
 * @param strengthRatioRange Strength expressed in terms of a reference substance
 * @param measurementPoint When strength is measured at a particular point or distance
 */
@SerialName("IngredientSubstanceStrengthReferenceStrength")
@Serializable
public data class IngredientSubstanceStrengthReferenceStrength(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Relevant reference substance
   */
  public val substance: CodeableReference? = null,
  /**
   * Strength expressed in terms of a reference substance
   */
  public val strengthRatio: Ratio? = null,
  /**
   * Strength expressed in terms of a reference substance
   */
  public val strengthRatioRange: RatioRange? = null,
  /**
   * When strength is measured at a particular point or distance
   */
  public val measurementPoint: String? = null,
  public val country: List<CodeableConcept> = emptyList(),
) : BackboneElement
