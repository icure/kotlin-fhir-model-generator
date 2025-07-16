//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.measurereport

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
 * @param code Meaning of the group
 * @param measureScore What score this group achieved
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
   * Meaning of the group
   */
  public val code: CodeableConcept? = null,
  public val population: List<MeasureReportGroupPopulation> = emptyList(),
  /**
   * What score this group achieved
   */
  public val measureScore: Quantity? = null,
  public val stratifier: List<MeasureReportGroupStratifier> = emptyList(),
) : BackboneElement
