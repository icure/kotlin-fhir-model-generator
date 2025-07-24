//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.insuranceplan

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Individual cost elements
 *
 * Costs associated with the coverage provided by the product-plan.
 *
 * @param id Unique id for inter-element referencing
 * @param category General category of benefit
 */
@SerialName("InsurancePlanSpecificCost")
@Serializable
public data class InsurancePlanSpecificCost(
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
  public val benefit: List<InsurancePlanSpecificCostBenefit> = emptyList(),
) : BackboneElement
