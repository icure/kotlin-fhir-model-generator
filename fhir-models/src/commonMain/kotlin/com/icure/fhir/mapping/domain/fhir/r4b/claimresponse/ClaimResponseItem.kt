//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.claimresponse

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Adjudication for claim line items
 *
 * A claim line. Either a simple (a product or service) or a 'group' of details which can also be a
 * simple items or groups of sub-details.
 *
 * @param id Unique id for inter-element referencing
 * @param itemSequence Claim item instance identifier
 */
@SerialName("ClaimResponseItem")
@Serializable
public data class ClaimResponseItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Claim item instance identifier
   */
  public val itemSequence: Int? = null,
  public val noteNumber: List<Int> = emptyList(),
  public val adjudication: List<ClaimResponseItemAdjudication> = emptyList(),
  public val detail: List<ClaimResponseItemDetail> = emptyList(),
) : BackboneElement
