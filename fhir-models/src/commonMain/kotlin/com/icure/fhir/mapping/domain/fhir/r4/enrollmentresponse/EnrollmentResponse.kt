//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.enrollmentresponse

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * EnrollmentResponse resource
 *
 * This resource provides enrollment and plan details from the processing of an EnrollmentRequest
 * resource.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | cancelled | draft | entered-in-error
 * @param request Claim reference
 * @param outcome queued | complete | error | partial
 * @param disposition Disposition Message
 * @param created Creation date
 * @param organization Insurer
 * @param requestProvider Responsible practitioner
 */
@SerialName("EnrollmentResponse")
@Serializable
public data class EnrollmentResponse(
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
   * Claim reference
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
   * Creation date
   */
  public val created: String? = null,
  /**
   * Insurer
   */
  public val organization: Reference? = null,
  /**
   * Responsible practitioner
   */
  public val requestProvider: Reference? = null,
) : DomainResource
