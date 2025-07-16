//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.measurereport

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.range.Range
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Measure results for each group
 *
 * The results of the calculation, one for each population group in the measure.
 *
 * @param id Unique id for inter-element referencing
 * @param linkId Pointer to specific group from Measure
 * @param code Meaning of the group
 * @param subject What individual(s) the report is for
 * @param measureScoreQuantity What score this group achieved
 * @param measureScoreDateTime What score this group achieved
 * @param measureScoreCodeableConcept What score this group achieved
 * @param measureScorePeriod What score this group achieved
 * @param measureScoreRange What score this group achieved
 * @param measureScoreDuration What score this group achieved
 */
@SerialName("MeasureReportGroup")
@Serializable
public data class MeasureReportGroup(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Pointer to specific group from Measure
   */
  public val linkId: String? = null,
  /**
   * Meaning of the group
   */
  public val code: CodeableConcept? = null,
  /**
   * What individual(s) the report is for
   */
  public val subject: Reference? = null,
  public val population: List<MeasureReportGroupPopulation> = emptyList(),
  /**
   * What score this group achieved
   */
  public val measureScoreQuantity: Quantity? = null,
  /**
   * What score this group achieved
   */
  public val measureScoreDateTime: String? = null,
  /**
   * What score this group achieved
   */
  public val measureScoreCodeableConcept: CodeableConcept? = null,
  /**
   * What score this group achieved
   */
  public val measureScorePeriod: Period? = null,
  /**
   * What score this group achieved
   */
  public val measureScoreRange: Range? = null,
  /**
   * What score this group achieved
   */
  public val measureScoreDuration: Duration? = null,
  public val stratifier: List<MeasureReportGroupStratifier> = emptyList(),
) : BackboneElement
