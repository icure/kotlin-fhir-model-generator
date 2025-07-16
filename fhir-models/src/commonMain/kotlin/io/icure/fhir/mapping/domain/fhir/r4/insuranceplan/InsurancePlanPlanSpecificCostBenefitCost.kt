//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.insuranceplan

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * List of the costs
 *
 * List of the costs associated with a specific benefit.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of cost
 * @param applicability in-network | out-of-network | other
 * @param value The actual cost value
 */
@SerialName("InsurancePlanPlanSpecificCostBenefitCost")
@Serializable
public data class InsurancePlanPlanSpecificCostBenefitCost(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of cost
   */
  public val type: CodeableConcept,
  /**
   * in-network | out-of-network | other
   */
  public val applicability: CodeableConcept? = null,
  public val qualifiers: List<CodeableConcept> = emptyList(),
  /**
   * The actual cost value
   */
  public val `value`: Quantity? = null,
) : BackboneElement
