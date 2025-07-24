//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.substancepolymer

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
