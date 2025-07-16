//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.explanationofbenefit

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.address.Address
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.money.Money
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param revenue Revenue or cost center code
 * @param productOrService Billing, service, product, or drug code
 * @param productOrServiceEnd End of a range of codes
 * @param servicedDate Date or dates of service or product delivery
 * @param servicedPeriod Date or dates of service or product delivery
 * @param locationCodeableConcept Place of service or where product was supplied
 * @param locationAddress Place of service or where product was supplied
 * @param locationReference Place of service or where product was supplied
 * @param patientPaid Paid by the patient
 * @param quantity Count of products or services
 * @param unitPrice Fee, charge or cost per item
 * @param factor Price scaling factor
 * @param tax Total tax
 * @param net Total item cost
 * @param reviewOutcome Additem level adjudication results
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
  public val traceNumber: List<Identifier> = emptyList(),
  public val provider: List<Reference> = emptyList(),
  /**
   * Revenue or cost center code
   */
  public val revenue: CodeableConcept? = null,
  /**
   * Billing, service, product, or drug code
   */
  public val productOrService: CodeableConcept? = null,
  /**
   * End of a range of codes
   */
  public val productOrServiceEnd: CodeableConcept? = null,
  public val request: List<Reference> = emptyList(),
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
   * Paid by the patient
   */
  public val patientPaid: Money? = null,
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
   * Total tax
   */
  public val tax: Money? = null,
  /**
   * Total item cost
   */
  public val net: Money? = null,
  public val bodySite: List<ExplanationOfBenefitAddItemBodySite> = emptyList(),
  public val noteNumber: List<Int> = emptyList(),
  /**
   * Additem level adjudication results
   */
  public val reviewOutcome: ExplanationOfBenefitItemReviewOutcome? = null,
  public val adjudication: List<ExplanationOfBenefitItemAdjudication> = emptyList(),
  public val detail: List<ExplanationOfBenefitAddItemDetail> = emptyList(),
) : BackboneElement
