//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.paymentnotice

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.money.Money
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * PaymentNotice request
 *
 * This resource provides the status of the payment for goods and services rendered, and the request
 * and response resource references.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | cancelled | draft | entered-in-error
 * @param request Request reference
 * @param response Response reference
 * @param created Creation date
 * @param provider Responsible practitioner
 * @param payment Payment reference
 * @param paymentDate Payment or clearing date
 * @param payee Party being paid
 * @param recipient Party being notified
 * @param amount Monetary amount of the payment
 * @param paymentStatus Issued or cleared Status of the payment
 */
@SerialName("PaymentNotice")
@Serializable
public data class PaymentNotice(
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
   * Request reference
   */
  public val request: Reference? = null,
  /**
   * Response reference
   */
  public val response: Reference? = null,
  /**
   * Creation date
   */
  public val created: String? = null,
  /**
   * Responsible practitioner
   */
  public val provider: Reference? = null,
  /**
   * Payment reference
   */
  public val payment: Reference,
  /**
   * Payment or clearing date
   */
  public val paymentDate: String? = null,
  /**
   * Party being paid
   */
  public val payee: Reference? = null,
  /**
   * Party being notified
   */
  public val recipient: Reference,
  /**
   * Monetary amount of the payment
   */
  public val amount: Money,
  /**
   * Issued or cleared Status of the payment
   */
  public val paymentStatus: CodeableConcept? = null,
) : DomainResource
