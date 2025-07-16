//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.coverageeligibilityresponse

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Processing errors
 *
 * Errors encountered during the processing of the request.
 *
 * @param id Unique id for inter-element referencing
 * @param code Error code detailing processing issues
 */
@SerialName("CoverageEligibilityResponseError")
@Serializable
public data class CoverageEligibilityResponseError(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Error code detailing processing issues
   */
  public val code: CodeableConcept,
) : BackboneElement
