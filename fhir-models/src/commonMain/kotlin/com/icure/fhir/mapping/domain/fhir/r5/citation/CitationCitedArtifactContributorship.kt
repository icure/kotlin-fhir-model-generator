//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.citation

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
