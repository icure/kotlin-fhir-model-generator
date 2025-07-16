//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.devicedefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The name or names of the device as given by the manufacturer
 *
 * The name or names of the device as given by the manufacturer.
 *
 * @param id Unique id for inter-element referencing
 * @param name A name that is used to refer to the device
 * @param type registered-name | user-friendly-name | patient-reported-name
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
   * A name that is used to refer to the device
   */
  public val name: String? = null,
  /**
   * registered-name | user-friendly-name | patient-reported-name
   */
  public val type: String? = null,
) : BackboneElement
