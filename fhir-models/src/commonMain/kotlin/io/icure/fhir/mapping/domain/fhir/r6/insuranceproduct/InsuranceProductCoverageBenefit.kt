//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.insuranceproduct

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * List of benefits
 *
 * Specific benefits under this type of coverage.
 *
 * @param id Unique id for inter-element referencing
 * @param type Classification of benefit provided
 * @param requirement Referral requirements
 */
@SerialName("InsuranceProductCoverageBenefit")
@Serializable
public data class InsuranceProductCoverageBenefit(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Classification of benefit provided
   */
  public val type: CodeableConcept,
  /**
   * Referral requirements
   */
  public val requirement: String? = null,
  public val limit: List<InsuranceProductCoverageBenefitLimit> = emptyList(),
) : BackboneElement
