//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.imagingstudy

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A single SOP instance from the series
 *
 * A single SOP instance within the series, e.g. an image, or presentation state.
 *
 * @param id Unique id for inter-element referencing
 * @param uid DICOM SOP Instance UID
 * @param sopClass DICOM class type
 * @param number The number of this instance in the series
 * @param title Description of instance
 */
@SerialName("ImagingStudySeriesInstance")
@Serializable
public data class ImagingStudySeriesInstance(
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
   * DICOM class type
   */
  public val sopClass: Coding,
  /**
   * The number of this instance in the series
   */
  public val number: Int? = null,
  /**
   * Description of instance
   */
  public val title: String? = null,
) : BackboneElement
