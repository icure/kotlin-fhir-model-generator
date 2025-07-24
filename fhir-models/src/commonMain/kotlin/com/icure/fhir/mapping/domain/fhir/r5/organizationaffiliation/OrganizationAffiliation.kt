//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.organizationaffiliation

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
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
 * Defines an affiliation/association/relationship between 2 distinct organizations, that is not a
 * part-of relationship/sub-division relationship
 *
 * Defines an affiliation/association/relationship between 2 distinct organizations, that is not a
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
  public val contact: List<ExtendedContactDetail> = emptyList(),
  public val endpoint: List<Reference> = emptyList(),
) : DomainResource
