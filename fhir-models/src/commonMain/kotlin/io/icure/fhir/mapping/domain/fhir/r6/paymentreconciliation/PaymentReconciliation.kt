//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.paymentreconciliation

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.money.Money
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * PaymentReconciliation resource
 *
 * This resource provides the details including amount of a payment and allocates the payment items
 * being paid.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param type Category of payment
 * @param status active | cancelled | draft | entered-in-error
 * @param kind Workflow originating payment
 * @param period Period covered
 * @param created Creation date
 * @param enterer Who entered the payment
 * @param issuerType Nature of the source
 * @param paymentIssuer Party generating payment
 * @param request Reference to requesting resource
 * @param requestor Responsible practitioner
 * @param outcome queued | complete | error | partial
 * @param disposition Disposition message
 * @param date When payment issued
 * @param location Where payment collected
 * @param method Payment instrument
 * @param cardBrand Type of card
 * @param accountNumber Digits for verification
 * @param expirationDate Expiration year-month
 * @param processor Processor name
 * @param referenceNumber Check number or payment reference
 * @param authorization Authorization number
 * @param tenderedAmount Amount offered by the issuer
 * @param returnedAmount Amount returned by the receiver
 * @param amount Total amount of Payment
 * @param paymentIdentifier Business identifier for the payment
 * @param formCode Printed form identifier
 */
@SerialName("PaymentReconciliation")
@Serializable
public data class PaymentReconciliation(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Category of payment
   */
  public val type: CodeableConcept,
  /**
   * active | cancelled | draft | entered-in-error
   */
  public val status: String? = null,
  /**
   * Workflow originating payment
   */
  public val kind: CodeableConcept? = null,
  /**
   * Period covered
   */
  public val period: Period? = null,
  /**
   * Creation date
   */
  public val created: String? = null,
  /**
   * Who entered the payment
   */
  public val enterer: Reference? = null,
  /**
   * Nature of the source
   */
  public val issuerType: CodeableConcept? = null,
  /**
   * Party generating payment
   */
  public val paymentIssuer: Reference? = null,
  /**
   * Reference to requesting resource
   */
  public val request: Reference? = null,
  /**
   * Responsible practitioner
   */
  public val requestor: Reference? = null,
  /**
   * queued | complete | error | partial
   */
  public val outcome: String? = null,
  /**
   * Disposition message
   */
  public val disposition: String? = null,
  /**
   * When payment issued
   */
  public val date: String? = null,
  /**
   * Where payment collected
   */
  public val location: Reference? = null,
  /**
   * Payment instrument
   */
  public val method: CodeableConcept? = null,
  /**
   * Type of card
   */
  public val cardBrand: String? = null,
  /**
   * Digits for verification
   */
  public val accountNumber: String? = null,
  /**
   * Expiration year-month
   */
  public val expirationDate: String? = null,
  /**
   * Processor name
   */
  public val processor: String? = null,
  /**
   * Check number or payment reference
   */
  public val referenceNumber: String? = null,
  /**
   * Authorization number
   */
  public val authorization: String? = null,
  /**
   * Amount offered by the issuer
   */
  public val tenderedAmount: Money? = null,
  /**
   * Amount returned by the receiver
   */
  public val returnedAmount: Money? = null,
  /**
   * Total amount of Payment
   */
  public val amount: Money,
  /**
   * Business identifier for the payment
   */
  public val paymentIdentifier: Identifier? = null,
  public val allocation: List<PaymentReconciliationAllocation> = emptyList(),
  /**
   * Printed form identifier
   */
  public val formCode: CodeableConcept? = null,
  public val processNote: List<PaymentReconciliationProcessNote> = emptyList(),
) : DomainResource
