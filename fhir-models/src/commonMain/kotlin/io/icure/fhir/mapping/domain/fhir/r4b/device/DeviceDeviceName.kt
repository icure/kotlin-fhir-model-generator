//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.device

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The name of the device as given by the manufacturer
 *
 * This represents the manufacturer's name of the device as provided by the device, from a UDI
 * label, or by a person describing the Device.  This typically would be used when a person provides
 * the name(s) or when the device represents one of the names available from DeviceDefinition.
 *
 * @param id Unique id for inter-element referencing
 * @param name The name that identifies the device
 * @param type udi-label-name | user-friendly-name | patient-reported-name | manufacturer-name |
 * model-name | other
 */
@SerialName("DeviceDeviceName")
@Serializable
public data class DeviceDeviceName(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The name that identifies the device
   */
  public val name: String? = null,
  /**
   * udi-label-name | user-friendly-name | patient-reported-name | manufacturer-name | model-name |
   * other
   */
  public val type: String? = null,
) : BackboneElement
