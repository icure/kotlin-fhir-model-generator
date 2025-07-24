//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.chargeitemdefinition

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.money.Money
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Components of total line item price
 *
 * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that
 * apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and
 * conditions that apply to a billing code is currently under development. The priceComponent element
 * can be used to offer transparency to the recipient of the Invoice of how the prices have been
 * calculated.
 *
 * @param id Unique id for inter-element referencing
 * @param type base | surcharge | deduction | discount | tax | informational
 * @param code Code identifying the specific component
 * @param factor Factor used for calculating this component
 * @param amount Monetary amount associated with this component
 */
@SerialName("ChargeItemDefinitionPropertyGroupPriceComponent")
@Serializable
public data class ChargeItemDefinitionPropertyGroupPriceComponent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * base | surcharge | deduction | discount | tax | informational
   */
  public val type: String? = null,
  /**
   * Code identifying the specific component
   */
  public val code: CodeableConcept? = null,
  /**
   * Factor used for calculating this component
   */
  public val factor: Float? = null,
  /**
   * Monetary amount associated with this component
   */
  public val amount: Money? = null,
) : BackboneElement
