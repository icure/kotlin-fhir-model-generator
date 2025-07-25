//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.measurereport

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The populations in the group
 *
 * The populations that make up the population group, one for each type of population appropriate
 * for the measure.
 *
 * @param id Unique id for inter-element referencing
 * @param code initial-population | numerator | numerator-exclusion | denominator |
 * denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion |
 * measure-observation
 * @param count Size of the population
 * @param subjectResults For subject-list reports, the subject results in this population
 */
@SerialName("MeasureReportGroupPopulation")
@Serializable
public data class MeasureReportGroupPopulation(
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
   * Size of the population
   */
  public val count: Int? = null,
  /**
   * For subject-list reports, the subject results in this population
   */
  public val subjectResults: Reference? = null,
) : BackboneElement
