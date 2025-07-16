//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.explanationofbenefit

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.money.Money
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Explanation of Benefit resource
 *
 * This resource provides: the claim details; adjudication details from the processing of a Claim;
 * and optionally account balance information, for informing the subscriber of the benefits provided.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | cancelled | draft | entered-in-error
 * @param type Category or discipline
 * @param subType More granular claim type
 * @param use claim | preauthorization | predetermination
 * @param patient The recipient of the products and services
 * @param billablePeriod Relevant time frame for the claim
 * @param created Response creation date
 * @param enterer Author of the claim
 * @param insurer Party responsible for reimbursement
 * @param provider Party responsible for the claim
 * @param priority Desired processing urgency
 * @param fundsReserveRequested For whom to reserve funds
 * @param fundsReserve Funds reserved status
 * @param prescription Prescription authorizing services or products
 * @param originalPrescription Original prescription if superceded by fulfiller
 * @param payee Recipient of benefits payable
 * @param referral Treatment Referral
 * @param facility Servicing Facility
 * @param claim Claim reference
 * @param claimResponse Claim response reference
 * @param outcome queued | complete | error | partial
 * @param decision Result of the adjudication
 * @param disposition Disposition Message
 * @param diagnosisRelatedGroup Package billing code
 * @param precedence Precedence (primary, secondary, etc.)
 * @param accident Details of the event
 * @param patientPaid Paid by the patient
 * @param payment Payment Details
 * @param formCode Printed form identifier
 * @param form Printed reference or actual form
 * @param benefitPeriod When the benefits are applicable
 */
@SerialName("ExplanationOfBenefit")
@Serializable
public data class ExplanationOfBenefit(
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
  public val traceNumber: List<Identifier> = emptyList(),
  /**
   * active | cancelled | draft | entered-in-error
   */
  public val status: String? = null,
  /**
   * Category or discipline
   */
  public val type: CodeableConcept,
  /**
   * More granular claim type
   */
  public val subType: CodeableConcept? = null,
  /**
   * claim | preauthorization | predetermination
   */
  public val use: String? = null,
  /**
   * The recipient of the products and services
   */
  public val patient: Reference,
  /**
   * Relevant time frame for the claim
   */
  public val billablePeriod: Period? = null,
  /**
   * Response creation date
   */
  public val created: String? = null,
  /**
   * Author of the claim
   */
  public val enterer: Reference? = null,
  /**
   * Party responsible for reimbursement
   */
  public val insurer: Reference? = null,
  /**
   * Party responsible for the claim
   */
  public val provider: Reference? = null,
  /**
   * Desired processing urgency
   */
  public val priority: CodeableConcept? = null,
  /**
   * For whom to reserve funds
   */
  public val fundsReserveRequested: CodeableConcept? = null,
  /**
   * Funds reserved status
   */
  public val fundsReserve: CodeableConcept? = null,
  public val related: List<ExplanationOfBenefitRelated> = emptyList(),
  /**
   * Prescription authorizing services or products
   */
  public val prescription: Reference? = null,
  /**
   * Original prescription if superceded by fulfiller
   */
  public val originalPrescription: Reference? = null,
  public val event: List<ExplanationOfBenefitEvent> = emptyList(),
  /**
   * Recipient of benefits payable
   */
  public val payee: ExplanationOfBenefitPayee? = null,
  /**
   * Treatment Referral
   */
  public val referral: Reference? = null,
  public val encounter: List<Reference> = emptyList(),
  /**
   * Servicing Facility
   */
  public val facility: Reference? = null,
  /**
   * Claim reference
   */
  public val claim: Reference? = null,
  /**
   * Claim response reference
   */
  public val claimResponse: Reference? = null,
  /**
   * queued | complete | error | partial
   */
  public val outcome: String? = null,
  /**
   * Result of the adjudication
   */
  public val decision: CodeableConcept? = null,
  /**
   * Disposition Message
   */
  public val disposition: String? = null,
  public val preAuthRef: List<String> = emptyList(),
  public val preAuthRefPeriod: List<Period> = emptyList(),
  /**
   * Package billing code
   */
  public val diagnosisRelatedGroup: CodeableConcept? = null,
  public val careTeam: List<ExplanationOfBenefitCareTeam> = emptyList(),
  public val supportingInfo: List<ExplanationOfBenefitSupportingInfo> = emptyList(),
  public val diagnosis: List<ExplanationOfBenefitDiagnosis> = emptyList(),
  public val procedure: List<ExplanationOfBenefitProcedure> = emptyList(),
  /**
   * Precedence (primary, secondary, etc.)
   */
  public val precedence: Int? = null,
  public val insurance: List<ExplanationOfBenefitInsurance> = emptyList(),
  /**
   * Details of the event
   */
  public val accident: ExplanationOfBenefitAccident? = null,
  /**
   * Paid by the patient
   */
  public val patientPaid: Money? = null,
  public val item: List<ExplanationOfBenefitItem> = emptyList(),
  public val addItem: List<ExplanationOfBenefitAddItem> = emptyList(),
  public val adjudication: List<ExplanationOfBenefitItemAdjudication> = emptyList(),
  public val total: List<ExplanationOfBenefitTotal> = emptyList(),
  /**
   * Payment Details
   */
  public val payment: ExplanationOfBenefitPayment? = null,
  /**
   * Printed form identifier
   */
  public val formCode: CodeableConcept? = null,
  /**
   * Printed reference or actual form
   */
  public val form: Attachment? = null,
  public val processNote: List<ExplanationOfBenefitProcessNote> = emptyList(),
  /**
   * When the benefits are applicable
   */
  public val benefitPeriod: Period? = null,
  public val benefitBalance: List<ExplanationOfBenefitBenefitBalance> = emptyList(),
) : DomainResource
