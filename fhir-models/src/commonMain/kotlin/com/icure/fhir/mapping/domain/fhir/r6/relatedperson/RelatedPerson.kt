//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.relatedperson

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.address.Address
import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.humanname.HumanName
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A person that is related to a patient, but who is not a direct target of care
 *
 * Information about a person that is involved in a patient's health or the care for a patient, but
 * who is not the primary target of healthcare.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param active Whether this related person's record is in active use
 * @param patient The patient this person is related to
 * @param gender male | female | other | unknown
 * @param birthDate The date on which the related person was born
 * @param period Period of time that this relationship is considered valid
 */
@SerialName("RelatedPerson")
@Serializable
public data class RelatedPerson(
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
   * Whether this related person's record is in active use
   */
  public val active: Boolean? = null,
  /**
   * The patient this person is related to
   */
  public val patient: Reference,
  public val relationship: List<CodeableConcept> = emptyList(),
  public val name: List<HumanName> = emptyList(),
  public val telecom: List<ContactPoint> = emptyList(),
  /**
   * male | female | other | unknown
   */
  public val gender: String? = null,
  /**
   * The date on which the related person was born
   */
  public val birthDate: String? = null,
  public val address: List<Address> = emptyList(),
  public val photo: List<Attachment> = emptyList(),
  /**
   * Period of time that this relationship is considered valid
   */
  public val period: Period? = null,
  public val communication: List<RelatedPersonCommunication> = emptyList(),
) : DomainResource
