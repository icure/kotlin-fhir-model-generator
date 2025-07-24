//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.devicemetric

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes the calibrations that have been performed or that are required to be performed
 *
 * Describes the calibrations that have been performed or that are required to be performed.
 *
 * @param id Unique id for inter-element referencing
 * @param type unspecified | offset | gain | two-point
 * @param state not-calibrated | calibration-required | calibrated | unspecified
 * @param time Describes the time last calibration has been performed
 */
@SerialName("DeviceMetricCalibration")
@Serializable
public data class DeviceMetricCalibration(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * unspecified | offset | gain | two-point
   */
  public val type: String? = null,
  /**
   * not-calibrated | calibration-required | calibrated | unspecified
   */
  public val state: String? = null,
  /**
   * Describes the time last calibration has been performed
   */
  public val time: String? = null,
) : BackboneElement
