//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.substancesourcematerial

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * To do
 *
 * To do.
 *
 * @param id Unique id for inter-element referencing
 * @param part Entity of anatomical origin of source material within an organism
 * @param partLocation The detailed anatomic location when the part can be extracted from different
 * anatomical locations of the organism. Multiple alternative locations may apply
 */
@SerialName("SubstanceSourceMaterialPartDescription")
@Serializable
public data class SubstanceSourceMaterialPartDescription(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Entity of anatomical origin of source material within an organism
   */
  public val part: CodeableConcept? = null,
  /**
   * The detailed anatomic location when the part can be extracted from different anatomical
   * locations of the organism. Multiple alternative locations may apply
   */
  public val partLocation: CodeableConcept? = null,
) : BackboneElement
