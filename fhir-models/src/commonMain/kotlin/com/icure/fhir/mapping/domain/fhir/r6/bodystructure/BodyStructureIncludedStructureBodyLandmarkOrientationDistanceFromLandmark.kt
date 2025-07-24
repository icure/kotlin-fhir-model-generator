//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.bodystructure

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Landmark relative location
 *
 * The distance in centimeters a certain observation is made from a body landmark.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmark")
@Serializable
public data class BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmark(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val device: List<CodeableReference> = emptyList(),
  public val `value`: List<Quantity> = emptyList(),
) : BackboneElement
