//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.invoice

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.monetarycomponent.MonetaryComponent
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Line items of this Invoice
 *
 * Each line item represents one charge for goods and services rendered. Details such.ofType(date),
 * code and amount are found in the referenced ChargeItem resource.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Sequence number of line item
 * @param servicedDate Service data or period
 * @param servicedPeriod Service data or period
 * @param chargeItemReference Reference to ChargeItem containing details of this line item or an
 * inline billing code
 * @param chargeItemCodeableConcept Reference to ChargeItem containing details of this line item or
 * an inline billing code
 */
@SerialName("InvoiceLineItem")
@Serializable
public data class InvoiceLineItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Sequence number of line item
   */
  public val sequence: Int? = null,
  /**
   * Service data or period
   */
  public val servicedDate: String? = null,
  /**
   * Service data or period
   */
  public val servicedPeriod: Period? = null,
  /**
   * Reference to ChargeItem containing details of this line item or an inline billing code
   */
  public val chargeItemReference: Reference? = null,
  /**
   * Reference to ChargeItem containing details of this line item or an inline billing code
   */
  public val chargeItemCodeableConcept: CodeableConcept? = null,
  public val priceComponent: List<MonetaryComponent> = emptyList(),
) : BackboneElement
