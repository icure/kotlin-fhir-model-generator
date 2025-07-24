//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.practitionerrole

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
