//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.measurereport

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.range.Range
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
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
 * @param linkId Pointer to specific stratifier component from Measure
 * @param code What stratifier component of the group
 * @param valueCodeableConcept The stratum component value, e.g. male
 * @param valueBoolean The stratum component value, e.g. male
 * @param valueQuantity The stratum component value, e.g. male
 * @param valueRange The stratum component value, e.g. male
 * @param valueReference The stratum component value, e.g. male
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
   * Pointer to specific stratifier component from Measure
   */
  public val linkId: String? = null,
  /**
   * What stratifier component of the group
   */
  public val code: CodeableConcept,
  /**
   * The stratum component value, e.g. male
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * The stratum component value, e.g. male
   */
  public val valueBoolean: Boolean? = null,
  /**
   * The stratum component value, e.g. male
   */
  public val valueQuantity: Quantity? = null,
  /**
   * The stratum component value, e.g. male
   */
  public val valueRange: Range? = null,
  /**
   * The stratum component value, e.g. male
   */
  public val valueReference: Reference? = null,
) : BackboneElement
