//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.coverageeligibilityresponse

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * CoverageEligibilityResponse resource
 *
 * This resource provides eligibility and plan details from the processing of an
 * CoverageEligibilityRequest resource.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | cancelled | draft | entered-in-error
 * @param patient Intended recipient of products and services
 * @param servicedDate Estimated date or dates of service
 * @param servicedPeriod Estimated date or dates of service
 * @param created Response creation date
 * @param requestor Party responsible for the request
 * @param request Eligibility request reference
 * @param outcome queued | complete | error | partial
 * @param disposition Disposition Message
 * @param insurer Coverage issuer
 * @param preAuthRef Preauthorization reference
 * @param form Printed form identifier
 */
@SerialName("CoverageEligibilityResponse")
@Serializable
public data class CoverageEligibilityResponse(
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
  public val purpose: List<String> = emptyList(),
  /**
   * Intended recipient of products and services
   */
  public val patient: Reference,
  public val event: List<CoverageEligibilityResponseEvent> = emptyList(),
  /**
   * Estimated date or dates of service
   */
  public val servicedDate: String? = null,
  /**
   * Estimated date or dates of service
   */
  public val servicedPeriod: Period? = null,
  /**
   * Response creation date
   */
  public val created: String? = null,
  /**
   * Party responsible for the request
   */
  public val requestor: Reference? = null,
  /**
   * Eligibility request reference
   */
  public val request: Reference,
  /**
   * queued | complete | error | partial
   */
  public val outcome: String? = null,
  /**
   * Disposition Message
   */
  public val disposition: String? = null,
  /**
   * Coverage issuer
   */
  public val insurer: Reference,
  public val insurance: List<CoverageEligibilityResponseInsurance> = emptyList(),
  /**
   * Preauthorization reference
   */
  public val preAuthRef: String? = null,
  /**
   * Printed form identifier
   */
  public val form: CodeableConcept? = null,
  public val error: List<CoverageEligibilityResponseError> = emptyList(),
) : DomainResource
