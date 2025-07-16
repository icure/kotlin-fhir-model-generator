//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.claimresponse

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.money.Money
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
 * @param quantity Non-monetary value
 */
@SerialName("ClaimResponseItemAdjudication")
@Serializable
public data class ClaimResponseItemAdjudication(
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
   * Non-monetary value
   */
  public val quantity: Quantity? = null,
) : BackboneElement
