//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.location

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The absolute geographic location
 *
 * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the
 * same co-ordinate system used in KML).
 *
 * @param id Unique id for inter-element referencing
 * @param longitude Longitude with WGS84 datum
 * @param latitude Latitude with WGS84 datum
 * @param altitude Altitude with WGS84 datum
 */
@SerialName("LocationPosition")
@Serializable
public data class LocationPosition(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Longitude with WGS84 datum
   */
  public val longitude: Float? = null,
  /**
   * Latitude with WGS84 datum
   */
  public val latitude: Float? = null,
  /**
   * Altitude with WGS84 datum
   */
  public val altitude: Float? = null,
) : BackboneElement
