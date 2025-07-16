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
 * Stratum results, one for each unique value, or set of values, in the stratifier, or stratifier
 * components
 *
 * This element contains the results for a single stratum within the stratifier. For example, when
 * stratifying on administrative gender, there will be four strata, one for each possible gender value.
 *
 * @param id Unique id for inter-element referencing
 * @param value The stratum value, e.g. male
 * @param measureScore What score this stratum achieved
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
  public val `value`: CodeableConcept? = null,
  public val component: List<MeasureReportGroupStratifierStratumComponent> = emptyList(),
  public val population: List<MeasureReportGroupStratifierStratumPopulation> = emptyList(),
  /**
   * What score this stratum achieved
   */
  public val measureScore: Quantity? = null,
) : BackboneElement
