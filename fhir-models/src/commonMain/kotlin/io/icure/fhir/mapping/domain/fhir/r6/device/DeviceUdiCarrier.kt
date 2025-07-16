//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.device

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
 * @param deviceIdentifier Mandatory fixed portion of UDI
 * @param issuer UDI Issuing Organization
 * @param jurisdiction Regional UDI authority
 * @param carrierAIDC UDI Machine Readable Barcode String
 * @param carrierHRF UDI Human Readable Barcode String
 * @param entryType barcode | rfid | manual | card | self-reported | electronic-transmission |
 * unknown
 */
@SerialName("DeviceUdiCarrier")
@Serializable
public data class DeviceUdiCarrier(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Mandatory fixed portion of UDI
   */
  public val deviceIdentifier: String? = null,
  /**
   * UDI Issuing Organization
   */
  public val issuer: String? = null,
  /**
   * Regional UDI authority
   */
  public val jurisdiction: String? = null,
  /**
   * UDI Machine Readable Barcode String
   */
  public val carrierAIDC: String? = null,
  /**
   * UDI Human Readable Barcode String
   */
  public val carrierHRF: String? = null,
  /**
   * barcode | rfid | manual | card | self-reported | electronic-transmission | unknown
   */
  public val entryType: String? = null,
) : BackboneElement
