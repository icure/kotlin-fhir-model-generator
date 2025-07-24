//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.citation

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * If multiple, used to represent alternative forms of the article that are not separate citations
 *
 * If multiple, used to represent alternative forms of the article that are not separate citations.
 *
 * @param id Unique id for inter-element referencing
 * @param publishedIn The collection the cited article or artifact is published in
 * @param citedMedium Internet or Print
 * @param volume Volume number of journal or other collection in which the article is published
 * @param issue Issue, part or supplement of journal or other collection in which the article is
 * published
 * @param articleDate The date the article was added to the database, or the date the article was
 * released
 * @param publicationDateText Text representation of the date on which the issue of the cited
 * artifact was published
 * @param publicationDateSeason Season in which the cited artifact was published
 * @param lastRevisionDate The date the article was last revised or updated in the database
 * @param accessionNumber Entry number or identifier for inclusion in a database
 * @param pageString Used for full display of pagination
 * @param firstPage Used for isolated representation of first page
 * @param lastPage Used for isolated representation of last page
 * @param pageCount Number of pages or screens
 * @param copyright Copyright notice for the full article or artifact
 */
@SerialName("CitationCitedArtifactPublicationForm")
@Serializable
public data class CitationCitedArtifactPublicationForm(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The collection the cited article or artifact is published in
   */
  public val publishedIn: CitationCitedArtifactPublicationFormPublishedIn? = null,
  /**
   * Internet or Print
   */
  public val citedMedium: CodeableConcept? = null,
  /**
   * Volume number of journal or other collection in which the article is published
   */
  public val volume: String? = null,
  /**
   * Issue, part or supplement of journal or other collection in which the article is published
   */
  public val issue: String? = null,
  /**
   * The date the article was added to the database, or the date the article was released
   */
  public val articleDate: String? = null,
  /**
   * Text representation of the date on which the issue of the cited artifact was published
   */
  public val publicationDateText: String? = null,
  /**
   * Season in which the cited artifact was published
   */
  public val publicationDateSeason: String? = null,
  /**
   * The date the article was last revised or updated in the database
   */
  public val lastRevisionDate: String? = null,
  public val language: List<CodeableConcept> = emptyList(),
  /**
   * Entry number or identifier for inclusion in a database
   */
  public val accessionNumber: String? = null,
  /**
   * Used for full display of pagination
   */
  public val pageString: String? = null,
  /**
   * Used for isolated representation of first page
   */
  public val firstPage: String? = null,
  /**
   * Used for isolated representation of last page
   */
  public val lastPage: String? = null,
  /**
   * Number of pages or screens
   */
  public val pageCount: String? = null,
  /**
   * Copyright notice for the full article or artifact
   */
  public val copyright: String? = null,
) : BackboneElement
