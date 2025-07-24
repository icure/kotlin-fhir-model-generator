//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.patient

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
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about an individual or animal receiving health care services
 *
 * Demographics and other administrative information about an individual or animal receiving care or
 * other health-related services.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param active Whether this patient's record is in active use
 * @param gender male | female | other | unknown
 * @param birthDate The date of birth for the individual
 * @param deceasedBoolean Indicates if the individual is deceased or not
 * @param deceasedDateTime Indicates if the individual is deceased or not
 * @param maritalStatus Marital (civil) status of a patient
 * @param multipleBirthBoolean Whether patient is part of a multiple birth
 * @param multipleBirthInteger Whether patient is part of a multiple birth
 * @param managingOrganization Organization that is the custodian of the patient record
 */
@SerialName("Patient")
@Serializable
public data class Patient(
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
   * Whether this patient's record is in active use
   */
  public val active: Boolean? = null,
  public val name: List<HumanName> = emptyList(),
  public val telecom: List<ContactPoint> = emptyList(),
  /**
   * male | female | other | unknown
   */
  public val gender: String? = null,
  /**
   * The date of birth for the individual
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
   * Marital (civil) status of a patient
   */
  public val maritalStatus: CodeableConcept? = null,
  /**
   * Whether patient is part of a multiple birth
   */
  public val multipleBirthBoolean: Boolean? = null,
  /**
   * Whether patient is part of a multiple birth
   */
  public val multipleBirthInteger: Int? = null,
  public val photo: List<Attachment> = emptyList(),
  public val contact: List<PatientContact> = emptyList(),
  public val communication: List<PatientCommunication> = emptyList(),
  public val generalPractitioner: List<Reference> = emptyList(),
  /**
   * Organization that is the custodian of the patient record
   */
  public val managingOrganization: Reference? = null,
  public val link: List<PatientLink> = emptyList(),
) : DomainResource
