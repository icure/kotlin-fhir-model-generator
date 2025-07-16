//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.explanationofbenefit

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.money.Money
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Payment Details
 *
 * Payment details for the adjudication of the claim.
 *
 * @param id Unique id for inter-element referencing
 * @param type Partial or complete payment
 * @param adjustment Payment adjustment for non-claim issues
 * @param adjustmentReason Explanation for the variance
 * @param date Expected date of payment
 * @param amount Payable amount after adjustment
 * @param identifier Business identifier for the payment
 */
@SerialName("ExplanationOfBenefitPayment")
@Serializable
public data class ExplanationOfBenefitPayment(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Partial or complete payment
   */
  public val type: CodeableConcept? = null,
  /**
   * Payment adjustment for non-claim issues
   */
  public val adjustment: Money? = null,
  /**
   * Explanation for the variance
   */
  public val adjustmentReason: CodeableConcept? = null,
  /**
   * Expected date of payment
   */
  public val date: String? = null,
  /**
   * Payable amount after adjustment
   */
  public val amount: Money? = null,
  /**
   * Business identifier for the payment
   */
  public val identifier: Identifier? = null,
) : BackboneElement
