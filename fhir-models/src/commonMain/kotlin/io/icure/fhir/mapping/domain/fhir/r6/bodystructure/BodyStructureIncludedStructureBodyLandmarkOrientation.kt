//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.bodystructure

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Landmark relative location
 *
 * Body locations in relation to a specific body landmark (tatoo, scar, other body structure).
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("BodyStructureIncludedStructureBodyLandmarkOrientation")
@Serializable
public data class BodyStructureIncludedStructureBodyLandmarkOrientation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val landmarkDescription: List<CodeableConcept> = emptyList(),
  public val clockFacePosition: List<CodeableConcept> = emptyList(),
  public val distanceFromLandmark:
      List<BodyStructureIncludedStructureBodyLandmarkOrientationDistanceFromLandmark> = emptyList(),
  public val surfaceOrientation: List<CodeableConcept> = emptyList(),
) : BackboneElement
