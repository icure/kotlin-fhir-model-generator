//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.organizationaffiliation

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a
 * part-of relationship/sub-division relationship
 *
 * Defines an affiliation/assotiation/relationship between 2 distinct oganizations, that is not a
 * part-of relationship/sub-division relationship.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param active Whether this organization affiliation record is in active use
 * @param period The period during which the participatingOrganization is affiliated with the
 * primary organization
 * @param organization Organization where the role is available
 * @param participatingOrganization Organization that provides/performs the role (e.g. providing
 * services or is a member of)
 */
@SerialName("OrganizationAffiliation")
@Serializable
public data class OrganizationAffiliation(
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
   * Whether this organization affiliation record is in active use
   */
  public val active: Boolean? = null,
  /**
   * The period during which the participatingOrganization is affiliated with the primary
   * organization
   */
  public val period: Period? = null,
  /**
   * Organization where the role is available
   */
  public val organization: Reference? = null,
  /**
   * Organization that provides/performs the role (e.g. providing services or is a member of)
   */
  public val participatingOrganization: Reference? = null,
  public val network: List<Reference> = emptyList(),
  public val code: List<CodeableConcept> = emptyList(),
  public val specialty: List<CodeableConcept> = emptyList(),
  public val location: List<Reference> = emptyList(),
  public val healthcareService: List<Reference> = emptyList(),
  public val telecom: List<ContactPoint> = emptyList(),
  public val endpoint: List<Reference> = emptyList(),
) : DomainResource
