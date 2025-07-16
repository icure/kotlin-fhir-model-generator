//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.device

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
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
