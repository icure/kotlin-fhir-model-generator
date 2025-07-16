//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.practitionerrole

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.availability.Availability
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extendedcontactdetail.ExtendedContactDetail
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Roles/organizations the practitioner is associated with
 *
 * A specific set of Roles/Locations/specialties/services that a practitioner may perform at an
 * organization for a period of time.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param active Whether this practitioner role record is in active use
 * @param period The period during which the practitioner is authorized to perform in these role(s)
 * @param practitioner Practitioner that provides services for the organization
 * @param organization Organization where the roles are available
 * @param availability Times the Practitioner is available at this location and/or healthcare
 * service (including exceptions)
 */
@SerialName("PractitionerRole")
@Serializable
public data class PractitionerRole(
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
   * Whether this practitioner role record is in active use
   */
  public val active: Boolean? = null,
  /**
   * The period during which the practitioner is authorized to perform in these role(s)
   */
  public val period: Period? = null,
  /**
   * Practitioner that provides services for the organization
   */
  public val practitioner: Reference? = null,
  /**
   * Organization where the roles are available
   */
  public val organization: Reference? = null,
  public val code: List<CodeableConcept> = emptyList(),
  public val specialty: List<CodeableConcept> = emptyList(),
  public val location: List<Reference> = emptyList(),
  public val healthcareService: List<Reference> = emptyList(),
  public val contact: List<ExtendedContactDetail> = emptyList(),
  public val characteristic: List<CodeableConcept> = emptyList(),
  public val communication: List<CodeableConcept> = emptyList(),
  /**
   * Times the Practitioner is available at this location and/or healthcare service (including
   * exceptions)
   */
  public val availability: Availability? = null,
  public val endpoint: List<Reference> = emptyList(),
) : DomainResource
