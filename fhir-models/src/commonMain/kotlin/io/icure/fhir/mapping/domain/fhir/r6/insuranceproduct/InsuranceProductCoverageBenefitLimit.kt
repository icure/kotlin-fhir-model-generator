//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.insuranceproduct

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Limits on the provided benefits
 *
 * The specific limits on the benefit.
 *
 * @param id Unique id for inter-element referencing
 * @param value Maximum value allowed
 * @param code Benefit limit details
 */
@SerialName("InsuranceProductCoverageBenefitLimit")
@Serializable
public data class InsuranceProductCoverageBenefitLimit(
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
