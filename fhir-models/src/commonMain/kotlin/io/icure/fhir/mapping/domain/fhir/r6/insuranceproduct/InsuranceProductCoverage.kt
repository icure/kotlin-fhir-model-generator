//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.insuranceproduct

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param type Classification of Coverage
 */
@SerialName("InsuranceProductCoverage")
@Serializable
public data class InsuranceProductCoverage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Classification of Coverage
   */
  public val type: CodeableConcept,
  public val network: List<Reference> = emptyList(),
  public val benefit: List<InsuranceProductCoverageBenefit> = emptyList(),
) : BackboneElement
