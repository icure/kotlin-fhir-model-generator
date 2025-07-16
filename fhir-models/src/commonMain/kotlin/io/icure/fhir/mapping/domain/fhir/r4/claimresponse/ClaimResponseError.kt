//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.claimresponse

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
) : BackboneElement
