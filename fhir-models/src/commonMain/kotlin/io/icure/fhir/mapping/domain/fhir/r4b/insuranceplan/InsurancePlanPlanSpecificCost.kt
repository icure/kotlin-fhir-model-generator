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
