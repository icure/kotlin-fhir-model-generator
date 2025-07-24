//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.insuranceplan

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * List of benefits
 *
 * Specific benefits under this type of coverage.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of benefit
 * @param requirement Referral requirements
 */
@SerialName("InsurancePlanCoverageBenefit")
@Serializable
public data class InsurancePlanCoverageBenefit(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of benefit
   */
  public val type: CodeableConcept,
  /**
   * Referral requirements
   */
  public val requirement: String? = null,
  public val limit: List<InsurancePlanCoverageBenefitLimit> = emptyList(),
) : BackboneElement
