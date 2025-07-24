//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.healthcareservice

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.availability.Availability
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extendedcontactdetail.ExtendedContactDetail
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The details of a healthcare service available at a location
 *
 * The details of a healthcare service available at a location.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param active Whether this HealthcareService record is in active use
 * @param providedBy Organization that provides this service
 * @param name Description of service as presented to a consumer while searching
 * @param comment Additional description and/or any specific issues not covered elsewhere
 * @param extraDetails Extra details about the service that can't be placed in the other fields
 * @param photo Facilitates quick identification of the service
 * @param referralRequired A referral is required for access to this service
 * @param appointmentRequired An appointment is required for access to this service
 * @param availability Times the healthcare service is available (including exceptions)
 */
@SerialName("HealthcareService")
@Serializable
public data class HealthcareService(
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
   * Whether this HealthcareService record is in active use
   */
  public val active: Boolean? = null,
  /**
   * Organization that provides this service
   */
  public val providedBy: Reference? = null,
  public val offeredIn: List<Reference> = emptyList(),
  public val category: List<CodeableConcept> = emptyList(),
  public val type: List<CodeableConcept> = emptyList(),
  public val specialty: List<CodeableConcept> = emptyList(),
  public val location: List<Reference> = emptyList(),
  /**
   * Description of service as presented to a consumer while searching
   */
  public val name: String? = null,
  /**
   * Additional description and/or any specific issues not covered elsewhere
   */
  public val comment: String? = null,
  /**
   * Extra details about the service that can't be placed in the other fields
   */
  public val extraDetails: String? = null,
  /**
   * Facilitates quick identification of the service
   */
  public val photo: Attachment? = null,
  public val contact: List<ExtendedContactDetail> = emptyList(),
  public val coverageArea: List<Reference> = emptyList(),
  public val serviceProvisionCode: List<CodeableConcept> = emptyList(),
  public val eligibility: List<HealthcareServiceEligibility> = emptyList(),
  public val program: List<CodeableConcept> = emptyList(),
  public val characteristic: List<CodeableConcept> = emptyList(),
  public val communication: List<CodeableConcept> = emptyList(),
  public val referralMethod: List<CodeableConcept> = emptyList(),
  /**
   * A referral is required for access to this service
   */
  public val referralRequired: Boolean? = null,
  /**
   * An appointment is required for access to this service
   */
  public val appointmentRequired: Boolean? = null,
  /**
   * Times the healthcare service is available (including exceptions)
   */
  public val availability: Availability? = null,
  public val endpoint: List<Reference> = emptyList(),
) : DomainResource
