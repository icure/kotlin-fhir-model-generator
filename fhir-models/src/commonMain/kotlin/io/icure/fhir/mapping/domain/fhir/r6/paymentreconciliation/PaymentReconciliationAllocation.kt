//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.paymentreconciliation

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.money.Money
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Int
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
 * @param target Subject of the payment
 * @param targetItemString Sub-element of the subject
 * @param targetItemIdentifier Sub-element of the subject
 * @param targetItemPositiveInt Sub-element of the subject
 * @param encounter Applied-to encounter
 * @param account Applied-to account
 * @param type Category of payment
 * @param submitter Submitter of the request
 * @param response Response committing to a payment
 * @param date Date of commitment to pay
 * @param responsible Contact for the response
 * @param payee Recipient of the payment
 * @param amount Amount allocated to this payable
 */
@SerialName("PaymentReconciliationAllocation")
@Serializable
public data class PaymentReconciliationAllocation(
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
   * Subject of the payment
   */
  public val target: Reference? = null,
  /**
   * Sub-element of the subject
   */
  public val targetItemString: String? = null,
  /**
   * Sub-element of the subject
   */
  public val targetItemIdentifier: Identifier? = null,
  /**
   * Sub-element of the subject
   */
  public val targetItemPositiveInt: Int? = null,
  /**
   * Applied-to encounter
   */
  public val encounter: Reference? = null,
  /**
   * Applied-to account
   */
  public val account: Reference? = null,
  /**
   * Category of payment
   */
  public val type: CodeableConcept? = null,
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
