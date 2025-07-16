//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.imagingselection

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
@SerialName("ImagingSelectionImageRegion3D")
@Serializable
public data class ImagingSelectionImageRegion3D(
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
