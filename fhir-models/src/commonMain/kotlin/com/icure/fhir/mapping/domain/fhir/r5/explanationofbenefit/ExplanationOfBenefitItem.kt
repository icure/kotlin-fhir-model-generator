//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.explanationofbenefit

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.address.Address
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.money.Money
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Product or service provided
 *
 * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a
 * simple items or groups of sub-details.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Item instance identifier
 * @param revenue Revenue or cost center code
 * @param category Benefit classification
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
 * @param reviewOutcome Adjudication results
 */
@SerialName("ExplanationOfBenefitItem")
@Serializable
public data class ExplanationOfBenefitItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Item instance identifier
   */
  public val sequence: Int? = null,
  public val careTeamSequence: List<Int> = emptyList(),
  public val diagnosisSequence: List<Int> = emptyList(),
  public val procedureSequence: List<Int> = emptyList(),
  public val informationSequence: List<Int> = emptyList(),
  public val traceNumber: List<Identifier> = emptyList(),
  /**
   * Revenue or cost center code
   */
  public val revenue: CodeableConcept? = null,
  /**
   * Benefit classification
   */
  public val category: CodeableConcept? = null,
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
  public val udi: List<Reference> = emptyList(),
  public val bodySite: List<ExplanationOfBenefitItemBodySite> = emptyList(),
  public val encounter: List<Reference> = emptyList(),
  public val noteNumber: List<Int> = emptyList(),
  /**
   * Adjudication results
   */
  public val reviewOutcome: ExplanationOfBenefitItemReviewOutcome? = null,
  public val adjudication: List<ExplanationOfBenefitItemAdjudication> = emptyList(),
  public val detail: List<ExplanationOfBenefitItemDetail> = emptyList(),
) : BackboneElement
