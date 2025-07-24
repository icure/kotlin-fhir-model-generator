//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.claimresponse

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Adjudication for claim details
 *
 * A claim detail. Either a simple (a product or service) or a 'group' of sub-details which are
 * simple items.
 *
 * @param id Unique id for inter-element referencing
 * @param detailSequence Claim detail instance identifier
 * @param reviewOutcome Detail level adjudication results
 */
@SerialName("ClaimResponseItemDetail")
@Serializable
public data class ClaimResponseItemDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Claim detail instance identifier
   */
  public val detailSequence: Int? = null,
  public val traceNumber: List<Identifier> = emptyList(),
  public val noteNumber: List<Int> = emptyList(),
  /**
   * Detail level adjudication results
   */
  public val reviewOutcome: ClaimResponseItemReviewOutcome? = null,
  public val adjudication: List<ClaimResponseItemAdjudication> = emptyList(),
  public val subDetail: List<ClaimResponseItemDetailSubDetail> = emptyList(),
) : BackboneElement
