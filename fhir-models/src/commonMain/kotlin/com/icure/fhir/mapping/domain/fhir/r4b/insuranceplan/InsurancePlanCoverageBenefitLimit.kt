//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.insuranceplan

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Benefit limits
 *
 * The specific limits on the benefit.
 *
 * @param id Unique id for inter-element referencing
 * @param value Maximum value allowed
 * @param code Benefit limit details
 */
@SerialName("InsurancePlanCoverageBenefitLimit")
@Serializable
public data class InsurancePlanCoverageBenefitLimit(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Maximum value allowed
   */
  public val `value`: Quantity? = null,
  /**
   * Benefit limit details
   */
  public val code: CodeableConcept? = null,
) : BackboneElement
