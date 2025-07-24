//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.citation

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The collection the cited article or artifact is published in
 *
 * The collection the cited article or artifact is published in.
 *
 * @param id Unique id for inter-element referencing
 * @param type Kind of container (e.g. Periodical, database, or book)
 * @param title Name of the database or title of the book or journal
 * @param publisher Name of or resource describing the publisher
 * @param publisherLocation Geographic location of the publisher
 */
@SerialName("CitationCitedArtifactPublicationFormPublishedIn")
@Serializable
public data class CitationCitedArtifactPublicationFormPublishedIn(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Kind of container (e.g. Periodical, database, or book)
   */
  public val type: CodeableConcept? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Name of the database or title of the book or journal
   */
  public val title: String? = null,
  /**
   * Name of or resource describing the publisher
   */
  public val publisher: Reference? = null,
  /**
   * Geographic location of the publisher
   */
  public val publisherLocation: String? = null,
) : BackboneElement
