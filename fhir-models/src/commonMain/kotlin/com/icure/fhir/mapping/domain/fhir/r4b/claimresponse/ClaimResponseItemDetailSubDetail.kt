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
 * Adjudication for claim sub-details
 *
 * A sub-detail adjudication of a simple product or service.
 *
 * @param id Unique id for inter-element referencing
 * @param subDetailSequence Claim sub-detail instance identifier
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
  public val noteNumber: List<Int> = emptyList(),
  public val adjudication: List<ClaimResponseItemAdjudication> = emptyList(),
) : BackboneElement
