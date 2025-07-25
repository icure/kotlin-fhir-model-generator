//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.riskassessment

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Outcome predicted
 *
 * Describes the expected outcome for the subject.
 *
 * @param id Unique id for inter-element referencing
 * @param outcome Possible outcome for the subject
 * @param probabilityDecimal Likelihood of specified outcome
 * @param probabilityRange Likelihood of specified outcome
 * @param qualitativeRisk Likelihood of specified outcome as a qualitative value
 * @param relativeRisk Relative likelihood
 * @param whenPeriod Timeframe or age range
 * @param whenRange Timeframe or age range
 * @param rationale Explanation of prediction
 */
@SerialName("RiskAssessmentPrediction")
@Serializable
public data class RiskAssessmentPrediction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Possible outcome for the subject
   */
  public val outcome: CodeableConcept? = null,
  /**
   * Likelihood of specified outcome
   */
  public val probabilityDecimal: Float? = null,
  /**
   * Likelihood of specified outcome
   */
  public val probabilityRange: Range? = null,
  /**
   * Likelihood of specified outcome as a qualitative value
   */
  public val qualitativeRisk: CodeableConcept? = null,
  /**
   * Relative likelihood
   */
  public val relativeRisk: Float? = null,
  /**
   * Timeframe or age range
   */
  public val whenPeriod: Period? = null,
  /**
   * Timeframe or age range
   */
  public val whenRange: Range? = null,
  /**
   * Explanation of prediction
   */
  public val rationale: String? = null,
) : BackboneElement
