//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.coverage

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Exceptions for patient payments
 *
 * A suite of codes indicating exceptions or reductions to patient costs and their effective
 * periods.
 *
 * @param id Unique id for inter-element referencing
 * @param type Exception category
 * @param period The effective period of the exception
 */
@SerialName("CoverageCostToBeneficiaryException")
@Serializable
public data class CoverageCostToBeneficiaryException(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Exception category
   */
  public val type: CodeableConcept,
  /**
   * The effective period of the exception
   */
  public val period: Period? = null,
) : BackboneElement
