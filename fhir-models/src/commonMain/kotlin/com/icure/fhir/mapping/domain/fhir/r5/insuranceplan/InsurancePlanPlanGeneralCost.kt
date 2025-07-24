//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.insuranceplan

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.money.Money
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Overall costs
 *
 * Overall costs associated with the plan.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of cost
 * @param groupSize Number of enrollees
 * @param cost Cost value
 * @param comment Additional cost information
 */
@SerialName("InsurancePlanPlanGeneralCost")
@Serializable
public data class InsurancePlanPlanGeneralCost(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of cost
   */
  public val type: CodeableConcept? = null,
  /**
   * Number of enrollees
   */
  public val groupSize: Int? = null,
  /**
   * Cost value
   */
  public val cost: Money? = null,
  /**
   * Additional cost information
   */
  public val comment: String? = null,
) : BackboneElement
