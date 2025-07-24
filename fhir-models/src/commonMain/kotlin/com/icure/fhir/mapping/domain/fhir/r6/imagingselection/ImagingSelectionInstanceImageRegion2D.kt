//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.imagingselection

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A specific 2D region in a DICOM image / frame
 *
 * Each imaging selection instance or frame list might includes an image region, specified by a
 * region type and a set of 2D coordinates.
 *        If the parent imagingSelection.instance contains a subset element of type frame, the image
 * region applies to all frames in the subset list.
 *
 * @param id Unique id for inter-element referencing
 * @param regionType point | polyline | interpolated | circle | ellipse
 */
@SerialName("ImagingSelectionInstanceImageRegion2D")
@Serializable
public data class ImagingSelectionInstanceImageRegion2D(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * point | polyline | interpolated | circle | ellipse
   */
  public val regionType: String? = null,
  public val coordinate: List<Float> = emptyList(),
) : BackboneElement
