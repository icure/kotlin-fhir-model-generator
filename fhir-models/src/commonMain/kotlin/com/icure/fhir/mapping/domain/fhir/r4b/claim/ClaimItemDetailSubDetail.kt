//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.claim

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.money.Money
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Product or service provided
 *
 * A claim detail line. Either a simple (a product or service) or a 'group' of sub-details which are
 * simple items.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Item instance identifier
 * @param revenue Revenue or cost center code
 * @param category Benefit classification
 * @param productOrService Billing, service, product, or drug code
 * @param quantity Count of products or services
 * @param unitPrice Fee, charge or cost per item
 * @param factor Price scaling factor
 * @param net Total item cost
 */
@SerialName("ClaimItemDetailSubDetail")
@Serializable
public data class ClaimItemDetailSubDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Item instance identifier
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
) : BackboneElement
