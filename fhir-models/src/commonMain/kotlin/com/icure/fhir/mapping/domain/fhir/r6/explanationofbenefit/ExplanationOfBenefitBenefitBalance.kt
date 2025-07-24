//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.explanationofbenefit

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Balance by Benefit Category
 *
 * Balance by Benefit Category.
 *
 * @param id Unique id for inter-element referencing
 * @param category Benefit classification
 * @param excluded Excluded from the plan
 * @param name Short name for the benefit
 * @param description Description of the benefit or services covered
 * @param network In or out of network
 * @param unit Individual or family
 * @param term Annual or lifetime
 */
@SerialName("ExplanationOfBenefitBenefitBalance")
@Serializable
public data class ExplanationOfBenefitBenefitBalance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Benefit classification
   */
  public val category: CodeableConcept,
  /**
   * Excluded from the plan
   */
  public val excluded: Boolean? = null,
  /**
   * Short name for the benefit
   */
  public val name: String? = null,
  /**
   * Description of the benefit or services covered
   */
  public val description: String? = null,
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
  public val financial: List<ExplanationOfBenefitBenefitBalanceFinancial> = emptyList(),
) : BackboneElement
