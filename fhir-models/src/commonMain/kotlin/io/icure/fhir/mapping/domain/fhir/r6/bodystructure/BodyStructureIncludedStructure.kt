//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.bodystructure

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
