//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.bodystructure

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Included anatomic location(s)
 *
 * The anatomical location(s) or region(s) of the specimen, lesion, or body structure.
 *
 * @param id Unique id for inter-element referencing
 * @param structure Code that represents the included structure
 * @param laterality Code that represents the included structure laterality
 */
@SerialName("BodyStructureIncludedStructure")
@Serializable
public data class BodyStructureIncludedStructure(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code that represents the included structure
   */
  public val structure: CodeableConcept,
  /**
   * Code that represents the included structure laterality
   */
  public val laterality: CodeableConcept? = null,
  public val bodyLandmarkOrientation: List<BodyStructureIncludedStructureBodyLandmarkOrientation> =
      emptyList(),
  public val spatialReference: List<Reference> = emptyList(),
  public val qualifier: List<CodeableConcept> = emptyList(),
) : BackboneElement
