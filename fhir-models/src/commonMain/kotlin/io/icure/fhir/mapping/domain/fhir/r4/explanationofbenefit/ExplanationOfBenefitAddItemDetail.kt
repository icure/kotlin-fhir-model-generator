//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.explanationofbenefit

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.money.Money
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Insurer added line items
 *
 * The second-tier service adjudications for payor added services.
 *
 * @param id Unique id for inter-element referencing
 * @param productOrService Billing, service, product, or drug code
 * @param quantity Count of products or services
 * @param unitPrice Fee, charge or cost per item
 * @param factor Price scaling factor
 * @param net Total item cost
 */
@SerialName("ExplanationOfBenefitAddItemDetail")
@Serializable
public data class ExplanationOfBenefitAddItemDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Billing, service, product, or drug code
   */
  public val productOrService: CodeableConcept,
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
   * Total item cost
   */
  public val net: Money? = null,
  public val noteNumber: List<Int> = emptyList(),
  public val adjudication: List<ExplanationOfBenefitItemAdjudication> = emptyList(),
  public val subDetail: List<ExplanationOfBenefitAddItemDetailSubDetail> = emptyList(),
) : BackboneElement
