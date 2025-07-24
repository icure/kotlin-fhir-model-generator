//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Indicates whether and when the device is available on the market
 *
 * Indicates where and when the device is available on the market.
 *
 * @param id Unique id for inter-element referencing
 * @param marketPeriod Begin and end dates for the commercial distribution of the device
 * @param subJurisdiction National state or territory where the device is commercialized
 */
@SerialName("DeviceDefinitionUdiDeviceIdentifierMarketDistribution")
@Serializable
public data class DeviceDefinitionUdiDeviceIdentifierMarketDistribution(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Begin and end dates for the commercial distribution of the device
   */
  public val marketPeriod: Period,
  /**
   * National state or territory where the device is commercialized
   */
  public val subJurisdiction: String? = null,
) : BackboneElement
