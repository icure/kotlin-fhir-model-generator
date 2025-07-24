//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.measurereport

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Stratification results
 *
 * When a measure includes multiple stratifiers, there will be a stratifier group for each
 * stratifier defined by the measure.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("MeasureReportGroupStratifier")
@Serializable
public data class MeasureReportGroupStratifier(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val code: List<CodeableConcept> = emptyList(),
  public val stratum: List<MeasureReportGroupStratifierStratum> = emptyList(),
) : BackboneElement
