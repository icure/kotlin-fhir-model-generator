//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.claimresponse

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Processing errors
 *
 * Errors encountered during the processing of the adjudication.
 *
 * @param id Unique id for inter-element referencing
 * @param itemSequence Item sequence number
 * @param detailSequence Detail sequence number
 * @param subDetailSequence Subdetail sequence number
 * @param code Error code detailing processing issues
 */
@SerialName("ClaimResponseError")
@Serializable
public data class ClaimResponseError(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Item sequence number
   */
  public val itemSequence: Int? = null,
  /**
   * Detail sequence number
   */
  public val detailSequence: Int? = null,
  /**
   * Subdetail sequence number
   */
  public val subDetailSequence: Int? = null,
  /**
   * Error code detailing processing issues
   */
  public val code: CodeableConcept,
  public val expression: List<String> = emptyList(),
) : BackboneElement
