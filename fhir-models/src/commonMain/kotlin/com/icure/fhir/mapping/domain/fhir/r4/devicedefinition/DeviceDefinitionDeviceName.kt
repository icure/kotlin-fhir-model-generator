//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A name given to the device to identify it
 *
 * A name given to the device to identify it.
 *
 * @param id Unique id for inter-element referencing
 * @param name The name of the device
 * @param type udi-label-name | user-friendly-name | patient-reported-name | manufacturer-name |
 * model-name | other
 */
@SerialName("DeviceDefinitionDeviceName")
@Serializable
public data class DeviceDefinitionDeviceName(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The name of the device
   */
  public val name: String? = null,
  /**
   * udi-label-name | user-friendly-name | patient-reported-name | manufacturer-name | model-name |
   * other
   */
  public val type: String? = null,
) : BackboneElement
