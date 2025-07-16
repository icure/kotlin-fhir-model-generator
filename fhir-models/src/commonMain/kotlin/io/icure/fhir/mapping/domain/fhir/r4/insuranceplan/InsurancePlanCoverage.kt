//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.insuranceplan

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Coverage details
 *
 * Details about the coverage offered by the insurance product.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of coverage
 */
@SerialName("InsurancePlanCoverage")
@Serializable
public data class InsurancePlanCoverage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of coverage
   */
  public val type: CodeableConcept,
  public val network: List<Reference> = emptyList(),
  public val benefit: List<InsurancePlanCoverageBenefit> = emptyList(),
) : BackboneElement
