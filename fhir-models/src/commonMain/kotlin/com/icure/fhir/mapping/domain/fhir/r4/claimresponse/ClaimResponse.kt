//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.claimresponse

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
 * @param disposition Disposition Message
 * @param preAuthRef Preauthorization reference
 * @param preAuthPeriod Preauthorization reference effective period
 * @param payeeType Party to be paid any benefits payable
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
  public val insurer: Reference,
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
  /**
   * Party to be paid any benefits payable
   */
  public val payeeType: CodeableConcept? = null,
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
