//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.contract

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.money.Money
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contract Valued Item List
 *
 * Contract Valued Item List.
 *
 * @param id Unique id for inter-element referencing
 * @param entityCodeableConcept Contract Valued Item Type
 * @param entityReference Contract Valued Item Type
 * @param identifier Contract Valued Item Number
 * @param effectiveTime Contract Valued Item Effective Tiem
 * @param quantity Count of Contract Valued Items
 * @param unitPrice Contract Valued Item fee, charge, or cost
 * @param factor Contract Valued Item Price Scaling Factor
 * @param points Contract Valued Item Difficulty Scaling Factor
 * @param net Total Contract Valued Item Value
 * @param payment Terms of valuation
 * @param paymentDate When payment is due
 * @param responsible Who will make payment
 * @param recipient Who will receive payment
 */
@SerialName("ContractTermAssetValuedItem")
@Serializable
public data class ContractTermAssetValuedItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Contract Valued Item Type
   */
  public val entityCodeableConcept: CodeableConcept? = null,
  /**
   * Contract Valued Item Type
   */
  public val entityReference: Reference? = null,
  /**
   * Contract Valued Item Number
   */
  public val identifier: Identifier? = null,
  /**
   * Contract Valued Item Effective Tiem
   */
  public val effectiveTime: String? = null,
  /**
   * Count of Contract Valued Items
   */
  public val quantity: Quantity? = null,
  /**
   * Contract Valued Item fee, charge, or cost
   */
  public val unitPrice: Money? = null,
  /**
   * Contract Valued Item Price Scaling Factor
   */
  public val factor: Float? = null,
  /**
   * Contract Valued Item Difficulty Scaling Factor
   */
  public val points: Float? = null,
  /**
   * Total Contract Valued Item Value
   */
  public val net: Money? = null,
  /**
   * Terms of valuation
   */
  public val payment: String? = null,
  /**
   * When payment is due
   */
  public val paymentDate: String? = null,
  /**
   * Who will make payment
   */
  public val responsible: Reference? = null,
  /**
   * Who will receive payment
   */
  public val recipient: Reference? = null,
  public val linkId: List<String> = emptyList(),
  public val securityLabelNumber: List<Int> = emptyList(),
) : BackboneElement
