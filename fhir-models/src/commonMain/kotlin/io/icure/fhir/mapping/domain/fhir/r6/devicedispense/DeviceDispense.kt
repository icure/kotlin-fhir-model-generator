//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.devicedispense

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A record of dispensation of a device
 *
 * A record of dispensation of a device - i.e., assigning a device to a patient, or to a
 * professional for their use.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status preparation | in-progress | cancelled | on-hold | completed | entered-in-error |
 * stopped | declined | unknown
 * @param statusReason Why a dispense was or was not performed
 * @param device What device was supplied
 * @param subject Who the dispense is for
 * @param receiver Who collected the device or where the medication was delivered
 * @param encounter Encounter associated with event
 * @param location Where the dispense occurred
 * @param type Trial fill, partial fill, emergency fill, etc
 * @param quantity Amount dispensed
 * @param preparedDate When product was packaged and reviewed
 * @param whenHandedOver When product was given out
 * @param destination Where the device was sent or should be sent
 * @param usageInstruction Full representation of the usage instructions
 */
@SerialName("DeviceDispense")
@Serializable
public data class DeviceDispense(
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
  public val basedOn: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * preparation | in-progress | cancelled | on-hold | completed | entered-in-error | stopped |
   * declined | unknown
   */
  public val status: String? = null,
  /**
   * Why a dispense was or was not performed
   */
  public val statusReason: CodeableReference? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * What device was supplied
   */
  public val device: CodeableReference,
  /**
   * Who the dispense is for
   */
  public val subject: Reference,
  /**
   * Who collected the device or where the medication was delivered
   */
  public val `receiver`: Reference? = null,
  /**
   * Encounter associated with event
   */
  public val encounter: Reference? = null,
  public val supportingInformation: List<Reference> = emptyList(),
  public val performer: List<DeviceDispensePerformer> = emptyList(),
  /**
   * Where the dispense occurred
   */
  public val location: Reference? = null,
  /**
   * Trial fill, partial fill, emergency fill, etc
   */
  public val type: CodeableConcept? = null,
  /**
   * Amount dispensed
   */
  public val quantity: Quantity? = null,
  /**
   * When product was packaged and reviewed
   */
  public val preparedDate: String? = null,
  /**
   * When product was given out
   */
  public val whenHandedOver: String? = null,
  /**
   * Where the device was sent or should be sent
   */
  public val destination: Reference? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * Full representation of the usage instructions
   */
  public val usageInstruction: String? = null,
  public val eventHistory: List<Reference> = emptyList(),
) : DomainResource
