//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.insuranceplan

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Benefits list
 *
 * List of the specific benefits under this category of benefit.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of specific benefit
 */
@SerialName("InsurancePlanPlanSpecificCostBenefit")
@Serializable
public data class InsurancePlanPlanSpecificCostBenefit(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of specific benefit
   */
  public val type: CodeableConcept,
  public val cost: List<InsurancePlanPlanSpecificCostBenefitCost> = emptyList(),
) : BackboneElement
