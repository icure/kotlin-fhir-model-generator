//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.bodystructure

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
