//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.measure

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param linkId Unique id for population in measure
 * @param code initial-population | numerator | numerator-exclusion | denominator |
 * denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion |
 * measure-observation
 * @param description The human readable description of this population criteria
 * @param criteria The criteria that defines this population
 * @param groupDefinition A group resource that defines this population
 * @param inputPopulationId Which population
 * @param aggregateMethod Aggregation method for a measure score (e.g. sum, average, median,
 * minimum, maximum, count)
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
   * Unique id for population in measure
   */
  public val linkId: String? = null,
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
  public val criteria: Expression? = null,
  /**
   * A group resource that defines this population
   */
  public val groupDefinition: Reference? = null,
  /**
   * Which population
   */
  public val inputPopulationId: String? = null,
  /**
   * Aggregation method for a measure score (e.g. sum, average, median, minimum, maximum, count)
   */
  public val aggregateMethod: CodeableConcept? = null,
) : BackboneElement
