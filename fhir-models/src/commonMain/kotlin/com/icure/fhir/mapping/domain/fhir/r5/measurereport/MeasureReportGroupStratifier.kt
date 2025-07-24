//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.measurereport

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
 * @param linkId Pointer to specific stratifier from Measure
 * @param code What stratifier of the group
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
  /**
   * Pointer to specific stratifier from Measure
   */
  public val linkId: String? = null,
  /**
   * What stratifier of the group
   */
  public val code: CodeableConcept? = null,
  public val stratum: List<MeasureReportGroupStratifierStratum> = emptyList(),
) : BackboneElement
