//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.person

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.address.Address
import com.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.humanname.HumanName
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A generic person record
 *
 * Demographics and administrative information about a person independent of a specific
 * health-related context.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param active This person's record is in active use
 * @param gender male | female | other | unknown
 * @param birthDate The date on which the person was born
 * @param deceasedBoolean Indicates if the individual is deceased or not
 * @param deceasedDateTime Indicates if the individual is deceased or not
 * @param maritalStatus Marital (civil) status of a person
 * @param managingOrganization The organization that is the custodian of the person record
 */
@SerialName("Person")
@Serializable
public data class Person(
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
   * This person's record is in active use
   */
  public val active: Boolean? = null,
  public val name: List<HumanName> = emptyList(),
  public val telecom: List<ContactPoint> = emptyList(),
  /**
   * male | female | other | unknown
   */
  public val gender: String? = null,
  /**
   * The date on which the person was born
   */
  public val birthDate: String? = null,
  /**
   * Indicates if the individual is deceased or not
   */
  public val deceasedBoolean: Boolean? = null,
  /**
   * Indicates if the individual is deceased or not
   */
  public val deceasedDateTime: String? = null,
  public val address: List<Address> = emptyList(),
  /**
   * Marital (civil) status of a person
   */
  public val maritalStatus: CodeableConcept? = null,
  public val photo: List<Attachment> = emptyList(),
  public val communication: List<PersonCommunication> = emptyList(),
  /**
   * The organization that is the custodian of the person record
   */
  public val managingOrganization: Reference? = null,
  public val link: List<PersonLink> = emptyList(),
) : DomainResource
