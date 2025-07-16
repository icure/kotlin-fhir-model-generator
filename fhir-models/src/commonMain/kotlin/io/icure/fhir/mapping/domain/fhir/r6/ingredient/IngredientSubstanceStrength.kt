//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.ingredient

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.ratio.Ratio
import io.icure.fhir.mapping.domain.fhir.r6.ratiorange.RatioRange
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The quantity of substance, per presentation, or per volume or mass, and type of quantity
 *
 * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single
 * pharmaceutical product or manufactured item. The allowed repetitions do not represent different
 * strengths, but are different representations - mathematically equivalent - of a single strength.
 *
 * @param id Unique id for inter-element referencing
 * @param presentationRatio The quantity of substance in the unit of presentation
 * @param presentationRatioRange The quantity of substance in the unit of presentation
 * @param presentationCodeableConcept The quantity of substance in the unit of presentation
 * @param presentationQuantity The quantity of substance in the unit of presentation
 * @param textPresentation Text of either the whole presentation strength or a part of it (rest
 * being in Strength.presentation as a ratio)
 * @param concentrationRatio The strength per unitary volume (or mass)
 * @param concentrationRatioRange The strength per unitary volume (or mass)
 * @param concentrationCodeableConcept The strength per unitary volume (or mass)
 * @param concentrationQuantity The strength per unitary volume (or mass)
 * @param textConcentration Text of either the whole concentration strength or a part of it (rest
 * being in Strength.concentration as a ratio)
 * @param basis A code that indicates if the strength is, for example, based on the ingredient
 * substance as stated or on the substance base (when the ingredient is a salt)
 * @param measurementPoint When strength is measured at a particular point or distance
 */
@SerialName("IngredientSubstanceStrength")
@Serializable
public data class IngredientSubstanceStrength(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The quantity of substance in the unit of presentation
   */
  public val presentationRatio: Ratio? = null,
  /**
   * The quantity of substance in the unit of presentation
   */
  public val presentationRatioRange: RatioRange? = null,
  /**
   * The quantity of substance in the unit of presentation
   */
  public val presentationCodeableConcept: CodeableConcept? = null,
  /**
   * The quantity of substance in the unit of presentation
   */
  public val presentationQuantity: Quantity? = null,
  /**
   * Text of either the whole presentation strength or a part of it (rest being in
   * Strength.presentation as a ratio)
   */
  public val textPresentation: String? = null,
  /**
   * The strength per unitary volume (or mass)
   */
  public val concentrationRatio: Ratio? = null,
  /**
   * The strength per unitary volume (or mass)
   */
  public val concentrationRatioRange: RatioRange? = null,
  /**
   * The strength per unitary volume (or mass)
   */
  public val concentrationCodeableConcept: CodeableConcept? = null,
  /**
   * The strength per unitary volume (or mass)
   */
  public val concentrationQuantity: Quantity? = null,
  /**
   * Text of either the whole concentration strength or a part of it (rest being in
   * Strength.concentration as a ratio)
   */
  public val textConcentration: String? = null,
  /**
   * A code that indicates if the strength is, for example, based on the ingredient substance as
   * stated or on the substance base (when the ingredient is a salt)
   */
  public val basis: CodeableConcept? = null,
  /**
   * When strength is measured at a particular point or distance
   */
  public val measurementPoint: String? = null,
  public val country: List<CodeableConcept> = emptyList(),
  public val referenceStrength: List<IngredientSubstanceStrengthReferenceStrength> = emptyList(),
) : BackboneElement
