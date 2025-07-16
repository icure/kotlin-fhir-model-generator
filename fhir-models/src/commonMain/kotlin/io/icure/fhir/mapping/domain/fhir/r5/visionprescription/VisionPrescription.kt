//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.visionprescription

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Prescription for vision correction products for a patient
 *
 * An authorization for the provision of glasses and/or contact lenses to a patient.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | cancelled | draft | entered-in-error
 * @param created Response creation date
 * @param patient Who prescription is for
 * @param encounter Created during encounter / admission / stay
 * @param dateWritten When prescription was authorized
 * @param prescriber Who authorized the vision prescription
 */
@SerialName("VisionPrescription")
@Serializable
public data class VisionPrescription(
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
   * active | cancelled | draft | entered-in-error
   */
  public val status: String? = null,
  /**
   * Response creation date
   */
  public val created: String? = null,
  /**
   * Who prescription is for
   */
  public val patient: Reference,
  /**
   * Created during encounter / admission / stay
   */
  public val encounter: Reference? = null,
  /**
   * When prescription was authorized
   */
  public val dateWritten: String? = null,
  /**
   * Who authorized the vision prescription
   */
  public val prescriber: Reference,
  public val lensSpecification: List<VisionPrescriptionLensSpecification> = emptyList(),
) : DomainResource
