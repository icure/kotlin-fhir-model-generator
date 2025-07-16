//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.claimresponse

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
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
@SerialName("ClaimResponseItemReviewOutcome")
@Serializable
public data class ClaimResponseItemReviewOutcome(
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
