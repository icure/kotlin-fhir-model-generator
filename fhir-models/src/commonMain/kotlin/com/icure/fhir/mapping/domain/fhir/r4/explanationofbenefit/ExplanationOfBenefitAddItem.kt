//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.explanationofbenefit

import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.address.Address
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.money.Money
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Insurer added line items
 *
 * The first-tier service adjudications for payor added product or service lines.
 *
 * @param id Unique id for inter-element referencing
 * @param productOrService Billing, service, product, or drug code
 * @param servicedDate Date or dates of service or product delivery
 * @param servicedPeriod Date or dates of service or product delivery
 * @param locationCodeableConcept Place of service or where product was supplied
 * @param locationAddress Place of service or where product was supplied
 * @param locationReference Place of service or where product was supplied
 * @param quantity Count of products or services
 * @param unitPrice Fee, charge or cost per item
 * @param factor Price scaling factor
 * @param net Total item cost
 * @param bodySite Anatomical location
 */
@SerialName("ExplanationOfBenefitAddItem")
@Serializable
public data class ExplanationOfBenefitAddItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val itemSequence: List<Int> = emptyList(),
  public val detailSequence: List<Int> = emptyList(),
  public val subDetailSequence: List<Int> = emptyList(),
  public val provider: List<Reference> = emptyList(),
  /**
   * Billing, service, product, or drug code
   */
  public val productOrService: CodeableConcept,
  public val modifier: List<CodeableConcept> = emptyList(),
  public val programCode: List<CodeableConcept> = emptyList(),
  /**
   * Date or dates of service or product delivery
   */
  public val servicedDate: String? = null,
  /**
   * Date or dates of service or product delivery
   */
  public val servicedPeriod: Period? = null,
  /**
   * Place of service or where product was supplied
   */
  public val locationCodeableConcept: CodeableConcept? = null,
  /**
   * Place of service or where product was supplied
   */
  public val locationAddress: Address? = null,
  /**
   * Place of service or where product was supplied
   */
  public val locationReference: Reference? = null,
  /**
   * Count of products or services
   */
  public val quantity: Quantity? = null,
  /**
   * Fee, charge or cost per item
   */
  public val unitPrice: Money? = null,
  /**
   * Price scaling factor
   */
  public val factor: Float? = null,
  /**
   * Total item cost
   */
  public val net: Money? = null,
  /**
   * Anatomical location
   */
  public val bodySite: CodeableConcept? = null,
  public val subSite: List<CodeableConcept> = emptyList(),
  public val noteNumber: List<Int> = emptyList(),
  public val adjudication: List<ExplanationOfBenefitItemAdjudication> = emptyList(),
  public val detail: List<ExplanationOfBenefitAddItemDetail> = emptyList(),
) : BackboneElement
