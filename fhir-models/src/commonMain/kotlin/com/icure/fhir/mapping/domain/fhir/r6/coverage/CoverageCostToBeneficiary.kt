//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.coverage

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.money.Money
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Patient payments for services/products
 *
 * A suite of codes indicating the cost category and associated amount which have been detailed in
 * the policy and may have been  included on the health card.
 *
 * @param id Unique id for inter-element referencing
 * @param type Cost category
 * @param category Benefit classification
 * @param network In or out of network
 * @param unit Individual or family
 * @param term Annual or lifetime
 * @param valueQuantity The amount or percentage due from the beneficiary
 * @param valueMoney The amount or percentage due from the beneficiary
 */
@SerialName("CoverageCostToBeneficiary")
@Serializable
public data class CoverageCostToBeneficiary(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Cost category
   */
  public val type: CodeableConcept? = null,
  /**
   * Benefit classification
   */
  public val category: CodeableConcept? = null,
  /**
   * In or out of network
   */
  public val network: CodeableConcept? = null,
  /**
   * Individual or family
   */
  public val unit: CodeableConcept? = null,
  /**
   * Annual or lifetime
   */
  public val term: CodeableConcept? = null,
  /**
   * The amount or percentage due from the beneficiary
   */
  public val valueQuantity: Quantity? = null,
  /**
   * The amount or percentage due from the beneficiary
   */
  public val valueMoney: Money? = null,
  public val exception: List<CoverageCostToBeneficiaryException> = emptyList(),
) : BackboneElement
