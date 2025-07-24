//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.imagingselection

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A specific 3D region in a DICOM frame of reference
 *
 * Each imaging selection might includes a 3D image region, specified by a region type and a set of
 * 3D coordinates.
 *
 * @param id Unique id for inter-element referencing
 * @param regionType point | multipoint | polyline | polygon | ellipse | ellipsoid
 */
@SerialName("ImagingSelectionInstanceImageRegion3D")
@Serializable
public data class ImagingSelectionInstanceImageRegion3D(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * point | multipoint | polyline | polygon | ellipse | ellipsoid
   */
  public val regionType: String? = null,
  public val coordinate: List<Float> = emptyList(),
) : BackboneElement
