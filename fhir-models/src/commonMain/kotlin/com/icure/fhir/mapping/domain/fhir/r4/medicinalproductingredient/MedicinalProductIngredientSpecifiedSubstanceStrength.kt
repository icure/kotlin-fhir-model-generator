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
 * Quantity of the substance or specified substance present in the manufactured item or
 * pharmaceutical product
 *
 * Quantity of the substance or specified substance present in the manufactured item or
 * pharmaceutical product.
 *
 * @param id Unique id for inter-element referencing
 * @param presentation The quantity of substance in the unit of presentation, or in the volume (or
 * mass) of the single pharmaceutical product or manufactured item
 * @param presentationLowLimit A lower limit for the quantity of substance in the unit of
 * presentation. For use when there is a range of strengths, this is the lower limit, with the
 * presentation attribute becoming the upper limit
 * @param concentration The strength per unitary volume (or mass)
 * @param concentrationLowLimit A lower limit for the strength per unitary volume (or mass), for
 * when there is a range. The concentration attribute then becomes the upper limit
 * @param measurementPoint For when strength is measured at a particular point or distance
 */
@SerialName("MedicinalProductIngredientSpecifiedSubstanceStrength")
@Serializable
public data class MedicinalProductIngredientSpecifiedSubstanceStrength(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single
   * pharmaceutical product or manufactured item
   */
  public val presentation: Ratio,
  /**
   * A lower limit for the quantity of substance in the unit of presentation. For use when there is
   * a range of strengths, this is the lower limit, with the presentation attribute becoming the upper
   * limit
   */
  public val presentationLowLimit: Ratio? = null,
  /**
   * The strength per unitary volume (or mass)
   */
  public val concentration: Ratio? = null,
  /**
   * A lower limit for the strength per unitary volume (or mass), for when there is a range. The
   * concentration attribute then becomes the upper limit
   */
  public val concentrationLowLimit: Ratio? = null,
  /**
   * For when strength is measured at a particular point or distance
   */
  public val measurementPoint: String? = null,
  public val country: List<CodeableConcept> = emptyList(),
  public val referenceStrength:
      List<MedicinalProductIngredientSpecifiedSubstanceStrengthReferenceStrength> = emptyList(),
) : BackboneElement
