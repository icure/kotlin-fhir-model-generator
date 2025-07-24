//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.claimresponse

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.money.Money
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
 * @param adjustmentReason Explanation for the adjustment
 * @param date Expected date of payment
 * @param amount Payable amount after adjustment
 * @param identifier Business identifier for the payment
 */
@SerialName("ClaimResponsePayment")
@Serializable
public data class ClaimResponsePayment(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Partial or complete payment
   */
  public val type: CodeableConcept,
  /**
   * Payment adjustment for non-claim issues
   */
  public val adjustment: Money? = null,
  /**
   * Explanation for the adjustment
   */
  public val adjustmentReason: CodeableConcept? = null,
  /**
   * Expected date of payment
   */
  public val date: String? = null,
  /**
   * Payable amount after adjustment
   */
  public val amount: Money,
  /**
   * Business identifier for the payment
   */
  public val identifier: Identifier? = null,
) : BackboneElement
