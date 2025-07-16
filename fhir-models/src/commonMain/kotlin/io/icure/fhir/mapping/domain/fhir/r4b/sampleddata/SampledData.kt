//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.sampleddata

import io.icure.fhir.mapping.domain.fhir.r4b.Element
import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
 * @param period Number of milliseconds between samples
 * @param factor Multiply data by this before adding to origin
 * @param lowerLimit Lower limit of detection
 * @param upperLimit Upper limit of detection
 * @param dimensions Number of sample points at each time point
 * @param data Decimal values with spaces, or "E" | "U" | "L"
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
   * Number of milliseconds between samples
   */
  public val period: Float? = null,
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
   * Decimal values with spaces, or "E" | "U" | "L"
   */
  public val `data`: String? = null,
) : Element
