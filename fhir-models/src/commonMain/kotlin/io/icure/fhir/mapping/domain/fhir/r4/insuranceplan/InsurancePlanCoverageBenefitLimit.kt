//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.insuranceplan

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
