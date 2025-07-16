//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.insuranceplan

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
 * @param type Classification of specific cost
 * @param applicability in-network | out-of-network | other
 * @param value The actual cost value
 */
@SerialName("InsurancePlanSpecificCostBenefitCost")
@Serializable
public data class InsurancePlanSpecificCostBenefitCost(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Classification of specific cost
   */
  public val type: CodeableConcept,
  /**
   * in-network | out-of-network | other
   */
  public val applicability: CodeableConcept? = null,
  public val qualifier: List<CodeableConcept> = emptyList(),
  /**
   * The actual cost value
   */
  public val `value`: Quantity? = null,
) : BackboneElement
