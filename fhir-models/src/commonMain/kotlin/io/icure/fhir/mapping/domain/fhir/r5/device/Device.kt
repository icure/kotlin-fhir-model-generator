//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.device

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r5.count.Count
import io.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param displayName The name used to display by default when the device is referenced
 * @param definition The reference to the definition for the device
 * @param status active | inactive | entered-in-error
 * @param availabilityStatus lost | damaged | destroyed | available
 * @param biologicalSourceEvent An identifier that supports traceability to the event during which
 * material in this product from one or more biological entities was obtained or pooled
 * @param manufacturer Name of device manufacturer
 * @param manufactureDate Date when the device was made
 * @param expirationDate Date and time of expiry of this device (if applicable)
 * @param lotNumber Lot number of manufacture
 * @param serialNumber Serial number assigned by the manufacturer
 * @param modelNumber The manufacturer's model number for the device
 * @param partNumber The part number or catalog number of the device
 * @param mode The designated condition for performing a task
 * @param cycle The series of occurrences that repeats during the operation of the device
 * @param duration A measurement of time during the device's operation (e.g., days, hours, mins,
 * etc.)
 * @param owner Organization responsible for device
 * @param location Where the device is found
 * @param url Network address to contact device
 * @param parent The higher level or encompassing device that this device is a logical part of
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
   * The name used to display by default when the device is referenced
   */
  public val displayName: String? = null,
  /**
   * The reference to the definition for the device
   */
  public val definition: CodeableReference? = null,
  public val udiCarrier: List<DeviceUdiCarrier> = emptyList(),
  /**
   * active | inactive | entered-in-error
   */
  public val status: String? = null,
  /**
   * lost | damaged | destroyed | available
   */
  public val availabilityStatus: CodeableConcept? = null,
  /**
   * An identifier that supports traceability to the event during which material in this product
   * from one or more biological entities was obtained or pooled
   */
  public val biologicalSourceEvent: Identifier? = null,
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
  public val name: List<DeviceName> = emptyList(),
  /**
   * The manufacturer's model number for the device
   */
  public val modelNumber: String? = null,
  /**
   * The part number or catalog number of the device
   */
  public val partNumber: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  public val type: List<CodeableConcept> = emptyList(),
  public val version: List<DeviceVersion> = emptyList(),
  public val conformsTo: List<DeviceConformsTo> = emptyList(),
  public val `property`: List<DeviceProperty> = emptyList(),
  /**
   * The designated condition for performing a task
   */
  public val mode: CodeableConcept? = null,
  /**
   * The series of occurrences that repeats during the operation of the device
   */
  public val cycle: Count? = null,
  /**
   * A measurement of time during the device's operation (e.g., days, hours, mins, etc.)
   */
  public val duration: Duration? = null,
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
  public val endpoint: List<Reference> = emptyList(),
  public val gateway: List<CodeableReference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val safety: List<CodeableConcept> = emptyList(),
  /**
   * The higher level or encompassing device that this device is a logical part of
   */
  public val parent: Reference? = null,
) : DomainResource
