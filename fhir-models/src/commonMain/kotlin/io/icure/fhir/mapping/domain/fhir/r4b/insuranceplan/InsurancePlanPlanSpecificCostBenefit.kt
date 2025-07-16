//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.insuranceplan

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
