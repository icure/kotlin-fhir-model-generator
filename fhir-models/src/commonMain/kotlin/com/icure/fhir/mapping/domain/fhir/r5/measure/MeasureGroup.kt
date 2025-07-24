//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.measure

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Population criteria group
 *
 * A group of population criteria for the measure.
 *
 * @param id Unique id for inter-element referencing
 * @param linkId Unique id for group in measure
 * @param code Meaning of the group
 * @param description Summary description
 * @param subjectCodeableConcept E.g. Patient, Practitioner, RelatedPerson, Organization, Location,
 * Device
 * @param subjectReference E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
 * @param basis Population basis
 * @param scoring proportion | ratio | continuous-variable | cohort
 * @param scoringUnit What units?
 * @param rateAggregation How is rate aggregation performed for this measure
 * @param improvementNotation increase | decrease
 */
@SerialName("MeasureGroup")
@Serializable
public data class MeasureGroup(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Unique id for group in measure
   */
  public val linkId: String? = null,
  /**
   * Meaning of the group
   */
  public val code: CodeableConcept? = null,
  /**
   * Summary description
   */
  public val description: String? = null,
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
   */
  public val subjectCodeableConcept: CodeableConcept? = null,
  /**
   * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
   */
  public val subjectReference: Reference? = null,
  /**
   * Population basis
   */
  public val basis: String? = null,
  /**
   * proportion | ratio | continuous-variable | cohort
   */
  public val scoring: CodeableConcept? = null,
  /**
   * What units?
   */
  public val scoringUnit: CodeableConcept? = null,
  /**
   * How is rate aggregation performed for this measure
   */
  public val rateAggregation: String? = null,
  /**
   * increase | decrease
   */
  public val improvementNotation: CodeableConcept? = null,
  public val library: List<String> = emptyList(),
  public val population: List<MeasureGroupPopulation> = emptyList(),
  public val stratifier: List<MeasureGroupStratifier> = emptyList(),
) : BackboneElement
