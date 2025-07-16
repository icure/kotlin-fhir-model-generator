//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.coverage

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.money.Money
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
   * The amount or percentage due from the beneficiary
   */
  public val valueQuantity: Quantity? = null,
  /**
   * The amount or percentage due from the beneficiary
   */
  public val valueMoney: Money? = null,
  public val exception: List<CoverageCostToBeneficiaryException> = emptyList(),
) : BackboneElement
