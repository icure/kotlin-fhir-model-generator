//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.citation

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The specific issue in which the cited article resides
 *
 * The specific issue in which the cited article resides.
 *
 * @param id Unique id for inter-element referencing
 * @param citedMedium Internet or Print
 * @param volume Volume number of journal in which the article is published
 * @param issue Issue, part or supplement of journal in which the article is published
 * @param dateOfPublication Defining the date on which the issue of the journal was published
 */
@SerialName("CitationCitedArtifactPublicationFormPeriodicRelease")
@Serializable
public data class CitationCitedArtifactPublicationFormPeriodicRelease(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Internet or Print
   */
  public val citedMedium: CodeableConcept? = null,
  /**
   * Volume number of journal in which the article is published
   */
  public val volume: String? = null,
  /**
   * Issue, part or supplement of journal in which the article is published
   */
  public val issue: String? = null,
  /**
   * Defining the date on which the issue of the journal was published
   */
  public val dateOfPublication:
      CitationCitedArtifactPublicationFormPeriodicReleaseDateOfPublication? = null,
) : BackboneElement
