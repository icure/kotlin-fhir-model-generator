//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.measure

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Population criteria
 *
 * A population criteria for the measure.
 *
 * @param id Unique id for inter-element referencing
 * @param code initial-population | numerator | numerator-exclusion | denominator |
 * denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion |
 * measure-observation
 * @param description The human readable description of this population criteria
 * @param criteria The criteria that defines this population
 */
@SerialName("MeasureGroupPopulation")
@Serializable
public data class MeasureGroupPopulation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * initial-population | numerator | numerator-exclusion | denominator | denominator-exclusion |
   * denominator-exception | measure-population | measure-population-exclusion | measure-observation
   */
  public val code: CodeableConcept? = null,
  /**
   * The human readable description of this population criteria
   */
  public val description: String? = null,
  /**
   * The criteria that defines this population
   */
  public val criteria: Expression,
) : BackboneElement
