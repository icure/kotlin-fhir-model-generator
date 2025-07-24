//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.device

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The actual design of the device or software version running on the device
 *
 * The actual design of the device or software version running on the device.
 *
 * @param id Unique id for inter-element referencing
 * @param type The type of the device version, e.g. manufacturer, approved, internal
 * @param component A single component of the device version
 * @param value The version text
 */
@SerialName("DeviceVersion")
@Serializable
public data class DeviceVersion(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of the device version, e.g. manufacturer, approved, internal
   */
  public val type: CodeableConcept? = null,
  /**
   * A single component of the device version
   */
  public val component: Identifier? = null,
  /**
   * The version text
   */
  public val `value`: String? = null,
) : BackboneElement
