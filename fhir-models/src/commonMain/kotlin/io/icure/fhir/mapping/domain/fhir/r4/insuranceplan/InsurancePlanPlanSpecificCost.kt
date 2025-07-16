//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.insuranceplan

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specific costs
 *
 * Costs associated with the coverage provided by the product.
 *
 * @param id Unique id for inter-element referencing
 * @param category General category of benefit
 */
@SerialName("InsurancePlanPlanSpecificCost")
@Serializable
public data class InsurancePlanPlanSpecificCost(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * General category of benefit
   */
  public val category: CodeableConcept,
  public val benefit: List<InsurancePlanPlanSpecificCostBenefit> = emptyList(),
) : BackboneElement
