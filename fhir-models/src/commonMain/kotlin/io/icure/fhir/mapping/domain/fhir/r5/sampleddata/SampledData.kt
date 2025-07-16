//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.sampleddata

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A series of measurements taken by a device
 *
 * A series of measurements taken by a device, with upper and lower limits. There may be more than
 * one dimension in the data.
 *
 * @param id Unique id for inter-element referencing
 * @param origin Zero value and units
 * @param interval Number of intervalUnits between samples
 * @param intervalUnit The measurement unit of the interval between samples
 * @param factor Multiply data by this before adding to origin
 * @param lowerLimit Lower limit of detection
 * @param upperLimit Upper limit of detection
 * @param dimensions Number of sample points at each time point
 * @param codeMap Defines the codes used in the data
 * @param offsets Offsets, typically in time, at which data values were taken
 * @param data Decimal values with spaces, or "E" | "U" | "L", or another code
 */
@SerialName("SampledData")
@Serializable
public data class SampledData(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Zero value and units
   */
  public val origin: Quantity,
  /**
   * Number of intervalUnits between samples
   */
  public val interval: Float? = null,
  /**
   * The measurement unit of the interval between samples
   */
  public val intervalUnit: String? = null,
  /**
   * Multiply data by this before adding to origin
   */
  public val factor: Float? = null,
  /**
   * Lower limit of detection
   */
  public val lowerLimit: Float? = null,
  /**
   * Upper limit of detection
   */
  public val upperLimit: Float? = null,
  /**
   * Number of sample points at each time point
   */
  public val dimensions: Int? = null,
  /**
   * Defines the codes used in the data
   */
  public val codeMap: String? = null,
  /**
   * Offsets, typically in time, at which data values were taken
   */
  public val offsets: String? = null,
  /**
   * Decimal values with spaces, or "E" | "U" | "L", or another code
   */
  public val `data`: String? = null,
) : DataType
