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
 * Unique Device Identifier (UDI) Barcode string
 *
 * Unique device identifier (UDI) assigned to device label or package.  Note that the Device may
 * include multiple udiCarriers as it either may include just the udiCarrier for the jurisdiction it is
 * sold, or for multiple jurisdictions it could have been sold.
 *
 * @param id Unique id for inter-element referencing
 * @param deviceIdentifier The identifier that is to be associated with every Device that references
 * this DeviceDefintiion for the issuer and jurisdication porvided in the
 * DeviceDefinition.udiDeviceIdentifier
 * @param issuer The organization that assigns the identifier algorithm
 * @param jurisdiction The jurisdiction to which the deviceIdentifier applies
 */
@SerialName("DeviceDefinitionUdiDeviceIdentifier")
@Serializable
public data class DeviceDefinitionUdiDeviceIdentifier(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The identifier that is to be associated with every Device that references this DeviceDefintiion
   * for the issuer and jurisdication porvided in the DeviceDefinition.udiDeviceIdentifier
   */
  public val deviceIdentifier: String? = null,
  /**
   * The organization that assigns the identifier algorithm
   */
  public val issuer: String? = null,
  /**
   * The jurisdiction to which the deviceIdentifier applies
   */
  public val jurisdiction: String? = null,
) : BackboneElement
