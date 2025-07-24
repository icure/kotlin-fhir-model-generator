//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.prodcharacteristic.ProdCharacteristic
import com.icure.fhir.mapping.domain.fhir.r4.productshelflife.ProductShelfLife
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An instance of a medical-related component of a medical device
 *
 * The characteristics, operational status and capabilities of a medical-related component of a
 * medical device.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param manufacturerString Name of device manufacturer
 * @param manufacturerReference Name of device manufacturer
 * @param modelNumber The model number for the device
 * @param type What kind of device or device system this is
 * @param physicalCharacteristics Dimensions, color etc.
 * @param owner Organization responsible for device
 * @param url Network address to contact device
 * @param onlineInformation Access to on-line information
 * @param quantity The quantity of the device present in the packaging (e.g. the number of devices
 * present in a pack, or the number of devices in the same package of the medicinal product)
 * @param parentDevice The parent device it can be part of
 */
@SerialName("DeviceDefinition")
@Serializable
public data class DeviceDefinition(
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
  public val udiDeviceIdentifier: List<DeviceDefinitionUdiDeviceIdentifier> = emptyList(),
  /**
   * Name of device manufacturer
   */
  public val manufacturerString: String? = null,
  /**
   * Name of device manufacturer
   */
  public val manufacturerReference: Reference? = null,
  public val deviceName: List<DeviceDefinitionDeviceName> = emptyList(),
  /**
   * The model number for the device
   */
  public val modelNumber: String? = null,
  /**
   * What kind of device or device system this is
   */
  public val type: CodeableConcept? = null,
  public val specialization: List<DeviceDefinitionSpecialization> = emptyList(),
  public val version: List<String> = emptyList(),
  public val safety: List<CodeableConcept> = emptyList(),
  public val shelfLifeStorage: List<ProductShelfLife> = emptyList(),
  /**
   * Dimensions, color etc.
   */
  public val physicalCharacteristics: ProdCharacteristic? = null,
  public val languageCode: List<CodeableConcept> = emptyList(),
  public val capability: List<DeviceDefinitionCapability> = emptyList(),
  public val `property`: List<DeviceDefinitionProperty> = emptyList(),
  /**
   * Organization responsible for device
   */
  public val owner: Reference? = null,
  public val contact: List<ContactPoint> = emptyList(),
  /**
   * Network address to contact device
   */
  public val url: String? = null,
  /**
   * Access to on-line information
   */
  public val onlineInformation: String? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * The quantity of the device present in the packaging (e.g. the number of devices present in a
   * pack, or the number of devices in the same package of the medicinal product)
   */
  public val quantity: Quantity? = null,
  /**
   * The parent device it can be part of
   */
  public val parentDevice: Reference? = null,
  public val material: List<DeviceDefinitionMaterial> = emptyList(),
) : DomainResource
