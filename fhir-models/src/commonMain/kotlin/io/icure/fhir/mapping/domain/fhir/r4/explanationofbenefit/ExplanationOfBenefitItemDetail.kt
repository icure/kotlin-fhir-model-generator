//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.explanationofbenefit

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.money.Money
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional items
 *
 * Second-tier of goods and services.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Product or service provided
 * @param revenue Revenue or cost center code
 * @param category Benefit classification
 * @param productOrService Billing, service, product, or drug code
 * @param quantity Count of products or services
 * @param unitPrice Fee, charge or cost per item
 * @param factor Price scaling factor
 * @param net Total item cost
 */
@SerialName("ExplanationOfBenefitItemDetail")
@Serializable
public data class ExplanationOfBenefitItemDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Product or service provided
   */
  public val sequence: Int? = null,
  /**
   * Revenue or cost center code
   */
  public val revenue: CodeableConcept? = null,
  /**
   * Benefit classification
   */
  public val category: CodeableConcept? = null,
  /**
   * Billing, service, product, or drug code
   */
  public val productOrService: CodeableConcept,
  public val modifier: List<CodeableConcept> = emptyList(),
  public val programCode: List<CodeableConcept> = emptyList(),
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
  public val udi: List<Reference> = emptyList(),
  public val noteNumber: List<Int> = emptyList(),
  public val adjudication: List<ExplanationOfBenefitItemAdjudication> = emptyList(),
  public val subDetail: List<ExplanationOfBenefitItemDetailSubDetail> = emptyList(),
) : BackboneElement
