//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.coverageeligibilityresponse

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.money.Money
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Benefit Summary
 *
 * Benefits used to date.
 *
 * @param id Unique id for inter-element referencing
 * @param type Benefit classification
 * @param allowedUnsignedInt Benefits allowed
 * @param allowedString Benefits allowed
 * @param allowedMoney Benefits allowed
 * @param usedUnsignedInt Benefits used
 * @param usedString Benefits used
 * @param usedMoney Benefits used
 */
@SerialName("CoverageEligibilityResponseInsuranceItemBenefit")
@Serializable
public data class CoverageEligibilityResponseInsuranceItemBenefit(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Benefit classification
   */
  public val type: CodeableConcept,
  /**
   * Benefits allowed
   */
  public val allowedUnsignedInt: Int? = null,
  /**
   * Benefits allowed
   */
  public val allowedString: String? = null,
  /**
   * Benefits allowed
   */
  public val allowedMoney: Money? = null,
  /**
   * Benefits used
   */
  public val usedUnsignedInt: Int? = null,
  /**
   * Benefits used
   */
  public val usedString: String? = null,
  /**
   * Benefits used
   */
  public val usedMoney: Money? = null,
) : BackboneElement
