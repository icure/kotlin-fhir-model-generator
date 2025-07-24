//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.substancedefinition

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The molecular weight or weight range
 *
 * The molecular weight or weight range (for proteins, polymers or nucleic acids).
 *
 * @param id Unique id for inter-element referencing
 * @param method The method by which the weight was determined
 * @param type Type of molecular weight e.g. exact, average, weight average
 * @param amount Used to capture quantitative values for a variety of elements
 */
@SerialName("SubstanceDefinitionMolecularWeight")
@Serializable
public data class SubstanceDefinitionMolecularWeight(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The method by which the weight was determined
   */
  public val method: CodeableConcept? = null,
  /**
   * Type of molecular weight e.g. exact, average, weight average
   */
  public val type: CodeableConcept? = null,
  /**
   * Used to capture quantitative values for a variety of elements
   */
  public val amount: Quantity,
) : BackboneElement
