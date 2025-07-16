//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.practitionerrole

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param practitioner Practitioner that is able to provide the defined services for the
 * organization
 * @param organization Organization where the roles are available
 * @param availabilityExceptions Description of availability exceptions
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
   * Practitioner that is able to provide the defined services for the organization
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
  public val telecom: List<ContactPoint> = emptyList(),
  public val availableTime: List<PractitionerRoleAvailableTime> = emptyList(),
  public val notAvailable: List<PractitionerRoleNotAvailable> = emptyList(),
  /**
   * Description of availability exceptions
   */
  public val availabilityExceptions: String? = null,
  public val endpoint: List<Reference> = emptyList(),
) : DomainResource
