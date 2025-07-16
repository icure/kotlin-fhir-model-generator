//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.substancepolymer

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Todo
 *
 * Todo.
 *
 * @param id Unique id for inter-element referencing
 * @param ratioType Captures the type of ratio to the entire polymer, e.g. Monomer/Polymer ratio,
 * SRU/Polymer Ratio
 */
@SerialName("SubstancePolymerMonomerSet")
@Serializable
public data class SubstancePolymerMonomerSet(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Captures the type of ratio to the entire polymer, e.g. Monomer/Polymer ratio, SRU/Polymer Ratio
   */
  public val ratioType: CodeableConcept? = null,
  public val startingMaterial: List<SubstancePolymerMonomerSetStartingMaterial> = emptyList(),
) : BackboneElement
