//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.citation

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param publisher Name of the publisher
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
   * Name of the publisher
   */
  public val publisher: Reference? = null,
  /**
   * Geographic location of the publisher
   */
  public val publisherLocation: String? = null,
) : BackboneElement
