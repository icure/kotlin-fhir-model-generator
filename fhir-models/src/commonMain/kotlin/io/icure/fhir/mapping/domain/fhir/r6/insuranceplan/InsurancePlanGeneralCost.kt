//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.insuranceplan

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.money.Money
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
 * @param type Classification of specific cost
 * @param groupSize Number of enrollees
 * @param cost Cost value
 * @param comment Additional cost information
 */
@SerialName("InsurancePlanGeneralCost")
@Serializable
public data class InsurancePlanGeneralCost(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Classification of specific cost
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
