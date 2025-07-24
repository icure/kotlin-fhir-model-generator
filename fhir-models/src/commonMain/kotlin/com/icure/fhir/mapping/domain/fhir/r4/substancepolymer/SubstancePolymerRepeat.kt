//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substancepolymer

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Int
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
 * @param numberOfUnits Todo
 * @param averageMolecularFormula Todo
 * @param repeatUnitAmountType Todo
 */
@SerialName("SubstancePolymerRepeat")
@Serializable
public data class SubstancePolymerRepeat(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Todo
   */
  public val numberOfUnits: Int? = null,
  /**
   * Todo
   */
  public val averageMolecularFormula: String? = null,
  /**
   * Todo
   */
  public val repeatUnitAmountType: CodeableConcept? = null,
  public val repeatUnit: List<SubstancePolymerRepeatRepeatUnit> = emptyList(),
) : BackboneElement
