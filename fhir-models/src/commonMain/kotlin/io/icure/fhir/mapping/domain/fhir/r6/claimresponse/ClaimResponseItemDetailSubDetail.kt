//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.claimresponse

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Adjudication for claim sub-details
 *
 * A sub-detail adjudication of a simple product or service.
 *
 * @param id Unique id for inter-element referencing
 * @param subDetailSequence Claim sub-detail instance identifier
 * @param reviewOutcome Subdetail level adjudication results
 */
@SerialName("ClaimResponseItemDetailSubDetail")
@Serializable
public data class ClaimResponseItemDetailSubDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Claim sub-detail instance identifier
   */
  public val subDetailSequence: Int? = null,
  public val traceNumber: List<Identifier> = emptyList(),
  public val noteNumber: List<Int> = emptyList(),
  /**
   * Subdetail level adjudication results
   */
  public val reviewOutcome: ClaimResponseItemReviewOutcome? = null,
  public val adjudication: List<ClaimResponseItemAdjudication> = emptyList(),
) : BackboneElement
