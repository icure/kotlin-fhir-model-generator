//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.coverageeligibilityrequest

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Supporting information
 *
 * Additional information codes regarding exceptions, special considerations, the condition,
 * situation, prior or concurrent issues.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Information instance identifier
 * @param information Data to be provided
 * @param appliesToAll Applies to all items
 */
@SerialName("CoverageEligibilityRequestSupportingInfo")
@Serializable
public data class CoverageEligibilityRequestSupportingInfo(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Information instance identifier
   */
  public val sequence: Int? = null,
  /**
   * Data to be provided
   */
  public val information: Reference,
  /**
   * Applies to all items
   */
  public val appliesToAll: Boolean? = null,
) : BackboneElement
