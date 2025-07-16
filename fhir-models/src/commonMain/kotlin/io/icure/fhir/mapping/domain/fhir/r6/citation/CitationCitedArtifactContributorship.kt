//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.citation

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Attribution of authors and other contributors
 *
 * This element is used to list authors and other contributors, their contact information, specific
 * contributions, and summary statements.
 *
 * @param id Unique id for inter-element referencing
 * @param complete Indicates if the list includes all authors and/or contributors
 */
@SerialName("CitationCitedArtifactContributorship")
@Serializable
public data class CitationCitedArtifactContributorship(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Indicates if the list includes all authors and/or contributors
   */
  public val complete: Boolean? = null,
  public val entry: List<CitationCitedArtifactContributorshipEntry> = emptyList(),
  public val summary: List<CitationCitedArtifactContributorshipSummary> = emptyList(),
) : BackboneElement
