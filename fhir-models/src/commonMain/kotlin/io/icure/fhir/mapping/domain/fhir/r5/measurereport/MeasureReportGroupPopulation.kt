//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.measurereport

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param linkId Pointer to specific population from Measure
 * @param code initial-population | numerator | numerator-exclusion | denominator |
 * denominator-exclusion | denominator-exception | measure-population | measure-population-exclusion |
 * measure-observation
 * @param count Size of the population
 * @param subjectResults For subject-list reports, the subject results in this population
 * @param subjects What individual(s) in the population
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
   * Pointer to specific population from Measure
   */
  public val linkId: String? = null,
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
  public val subjectReport: List<Reference> = emptyList(),
  /**
   * What individual(s) in the population
   */
  public val subjects: Reference? = null,
) : BackboneElement
