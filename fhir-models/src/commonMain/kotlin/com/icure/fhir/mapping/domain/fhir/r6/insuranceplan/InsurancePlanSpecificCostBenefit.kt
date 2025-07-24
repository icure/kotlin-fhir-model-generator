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
 * Benefits list
 *
 * List of the specific benefits under this category of benefit.
 *
 * @param id Unique id for inter-element referencing
 * @param type Classification of benefit provided
 */
@SerialName("InsurancePlanSpecificCostBenefit")
@Serializable
public data class InsurancePlanSpecificCostBenefit(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Classification of benefit provided
   */
  public val type: CodeableConcept,
  public val cost: List<InsurancePlanSpecificCostBenefitCost> = emptyList(),
) : BackboneElement
