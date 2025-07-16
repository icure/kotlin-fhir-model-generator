//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.paymentreconciliation

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.money.Money
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
 * @param status active | cancelled | draft | entered-in-error
 * @param period Period covered
 * @param created Creation date
 * @param paymentIssuer Party generating payment
 * @param request Reference to requesting resource
 * @param requestor Responsible practitioner
 * @param outcome queued | complete | error | partial
 * @param disposition Disposition message
 * @param paymentDate When payment issued
 * @param paymentAmount Total amount of Payment
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
   * active | cancelled | draft | entered-in-error
   */
  public val status: String? = null,
  /**
   * Period covered
   */
  public val period: Period? = null,
  /**
   * Creation date
   */
  public val created: String? = null,
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
  public val paymentDate: String? = null,
  /**
   * Total amount of Payment
   */
  public val paymentAmount: Money,
  /**
   * Business identifier for the payment
   */
  public val paymentIdentifier: Identifier? = null,
  public val detail: List<PaymentReconciliationDetail> = emptyList(),
  /**
   * Printed form identifier
   */
  public val formCode: CodeableConcept? = null,
  public val processNote: List<PaymentReconciliationProcessNote> = emptyList(),
) : DomainResource
