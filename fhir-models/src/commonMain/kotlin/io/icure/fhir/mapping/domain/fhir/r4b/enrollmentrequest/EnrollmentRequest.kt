//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.enrollmentrequest

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Enroll in coverage
 *
 * This resource provides the insurance enrollment details to the insurer regarding a specified
 * coverage.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | cancelled | draft | entered-in-error
 * @param created Creation date
 * @param insurer Target
 * @param provider Responsible practitioner
 * @param candidate The subject to be enrolled
 * @param coverage Insurance information
 */
@SerialName("EnrollmentRequest")
@Serializable
public data class EnrollmentRequest(
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
   * Creation date
   */
  public val created: String? = null,
  /**
   * Target
   */
  public val insurer: Reference? = null,
  /**
   * Responsible practitioner
   */
  public val provider: Reference? = null,
  /**
   * The subject to be enrolled
   */
  public val candidate: Reference? = null,
  /**
   * Insurance information
   */
  public val coverage: Reference? = null,
) : DomainResource
