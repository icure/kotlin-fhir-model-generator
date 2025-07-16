//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.explanationofbenefit

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Patient insurance information
 *
 * Financial instruments for reimbursement for the health care products and services specified on
 * the claim.
 *
 * @param id Unique id for inter-element referencing
 * @param focal Coverage to be used for adjudication
 * @param coverage Insurance information
 */
@SerialName("ExplanationOfBenefitInsurance")
@Serializable
public data class ExplanationOfBenefitInsurance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Coverage to be used for adjudication
   */
  public val focal: Boolean? = null,
  /**
   * Insurance information
   */
  public val coverage: Reference,
  public val preAuthRef: List<String> = emptyList(),
) : BackboneElement
