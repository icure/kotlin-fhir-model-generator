//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.substancepolymer

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specifies and quantifies the repeated units and their configuration
 *
 * Specifies and quantifies the repeated units and their configuration.
 *
 * @param id Unique id for inter-element referencing
 * @param averageMolecularFormula A representation of an (average) molecular formula from a polymer
 * @param repeatUnitAmountType How the quantitative amount of Structural Repeat Units is captured
 * (e.g. Exact, Numeric, Average)
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
   * A representation of an (average) molecular formula from a polymer
   */
  public val averageMolecularFormula: String? = null,
  /**
   * How the quantitative amount of Structural Repeat Units is captured (e.g. Exact, Numeric,
   * Average)
   */
  public val repeatUnitAmountType: CodeableConcept? = null,
  public val repeatUnit: List<SubstancePolymerRepeatRepeatUnit> = emptyList(),
) : BackboneElement
