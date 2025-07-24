//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.device

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
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
 * @param component The hardware or software module of the device to which the version applies
 * @param installDate The date the version was installed on the device
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
   * The hardware or software module of the device to which the version applies
   */
  public val component: Identifier? = null,
  /**
   * The date the version was installed on the device
   */
  public val installDate: String? = null,
  /**
   * The version text
   */
  public val `value`: String? = null,
) : BackboneElement
