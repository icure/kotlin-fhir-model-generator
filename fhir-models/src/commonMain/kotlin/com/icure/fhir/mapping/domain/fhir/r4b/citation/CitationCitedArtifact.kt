//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.citation

import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The article or artifact being described
 *
 * The article or artifact being described.
 *
 * @param id Unique id for inter-element referencing
 * @param dateAccessed When the cited artifact was accessed
 * @param version The defined version of the cited artifact
 * @param part The component of the article or artifact
 * @param contributorship Attribution of authors and other contributors
 */
@SerialName("CitationCitedArtifact")
@Serializable
public data class CitationCitedArtifact(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  public val relatedIdentifier: List<Identifier> = emptyList(),
  /**
   * When the cited artifact was accessed
   */
  public val dateAccessed: String? = null,
  /**
   * The defined version of the cited artifact
   */
  public val version: CitationCitedArtifactVersion? = null,
  public val currentState: List<CodeableConcept> = emptyList(),
  public val statusDate: List<CitationCitedArtifactStatusDate> = emptyList(),
  public val title: List<CitationCitedArtifactTitle> = emptyList(),
  public val `abstract`: List<CitationCitedArtifactAbstract> = emptyList(),
  /**
   * The component of the article or artifact
   */
  public val part: CitationCitedArtifactPart? = null,
  public val relatesTo: List<CitationCitedArtifactRelatesTo> = emptyList(),
  public val publicationForm: List<CitationCitedArtifactPublicationForm> = emptyList(),
  public val webLocation: List<CitationCitedArtifactWebLocation> = emptyList(),
  public val classification: List<CitationCitedArtifactClassification> = emptyList(),
  /**
   * Attribution of authors and other contributors
   */
  public val contributorship: CitationCitedArtifactContributorship? = null,
  public val note: List<Annotation> = emptyList(),
) : BackboneElement
