//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.substancedefinition

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The average mass of a molecule of a compound
 *
 * The average mass of a molecule of a compound compared to 1/12 the mass of carbon 12 and
 * calculated as the sum of the atomic weights of the constituent atoms.
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
