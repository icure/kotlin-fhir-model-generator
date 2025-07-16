//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.practitioner

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.address.Address
import io.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r6.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.healthcarepartylike.HealthcarePartyLike
import io.icure.fhir.mapping.domain.fhir.r6.humanname.HumanName
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A person with a  formal responsibility in the provisioning of healthcare or related services
 *
 * A person who is directly or indirectly involved in the provisioning of healthcare or related
 * services.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param active Whether this practitioner's record is in active use
 * @param gender male | female | other | unknown
 * @param birthDate The date  on which the practitioner was born
 * @param deceasedBoolean Indicates if the practitioner is deceased or not
 * @param deceasedDateTime Indicates if the practitioner is deceased or not
 */
@SerialName("Practitioner")
@Serializable
public data class Practitioner(
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
   * Whether this practitioner's record is in active use
   */
  public val active: Boolean? = null,
  public val name: List<HumanName> = emptyList(),
  public val telecom: List<ContactPoint> = emptyList(),
  /**
   * male | female | other | unknown
   */
  public val gender: String? = null,
  /**
   * The date  on which the practitioner was born
   */
  public val birthDate: String? = null,
  /**
   * Indicates if the practitioner is deceased or not
   */
  public val deceasedBoolean: Boolean? = null,
  /**
   * Indicates if the practitioner is deceased or not
   */
  public val deceasedDateTime: String? = null,
  public val address: List<Address> = emptyList(),
  public val photo: List<Attachment> = emptyList(),
  public val qualification: List<PractitionerQualification> = emptyList(),
  public val communication: List<PractitionerCommunication> = emptyList(),
) : HealthcarePartyLike, DomainResource
