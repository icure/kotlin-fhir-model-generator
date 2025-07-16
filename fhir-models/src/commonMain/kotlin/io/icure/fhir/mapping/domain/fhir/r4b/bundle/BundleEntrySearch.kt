//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.bundle

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
 * @param mode match | include | outcome - why this is in the result set
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
   * match | include | outcome - why this is in the result set
   */
  public val mode: String? = null,
  /**
   * Search ranking (between 0 and 1)
   */
  public val score: Float? = null,
) : BackboneElement
