//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.substancepolymer

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The starting materials - monomer(s) used in the synthesis of the polymer
 *
 * The starting materials - monomer(s) used in the synthesis of the polymer.
 *
 * @param id Unique id for inter-element referencing
 * @param code The type of substance for this starting material
 * @param category Substance high level category, e.g. chemical substance
 * @param isDefining Used to specify whether the attribute described is a defining element for the
 * unique identification of the polymer
 * @param amount A percentage
 */
@SerialName("SubstancePolymerMonomerSetStartingMaterial")
@Serializable
public data class SubstancePolymerMonomerSetStartingMaterial(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of substance for this starting material
   */
  public val code: CodeableConcept? = null,
  /**
   * Substance high level category, e.g. chemical substance
   */
  public val category: CodeableConcept? = null,
  /**
   * Used to specify whether the attribute described is a defining element for the unique
   * identification of the polymer
   */
  public val isDefining: Boolean? = null,
  /**
   * A percentage
   */
  public val amount: Quantity? = null,
) : BackboneElement
