//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.coverageeligibilityrequest

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param focal Applicable coverage
 * @param coverage Insurance information
 * @param businessArrangement Additional provider contract number
 */
@SerialName("CoverageEligibilityRequestInsurance")
@Serializable
public data class CoverageEligibilityRequestInsurance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Applicable coverage
   */
  public val focal: Boolean? = null,
  /**
   * Insurance information
   */
  public val coverage: Reference,
  /**
   * Additional provider contract number
   */
  public val businessArrangement: String? = null,
) : BackboneElement
