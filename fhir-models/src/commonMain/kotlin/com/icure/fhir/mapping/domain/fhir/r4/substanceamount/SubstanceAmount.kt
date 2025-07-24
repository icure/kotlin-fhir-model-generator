//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substanceamount

import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.range.Range
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Chemical substances are a single substance type whose primary defining element is the molecular
 * structure. Chemical substances shall be defined on the basis of their complete covalent molecular
 * structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured.
 * Purity, grade, physical form or particle size are not taken into account in the definition of a
 * chemical substance or in the assignment of a Substance ID
 *
 * Chemical substances are a single substance type whose primary defining element is the molecular
 * structure. Chemical substances shall be defined on the basis of their complete covalent molecular
 * structure; the presence of a salt (counter-ion) and/or solvates (water, alcohols) is also captured.
 * Purity, grade, physical form or particle size are not taken into account in the definition of a
 * chemical substance or in the assignment of a Substance ID.
 *
 * @param id Unique id for inter-element referencing
 * @param amountQuantity Used to capture quantitative values for a variety of elements. If only
 * limits are given, the arithmetic mean would be the average. If only a single definite value for a
 * given element is given, it would be captured in this field
 * @param amountRange Used to capture quantitative values for a variety of elements. If only limits
 * are given, the arithmetic mean would be the average. If only a single definite value for a given
 * element is given, it would be captured in this field
 * @param amountString Used to capture quantitative values for a variety of elements. If only limits
 * are given, the arithmetic mean would be the average. If only a single definite value for a given
 * element is given, it would be captured in this field
 * @param amountType Most elements that require a quantitative value will also have a field called
 * amount type. Amount type should always be specified because the actual value of the amount is often
 * dependent on it. EXAMPLE: In capturing the actual relative amounts of substances or molecular
 * fragments it is essential to indicate whether the amount refers to a mole ratio or weight ratio. For
 * any given element an effort should be made to use same the amount type for all related definitional
 * elements
 * @param amountText A textual comment on a numeric value
 * @param referenceRange Reference range of possible or expected values
 */
@SerialName("SubstanceAmount")
@Serializable
public data class SubstanceAmount(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Used to capture quantitative values for a variety of elements. If only limits are given, the
   * arithmetic mean would be the average. If only a single definite value for a given element is
   * given, it would be captured in this field
   */
  public val amountQuantity: Quantity? = null,
  /**
   * Used to capture quantitative values for a variety of elements. If only limits are given, the
   * arithmetic mean would be the average. If only a single definite value for a given element is
   * given, it would be captured in this field
   */
  public val amountRange: Range? = null,
  /**
   * Used to capture quantitative values for a variety of elements. If only limits are given, the
   * arithmetic mean would be the average. If only a single definite value for a given element is
   * given, it would be captured in this field
   */
  public val amountString: String? = null,
  /**
   * Most elements that require a quantitative value will also have a field called amount type.
   * Amount type should always be specified because the actual value of the amount is often dependent
   * on it. EXAMPLE: In capturing the actual relative amounts of substances or molecular fragments it
   * is essential to indicate whether the amount refers to a mole ratio or weight ratio. For any given
   * element an effort should be made to use same the amount type for all related definitional elements
   */
  public val amountType: CodeableConcept? = null,
  /**
   * A textual comment on a numeric value
   */
  public val amountText: String? = null,
  /**
   * Reference range of possible or expected values
   */
  public val referenceRange: SubstanceAmountReferenceRange? = null,
) : BackboneElement
