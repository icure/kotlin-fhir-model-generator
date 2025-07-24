//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.invoice

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.monetarycomponent.MonetaryComponent
import com.icure.fhir.mapping.domain.fhir.r5.money.Money
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Invoice containing ChargeItems from an Account
 *
 * Invoice containing collected ChargeItems from an Account with calculated individual and total
 * price for Billing purpose.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status draft | issued | balanced | cancelled | entered-in-error
 * @param cancelledReason Reason for cancellation of this Invoice
 * @param type Type of Invoice
 * @param subject Recipient(s) of goods and services
 * @param recipient Recipient of this invoice
 * @param date DEPRICATED
 * @param creation When posted
 * @param periodDate Billing date or period
 * @param periodPeriod Billing date or period
 * @param issuer Issuing Organization of Invoice
 * @param account Account that is being balanced
 * @param totalNet Net total of this Invoice
 * @param totalGross Gross total of this Invoice
 * @param paymentTerms Payment details
 */
@SerialName("Invoice")
@Serializable
public data class Invoice(
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
   * draft | issued | balanced | cancelled | entered-in-error
   */
  public val status: String? = null,
  /**
   * Reason for cancellation of this Invoice
   */
  public val cancelledReason: String? = null,
  /**
   * Type of Invoice
   */
  public val type: CodeableConcept? = null,
  /**
   * Recipient(s) of goods and services
   */
  public val subject: Reference? = null,
  /**
   * Recipient of this invoice
   */
  public val recipient: Reference? = null,
  /**
   * DEPRICATED
   */
  public val date: String? = null,
  /**
   * When posted
   */
  public val creation: String? = null,
  /**
   * Billing date or period
   */
  public val periodDate: String? = null,
  /**
   * Billing date or period
   */
  public val periodPeriod: Period? = null,
  public val participant: List<InvoiceParticipant> = emptyList(),
  /**
   * Issuing Organization of Invoice
   */
  public val issuer: Reference? = null,
  /**
   * Account that is being balanced
   */
  public val account: Reference? = null,
  public val lineItem: List<InvoiceLineItem> = emptyList(),
  public val totalPriceComponent: List<MonetaryComponent> = emptyList(),
  /**
   * Net total of this Invoice
   */
  public val totalNet: Money? = null,
  /**
   * Gross total of this Invoice
   */
  public val totalGross: Money? = null,
  /**
   * Payment details
   */
  public val paymentTerms: String? = null,
  public val note: List<Annotation> = emptyList(),
) : DomainResource
