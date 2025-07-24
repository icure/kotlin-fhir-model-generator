//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.paymentreconciliation

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.money.Money
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Settlement particulars
 *
 * Distribution of the payment amount for a previously acknowledged payable.
 *
 * @param id Unique id for inter-element referencing
 * @param identifier Business identifier of the payment detail
 * @param predecessor Business identifier of the prior payment detail
 * @param type Category of payment
 * @param request Request giving rise to the payment
 * @param submitter Submitter of the request
 * @param response Response committing to a payment
 * @param date Date of commitment to pay
 * @param responsible Contact for the response
 * @param payee Recipient of the payment
 * @param amount Amount allocated to this payable
 */
@SerialName("PaymentReconciliationDetail")
@Serializable
public data class PaymentReconciliationDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Business identifier of the payment detail
   */
  public val identifier: Identifier? = null,
  /**
   * Business identifier of the prior payment detail
   */
  public val predecessor: Identifier? = null,
  /**
   * Category of payment
   */
  public val type: CodeableConcept,
  /**
   * Request giving rise to the payment
   */
  public val request: Reference? = null,
  /**
   * Submitter of the request
   */
  public val submitter: Reference? = null,
  /**
   * Response committing to a payment
   */
  public val response: Reference? = null,
  /**
   * Date of commitment to pay
   */
  public val date: String? = null,
  /**
   * Contact for the response
   */
  public val responsible: Reference? = null,
  /**
   * Recipient of the payment
   */
  public val payee: Reference? = null,
  /**
   * Amount allocated to this payable
   */
  public val amount: Money? = null,
) : BackboneElement
