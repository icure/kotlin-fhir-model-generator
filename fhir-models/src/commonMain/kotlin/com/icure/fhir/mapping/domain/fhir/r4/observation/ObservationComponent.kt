//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.observation

import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.range.Range
import com.icure.fhir.mapping.domain.fhir.r4.ratio.Ratio
import com.icure.fhir.mapping.domain.fhir.r4.sampleddata.SampledData
import com.icure.fhir.mapping.domain.fhir.r4.servicelike.ServiceLike
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Component results
 *
 * Some observations have multiple component observations.  These component observations are
 * expressed as separate code value pairs that share the same attributes.  Examples include systolic
 * and diastolic component observations for blood pressure measurement and multiple component
 * observations for genetics observations.
 *
 * @param id Unique id for inter-element referencing
 * @param code Type of component observation (code / type)
 * @param valueQuantity Actual component result
 * @param valueCodeableConcept Actual component result
 * @param valueString Actual component result
 * @param valueBoolean Actual component result
 * @param valueInteger Actual component result
 * @param valueRange Actual component result
 * @param valueRatio Actual component result
 * @param valueSampledData Actual component result
 * @param valueTime Actual component result
 * @param valueDateTime Actual component result
 * @param valuePeriod Actual component result
 * @param dataAbsentReason Why the component result is missing
 */
@SerialName("ObservationComponent")
@Serializable
public data class ObservationComponent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of component observation (code / type)
   */
  public val code: CodeableConcept,
  /**
   * Actual component result
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Actual component result
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Actual component result
   */
  public val valueString: String? = null,
  /**
   * Actual component result
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Actual component result
   */
  public val valueInteger: Int? = null,
  /**
   * Actual component result
   */
  public val valueRange: Range? = null,
  /**
   * Actual component result
   */
  public val valueRatio: Ratio? = null,
  /**
   * Actual component result
   */
  public val valueSampledData: SampledData? = null,
  /**
   * Actual component result
   */
  public val valueTime: String? = null,
  /**
   * Actual component result
   */
  public val valueDateTime: String? = null,
  /**
   * Actual component result
   */
  public val valuePeriod: Period? = null,
  /**
   * Why the component result is missing
   */
  public val dataAbsentReason: CodeableConcept? = null,
  public val interpretation: List<CodeableConcept> = emptyList(),
  public val referenceRange: List<ObservationReferenceRange> = emptyList(),
) : ServiceLike, BackboneElement
