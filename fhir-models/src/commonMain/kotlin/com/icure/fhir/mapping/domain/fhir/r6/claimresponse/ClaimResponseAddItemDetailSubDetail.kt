//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.claimresponse

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.money.Money
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Insurer added line items
 *
 * The third-tier service adjudications for payor added services.
 *
 * @param id Unique id for inter-element referencing
 * @param revenue Revenue or cost center code
 * @param productOrService Billing, service, product, or drug code
 * @param productOrServiceEnd End of a range of codes
 * @param quantity Count of products or services
 * @param unitPrice Fee, charge or cost per item
 * @param factor Price scaling factor
 * @param tax Total tax
 * @param net Total item cost
 * @param reviewOutcome Added items subdetail level adjudication results
 */
@SerialName("ClaimResponseAddItemDetailSubDetail")
@Serializable
public data class ClaimResponseAddItemDetailSubDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val traceNumber: List<Identifier> = emptyList(),
  /**
   * Revenue or cost center code
   */
  public val revenue: CodeableConcept? = null,
  /**
   * Billing, service, product, or drug code
   */
  public val productOrService: CodeableConcept? = null,
  /**
   * End of a range of codes
   */
  public val productOrServiceEnd: CodeableConcept? = null,
  public val modifier: List<CodeableConcept> = emptyList(),
  /**
   * Count of products or services
   */
  public val quantity: Quantity? = null,
  /**
   * Fee, charge or cost per item
   */
  public val unitPrice: Money? = null,
  /**
   * Price scaling factor
   */
  public val factor: Float? = null,
  /**
   * Total tax
   */
  public val tax: Money? = null,
  /**
   * Total item cost
   */
  public val net: Money? = null,
  public val noteNumber: List<Int> = emptyList(),
  /**
   * Added items subdetail level adjudication results
   */
  public val reviewOutcome: ClaimResponseItemReviewOutcome? = null,
  public val adjudication: List<ClaimResponseItemAdjudication> = emptyList(),
) : BackboneElement
