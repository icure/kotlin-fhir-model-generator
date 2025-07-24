//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.imagingselection

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The selected instances
 *
 * Each imaging selection includes one or more selected DICOM SOP instances.
 *
 * @param id Unique id for inter-element referencing
 * @param uid DICOM SOP Instance UID
 * @param number DICOM Instance Number
 * @param sopClass DICOM SOP Class UID
 */
@SerialName("ImagingSelectionInstance")
@Serializable
public data class ImagingSelectionInstance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * DICOM SOP Instance UID
   */
  public val uid: String? = null,
  /**
   * DICOM Instance Number
   */
  public val number: Int? = null,
  /**
   * DICOM SOP Class UID
   */
  public val sopClass: Coding? = null,
  public val subset: List<String> = emptyList(),
  public val imageRegion2D: List<ImagingSelectionInstanceImageRegion2D> = emptyList(),
  public val imageRegion3D: List<ImagingSelectionInstanceImageRegion3D> = emptyList(),
) : BackboneElement
