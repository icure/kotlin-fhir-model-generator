//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.claimresponse

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Response to a claim predetermination or preauthorization
 *
 * This resource provides the adjudication details from the processing of a Claim resource.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | cancelled | draft | entered-in-error
 * @param type More granular claim type
 * @param subType More granular claim type
 * @param use claim | preauthorization | predetermination
 * @param patient The recipient of the products and services
 * @param created Response creation date
 * @param insurer Party responsible for reimbursement
 * @param requestor Party responsible for the claim
 * @param request Id of resource triggering adjudication
 * @param outcome queued | complete | error | partial
 * @param decision Result of the adjudication
 * @param disposition Disposition Message
 * @param preAuthRef Preauthorization reference
 * @param preAuthPeriod Preauthorization reference effective period
 * @param payeeType Party to be paid any benefits payable
 * @param diagnosisRelatedGroup Package billing code
 * @param payment Payment Details
 * @param fundsReserve Funds reserved status
 * @param formCode Printed form identifier
 * @param form Printed reference or actual form
 */
@SerialName("ClaimResponse")
@Serializable
public data class ClaimResponse(
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
   * More granular claim type
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
   * Response creation date
   */
  public val created: String? = null,
  /**
   * Party responsible for reimbursement
   */
  public val insurer: Reference? = null,
  /**
   * Party responsible for the claim
   */
  public val requestor: Reference? = null,
  /**
   * Id of resource triggering adjudication
   */
  public val request: Reference? = null,
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
  /**
   * Preauthorization reference
   */
  public val preAuthRef: String? = null,
  /**
   * Preauthorization reference effective period
   */
  public val preAuthPeriod: Period? = null,
  public val event: List<ClaimResponseEvent> = emptyList(),
  /**
   * Party to be paid any benefits payable
   */
  public val payeeType: CodeableConcept? = null,
  public val encounter: List<Reference> = emptyList(),
  /**
   * Package billing code
   */
  public val diagnosisRelatedGroup: CodeableConcept? = null,
  public val item: List<ClaimResponseItem> = emptyList(),
  public val addItem: List<ClaimResponseAddItem> = emptyList(),
  public val adjudication: List<ClaimResponseItemAdjudication> = emptyList(),
  public val total: List<ClaimResponseTotal> = emptyList(),
  /**
   * Payment Details
   */
  public val payment: ClaimResponsePayment? = null,
  /**
   * Funds reserved status
   */
  public val fundsReserve: CodeableConcept? = null,
  /**
   * Printed form identifier
   */
  public val formCode: CodeableConcept? = null,
  /**
   * Printed reference or actual form
   */
  public val form: Attachment? = null,
  public val processNote: List<ClaimResponseProcessNote> = emptyList(),
  public val communicationRequest: List<Reference> = emptyList(),
  public val insurance: List<ClaimResponseInsurance> = emptyList(),
  public val error: List<ClaimResponseError> = emptyList(),
) : DomainResource
