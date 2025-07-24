//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.coverageeligibilityresponse

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
  public val expression: List<String> = emptyList(),
) : BackboneElement
