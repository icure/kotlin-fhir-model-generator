//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.practitionerrole

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.availability.Availability
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extendedcontactdetail.ExtendedContactDetail
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
  public val availability: List<Availability> = emptyList(),
  public val endpoint: List<Reference> = emptyList(),
) : DomainResource
