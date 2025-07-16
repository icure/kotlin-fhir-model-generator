//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.coverageeligibilityrequest

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
