//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.device

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
@SerialName("DeviceSpecialization")
@Serializable
public data class DeviceSpecialization(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The standard that is used to operate and communicate
   */
  public val systemType: CodeableConcept,
  /**
   * The version of the standard that is used to operate and communicate
   */
  public val version: String? = null,
) : BackboneElement
