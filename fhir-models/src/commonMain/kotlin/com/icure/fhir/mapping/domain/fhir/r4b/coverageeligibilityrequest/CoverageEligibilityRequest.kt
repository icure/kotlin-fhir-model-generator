//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.coverageeligibilityrequest

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * CoverageEligibilityRequest resource
 *
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer
 * for them to respond, in the form of an CoverageEligibilityResponse, with information regarding
 * whether the stated coverage is valid and in-force and optionally to provide the insurance details of
 * the policy.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | cancelled | draft | entered-in-error
 * @param priority Desired processing priority
 * @param patient Intended recipient of products and services
 * @param servicedDate Estimated date or dates of service
 * @param servicedPeriod Estimated date or dates of service
 * @param created Creation date
 * @param enterer Author
 * @param provider Party responsible for the request
 * @param insurer Coverage issuer
 * @param facility Servicing facility
 */
@SerialName("CoverageEligibilityRequest")
@Serializable
public data class CoverageEligibilityRequest(
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
   * Desired processing priority
   */
  public val priority: CodeableConcept? = null,
  public val purpose: List<String> = emptyList(),
  /**
   * Intended recipient of products and services
   */
  public val patient: Reference,
  /**
   * Estimated date or dates of service
   */
  public val servicedDate: String? = null,
  /**
   * Estimated date or dates of service
   */
  public val servicedPeriod: Period? = null,
  /**
   * Creation date
   */
  public val created: String? = null,
  /**
   * Author
   */
  public val enterer: Reference? = null,
  /**
   * Party responsible for the request
   */
  public val provider: Reference? = null,
  /**
   * Coverage issuer
   */
  public val insurer: Reference,
  /**
   * Servicing facility
   */
  public val facility: Reference? = null,
  public val supportingInfo: List<CoverageEligibilityRequestSupportingInfo> = emptyList(),
  public val insurance: List<CoverageEligibilityRequestInsurance> = emptyList(),
  public val item: List<CoverageEligibilityRequestItem> = emptyList(),
) : DomainResource
