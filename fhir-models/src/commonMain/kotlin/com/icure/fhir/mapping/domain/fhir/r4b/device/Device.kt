//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.device

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Item used in healthcare
 *
 * A type of a manufactured item that is used in the provision of healthcare without being
 * substantially changed through that activity. The device may be a medical or non-medical device.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param definition The reference to the definition for the device
 * @param status active | inactive | entered-in-error | unknown
 * @param distinctIdentifier The distinct identification string
 * @param manufacturer Name of device manufacturer
 * @param manufactureDate Date when the device was made
 * @param expirationDate Date and time of expiry of this device (if applicable)
 * @param lotNumber Lot number of manufacture
 * @param serialNumber Serial number assigned by the manufacturer
 * @param modelNumber The manufacturer's model number for the device
 * @param partNumber The part number or catalog number of the device
 * @param type The kind or type of device
 * @param patient Patient to whom Device is affixed
 * @param owner Organization responsible for device
 * @param location Where the device is found
 * @param url Network address to contact device
 * @param parent The device that this device is attached to or is part of
 */
@SerialName("Device")
@Serializable
public data class Device(
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
   * The reference to the definition for the device
   */
  public val definition: Reference? = null,
  public val udiCarrier: List<DeviceUdiCarrier> = emptyList(),
  /**
   * active | inactive | entered-in-error | unknown
   */
  public val status: String? = null,
  public val statusReason: List<CodeableConcept> = emptyList(),
  /**
   * The distinct identification string
   */
  public val distinctIdentifier: String? = null,
  /**
   * Name of device manufacturer
   */
  public val manufacturer: String? = null,
  /**
   * Date when the device was made
   */
  public val manufactureDate: String? = null,
  /**
   * Date and time of expiry of this device (if applicable)
   */
  public val expirationDate: String? = null,
  /**
   * Lot number of manufacture
   */
  public val lotNumber: String? = null,
  /**
   * Serial number assigned by the manufacturer
   */
  public val serialNumber: String? = null,
  public val deviceName: List<DeviceDeviceName> = emptyList(),
  /**
   * The manufacturer's model number for the device
   */
  public val modelNumber: String? = null,
  /**
   * The part number or catalog number of the device
   */
  public val partNumber: String? = null,
  /**
   * The kind or type of device
   */
  public val type: CodeableConcept? = null,
  public val specialization: List<DeviceSpecialization> = emptyList(),
  public val version: List<DeviceVersion> = emptyList(),
  public val `property`: List<DeviceProperty> = emptyList(),
  /**
   * Patient to whom Device is affixed
   */
  public val patient: Reference? = null,
  /**
   * Organization responsible for device
   */
  public val owner: Reference? = null,
  public val contact: List<ContactPoint> = emptyList(),
  /**
   * Where the device is found
   */
  public val location: Reference? = null,
  /**
   * Network address to contact device
   */
  public val url: String? = null,
  public val note: List<Annotation> = emptyList(),
  public val safety: List<CodeableConcept> = emptyList(),
  /**
   * The device that this device is attached to or is part of
   */
  public val parent: Reference? = null,
) : DomainResource
