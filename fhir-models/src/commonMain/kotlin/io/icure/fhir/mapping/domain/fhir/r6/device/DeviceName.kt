//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.device

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The name or names of the device as known to the manufacturer and/or patient
 *
 * This represents the manufacturer's name of the device as provided by the device, from a UDI
 * label, or by a person describing the Device.  This typically would be used when a person provides
 * the name(s) or when the device represents one of the names available from DeviceDefinition.
 *
 * @param id Unique id for inter-element referencing
 * @param value The term that names the device
 * @param type registered-name | user-friendly-name | patient-reported-name
 * @param display The preferred device name
 */
@SerialName("DeviceName")
@Serializable
public data class DeviceName(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The term that names the device
   */
  public val `value`: String? = null,
  /**
   * registered-name | user-friendly-name | patient-reported-name
   */
  public val type: String? = null,
  /**
   * The preferred device name
   */
  public val display: Boolean? = null,
) : BackboneElement
