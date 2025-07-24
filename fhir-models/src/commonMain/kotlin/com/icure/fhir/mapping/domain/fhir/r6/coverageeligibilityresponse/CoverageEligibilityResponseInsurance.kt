//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.coverageeligibilityresponse

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Patient insurance information
 *
 * Financial instruments for reimbursement for the health care products and services.
 *
 * @param id Unique id for inter-element referencing
 * @param coverage Insurance information
 * @param inforce Coverage inforce indicator
 * @param benefitPeriod When the benefits are applicable
 */
@SerialName("CoverageEligibilityResponseInsurance")
@Serializable
public data class CoverageEligibilityResponseInsurance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Insurance information
   */
  public val coverage: Reference,
  /**
   * Coverage inforce indicator
   */
  public val inforce: Boolean? = null,
  /**
   * When the benefits are applicable
   */
  public val benefitPeriod: Period? = null,
  public val item: List<CoverageEligibilityResponseInsuranceItem> = emptyList(),
) : BackboneElement
