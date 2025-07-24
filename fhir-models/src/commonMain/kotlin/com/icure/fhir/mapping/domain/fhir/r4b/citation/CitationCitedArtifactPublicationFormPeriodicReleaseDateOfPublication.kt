//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.citation

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Defining the date on which the issue of the journal was published
 *
 * Defining the date on which the issue of the journal was published.
 *
 * @param id Unique id for inter-element referencing
 * @param date Date on which the issue of the journal was published
 * @param year Year on which the issue of the journal was published
 * @param month Month on which the issue of the journal was published
 * @param day Day on which the issue of the journal was published
 * @param season Season on which the issue of the journal was published
 * @param text Text representation of the date of which the issue of the journal was published
 */
@SerialName("CitationCitedArtifactPublicationFormPeriodicReleaseDateOfPublication")
@Serializable
public data class CitationCitedArtifactPublicationFormPeriodicReleaseDateOfPublication(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Date on which the issue of the journal was published
   */
  public val date: String? = null,
  /**
   * Year on which the issue of the journal was published
   */
  public val year: String? = null,
  /**
   * Month on which the issue of the journal was published
   */
  public val month: String? = null,
  /**
   * Day on which the issue of the journal was published
   */
  public val day: String? = null,
  /**
   * Season on which the issue of the journal was published
   */
  public val season: String? = null,
  /**
   * Text representation of the date of which the issue of the journal was published
   */
  public val text: String? = null,
) : BackboneElement
