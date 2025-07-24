//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.measurereport

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Stratum results, one for each unique value, or set of values, in the stratifier, or stratifier
 * components
 *
 * This element contains the results for a single stratum within the stratifier. For example, when
 * stratifying on administrative gender, there will be four strata, one for each possible gender value.
 *
 * @param id Unique id for inter-element referencing
 * @param valueCodeableConcept The stratum value, e.g. male
 * @param valueBoolean The stratum value, e.g. male
 * @param valueQuantity The stratum value, e.g. male
 * @param valueRange The stratum value, e.g. male
 * @param valueReference The stratum value, e.g. male
 * @param measureScoreQuantity What score this stratum achieved
 * @param measureScoreDateTime What score this stratum achieved
 * @param measureScoreCodeableConcept What score this stratum achieved
 * @param measureScorePeriod What score this stratum achieved
 * @param measureScoreRange What score this stratum achieved
 * @param measureScoreDuration What score this stratum achieved
 */
@SerialName("MeasureReportGroupStratifierStratum")
@Serializable
public data class MeasureReportGroupStratifierStratum(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The stratum value, e.g. male
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * The stratum value, e.g. male
   */
  public val valueBoolean: Boolean? = null,
  /**
   * The stratum value, e.g. male
   */
  public val valueQuantity: Quantity? = null,
  /**
   * The stratum value, e.g. male
   */
  public val valueRange: Range? = null,
  /**
   * The stratum value, e.g. male
   */
  public val valueReference: Reference? = null,
  public val component: List<MeasureReportGroupStratifierStratumComponent> = emptyList(),
  public val population: List<MeasureReportGroupStratifierStratumPopulation> = emptyList(),
  /**
   * What score this stratum achieved
   */
  public val measureScoreQuantity: Quantity? = null,
  /**
   * What score this stratum achieved
   */
  public val measureScoreDateTime: String? = null,
  /**
   * What score this stratum achieved
   */
  public val measureScoreCodeableConcept: CodeableConcept? = null,
  /**
   * What score this stratum achieved
   */
  public val measureScorePeriod: Period? = null,
  /**
   * What score this stratum achieved
   */
  public val measureScoreRange: Range? = null,
  /**
   * What score this stratum achieved
   */
  public val measureScoreDuration: Duration? = null,
) : BackboneElement
