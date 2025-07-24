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
 * Stratifier component values
 *
 * A stratifier component value.
 *
 * @param id Unique id for inter-element referencing
 * @param code What stratifier component of the group
 * @param value The stratum component value, e.g. male
 */
@SerialName("MeasureReportGroupStratifierStratumComponent")
@Serializable
public data class MeasureReportGroupStratifierStratumComponent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * What stratifier component of the group
   */
  public val code: CodeableConcept,
  /**
   * The stratum component value, e.g. male
   */
  public val `value`: CodeableConcept,
) : BackboneElement
