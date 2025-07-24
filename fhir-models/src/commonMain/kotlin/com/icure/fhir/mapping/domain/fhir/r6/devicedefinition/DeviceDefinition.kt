//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.productshelflife.ProductShelfLife
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param description Additional information to describe the device
 * @param partNumber The part number or catalog number of the device
 * @param manufacturer Name of device manufacturer
 * @param modelNumber The catalog or model number for the device for example as defined by the
 * manufacturer
 * @param owner Organization responsible for device
 * @param guideline Information aimed at providing directions for the usage of this model of device
 * @param correctiveAction Tracking of latest field safety corrective action
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
  /**
   * Additional information to describe the device
   */
  public val description: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  public val udiDeviceIdentifier: List<DeviceDefinitionUdiDeviceIdentifier> = emptyList(),
  public val regulatoryIdentifier: List<DeviceDefinitionRegulatoryIdentifier> = emptyList(),
  /**
   * The part number or catalog number of the device
   */
  public val partNumber: String? = null,
  /**
   * Name of device manufacturer
   */
  public val manufacturer: Reference? = null,
  public val deviceName: List<DeviceDefinitionDeviceName> = emptyList(),
  /**
   * The catalog or model number for the device for example as defined by the manufacturer
   */
  public val modelNumber: String? = null,
  public val classification: List<DeviceDefinitionClassification> = emptyList(),
  public val conformsTo: List<DeviceDefinitionConformsTo> = emptyList(),
  public val hasPart: List<DeviceDefinitionHasPart> = emptyList(),
  public val packaging: List<DeviceDefinitionPackaging> = emptyList(),
  public val version: List<DeviceDefinitionVersion> = emptyList(),
  public val safety: List<CodeableConcept> = emptyList(),
  public val shelfLifeStorage: List<ProductShelfLife> = emptyList(),
  public val languageCode: List<CodeableConcept> = emptyList(),
  public val `property`: List<DeviceDefinitionProperty> = emptyList(),
  /**
   * Organization responsible for device
   */
  public val owner: Reference? = null,
  public val contact: List<ContactPoint> = emptyList(),
  public val link: List<DeviceDefinitionLink> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val material: List<DeviceDefinitionMaterial> = emptyList(),
  public val productionIdentifierInUDI: List<String> = emptyList(),
  /**
   * Information aimed at providing directions for the usage of this model of device
   */
  public val guideline: DeviceDefinitionGuideline? = null,
  /**
   * Tracking of latest field safety corrective action
   */
  public val correctiveAction: DeviceDefinitionCorrectiveAction? = null,
  public val chargeItem: List<DeviceDefinitionChargeItem> = emptyList(),
) : DomainResource
