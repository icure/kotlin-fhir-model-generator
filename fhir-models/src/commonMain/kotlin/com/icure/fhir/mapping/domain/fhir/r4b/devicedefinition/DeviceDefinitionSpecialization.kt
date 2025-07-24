//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The capabilities supported on a  device, the standards to which the device conforms for a
 * particular purpose, and used for the communication
 *
 * The capabilities supported on a  device, the standards to which the device conforms for a
 * particular purpose, and used for the communication.
 *
 * @param id Unique id for inter-element referencing
 * @param systemType The standard that is used to operate and communicate
 * @param version The version of the standard that is used to operate and communicate
 */
@SerialName("DeviceDefinitionSpecialization")
@Serializable
public data class DeviceDefinitionSpecialization(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The standard that is used to operate and communicate
   */
  public val systemType: String? = null,
  /**
   * The version of the standard that is used to operate and communicate
   */
  public val version: String? = null,
) : BackboneElement
