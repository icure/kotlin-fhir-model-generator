//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.organization

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extendedcontactdetail.ExtendedContactDetail
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.healthcarepartylike.HealthcarePartyLike
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A grouping of people or organizations with a common purpose
 *
 * A formally or informally recognized grouping of people or organizations formed for the purpose of
 * achieving some form of collective action.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param active Whether the organization's record is still in active use
 * @param name Name used for the organization
 * @param description Additional details about the Organization that could be displayed as further
 * information to identify the Organization beyond its name
 * @param partOf The organization of which this organization forms a part
 */
@SerialName("Organization")
@Serializable
public data class Organization(
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
   * Whether the organization's record is still in active use
   */
  public val active: Boolean? = null,
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * Name used for the organization
   */
  public val name: String? = null,
  public val alias: List<String> = emptyList(),
  /**
   * Additional details about the Organization that could be displayed as further information to
   * identify the Organization beyond its name
   */
  public val description: String? = null,
  public val contact: List<ExtendedContactDetail> = emptyList(),
  /**
   * The organization of which this organization forms a part
   */
  public val partOf: Reference? = null,
  public val endpoint: List<Reference> = emptyList(),
  public val qualification: List<OrganizationQualification> = emptyList(),
) : HealthcarePartyLike, DomainResource
