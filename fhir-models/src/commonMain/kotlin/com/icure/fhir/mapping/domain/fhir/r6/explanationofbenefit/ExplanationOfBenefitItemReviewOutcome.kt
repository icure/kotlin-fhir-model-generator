//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.explanationofbenefit

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Adjudication results
 *
 * The high-level results of the adjudication if adjudication has been performed.
 *
 * @param id Unique id for inter-element referencing
 * @param decision Result of the adjudication
 * @param preAuthRef Preauthorization reference
 * @param preAuthPeriod Preauthorization reference effective period
 */
@SerialName("ExplanationOfBenefitItemReviewOutcome")
@Serializable
public data class ExplanationOfBenefitItemReviewOutcome(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Result of the adjudication
   */
  public val decision: CodeableConcept? = null,
  public val reason: List<CodeableConcept> = emptyList(),
  /**
   * Preauthorization reference
   */
  public val preAuthRef: String? = null,
  /**
   * Preauthorization reference effective period
   */
  public val preAuthPeriod: Period? = null,
) : BackboneElement
