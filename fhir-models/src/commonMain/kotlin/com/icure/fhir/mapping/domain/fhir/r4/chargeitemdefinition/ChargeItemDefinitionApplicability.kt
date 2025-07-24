//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.chargeitemdefinition

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Whether or not the billing code is applicable
 *
 * Expressions that describe applicability criteria for the billing code.
 *
 * @param id Unique id for inter-element referencing
 * @param description Natural language description of the condition
 * @param language Language of the expression
 * @param expression Boolean-valued expression
 */
@SerialName("ChargeItemDefinitionApplicability")
@Serializable
public data class ChargeItemDefinitionApplicability(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Natural language description of the condition
   */
  public val description: String? = null,
  /**
   * Language of the expression
   */
  public val language: String? = null,
  /**
   * Boolean-valued expression
   */
  public val expression: String? = null,
) : BackboneElement
