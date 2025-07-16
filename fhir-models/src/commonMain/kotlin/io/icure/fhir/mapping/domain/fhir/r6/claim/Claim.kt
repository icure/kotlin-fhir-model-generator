//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.claim

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
 * Claim, Pre-determination or Pre-authorization
 *
 * A provider issued list of professional services and products which have been provided, or are to
 * be provided, to a patient which is sent to an insurer for reimbursement.
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
 * @param created Resource creation date
 * @param enterer Author of the claim
 * @param insurer Target
 * @param provider Party responsible for the claim
 * @param priority Desired processing urgency
 * @param fundsReserve For whom to reserve funds
 * @param prescription Prescription authorizing services and products
 * @param originalPrescription Original prescription if superseded by fulfiller
 * @param payee Recipient of benefits payable
 * @param referral Treatment referral
 * @param facility Servicing facility
 * @param diagnosisRelatedGroup Package billing code
 * @param accident Details of the event
 * @param patientPaid Paid by the patient
 * @param total Total claim cost
 */
@SerialName("Claim")
@Serializable
public data class Claim(
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
   * Resource creation date
   */
  public val created: String? = null,
  /**
   * Author of the claim
   */
  public val enterer: Reference? = null,
  /**
   * Target
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
  public val fundsReserve: CodeableConcept? = null,
  public val related: List<ClaimRelated> = emptyList(),
  /**
   * Prescription authorizing services and products
   */
  public val prescription: Reference? = null,
  /**
   * Original prescription if superseded by fulfiller
   */
  public val originalPrescription: Reference? = null,
  /**
   * Recipient of benefits payable
   */
  public val payee: ClaimPayee? = null,
  /**
   * Treatment referral
   */
  public val referral: Reference? = null,
  public val encounter: List<Reference> = emptyList(),
  /**
   * Servicing facility
   */
  public val facility: Reference? = null,
  /**
   * Package billing code
   */
  public val diagnosisRelatedGroup: CodeableConcept? = null,
  public val event: List<ClaimEvent> = emptyList(),
  public val careTeam: List<ClaimCareTeam> = emptyList(),
  public val supportingInfo: List<ClaimSupportingInfo> = emptyList(),
  public val diagnosis: List<ClaimDiagnosis> = emptyList(),
  public val procedure: List<ClaimProcedure> = emptyList(),
  public val insurance: List<ClaimInsurance> = emptyList(),
  /**
   * Details of the event
   */
  public val accident: ClaimAccident? = null,
  /**
   * Paid by the patient
   */
  public val patientPaid: Money? = null,
  public val item: List<ClaimItem> = emptyList(),
  /**
   * Total claim cost
   */
  public val total: Money? = null,
) : DomainResource
