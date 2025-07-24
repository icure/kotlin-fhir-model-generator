//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.bundle

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Search related information
 *
 * Information about the search process that lead to the creation of this entry.
 *
 * @param id Unique id for inter-element referencing
 * @param mode match | include - why this is in the result set
 * @param score Search ranking (between 0 and 1)
 */
@SerialName("BundleEntrySearch")
@Serializable
public data class BundleEntrySearch(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * match | include - why this is in the result set
   */
  public val mode: String? = null,
  /**
   * Search ranking (between 0 and 1)
   */
  public val score: Float? = null,
) : BackboneElement
