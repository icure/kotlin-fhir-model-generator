//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.riskevidencesynthesis

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What was the estimated risk
 *
 * The estimated risk of the outcome.
 *
 * @param id Unique id for inter-element referencing
 * @param description Description of risk estimate
 * @param type Type of risk estimate
 * @param value Point estimate
 * @param unitOfMeasure What unit is the outcome described in?
 * @param denominatorCount Sample size for group measured
 * @param numeratorCount Number with the outcome
 */
@SerialName("RiskEvidenceSynthesisRiskEstimate")
@Serializable
public data class RiskEvidenceSynthesisRiskEstimate(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of risk estimate
   */
  public val description: String? = null,
  /**
   * Type of risk estimate
   */
  public val type: CodeableConcept? = null,
  /**
   * Point estimate
   */
  public val `value`: Float? = null,
  /**
   * What unit is the outcome described in?
   */
  public val unitOfMeasure: CodeableConcept? = null,
  /**
   * Sample size for group measured
   */
  public val denominatorCount: Int? = null,
  /**
   * Number with the outcome
   */
  public val numeratorCount: Int? = null,
  public val precisionEstimate: List<RiskEvidenceSynthesisRiskEstimatePrecisionEstimate> =
      emptyList(),
) : BackboneElement
