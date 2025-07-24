//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.explanationofbenefit

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
 * Adjudication details
 *
 * If this item is a group then the values here are a summary of the adjudication of the detail
 * items. If this item is a simple product or service then this is the result of the adjudication of
 * this item.
 *
 * @param id Unique id for inter-element referencing
 * @param category Type of adjudication information
 * @param reason Explanation of adjudication outcome
 * @param amount Monetary amount
 * @param value Non-monitary value
 */
@SerialName("ExplanationOfBenefitItemAdjudication")
@Serializable
public data class ExplanationOfBenefitItemAdjudication(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of adjudication information
   */
  public val category: CodeableConcept,
  /**
   * Explanation of adjudication outcome
   */
  public val reason: CodeableConcept? = null,
  /**
   * Monetary amount
   */
  public val amount: Money? = null,
  /**
   * Non-monitary value
   */
  public val `value`: Float? = null,
) : BackboneElement
