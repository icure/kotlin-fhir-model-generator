//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.chargeitemdefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.monetarycomponent.MonetaryComponent
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Group of properties which are applicable under the same conditions
 *
 * Group of properties which are applicable under the same conditions. If no applicability rules are
 * established for the group, then all properties always apply.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("ChargeItemDefinitionPropertyGroup")
@Serializable
public data class ChargeItemDefinitionPropertyGroup(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val applicability: List<ChargeItemDefinitionApplicability> = emptyList(),
  public val priceComponent: List<MonetaryComponent> = emptyList(),
) : BackboneElement
