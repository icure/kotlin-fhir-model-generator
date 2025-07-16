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
 * The title details of the article or artifact
 *
 * The title details of the article or artifact.
 *
 * @param id Unique id for inter-element referencing
 * @param language Used to express the specific language
 * @param text The title of the article or artifact
 */
@SerialName("CitationCitedArtifactTitle")
@Serializable
public data class CitationCitedArtifactTitle(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * Used to express the specific language
   */
  public val language: CodeableConcept? = null,
  /**
   * The title of the article or artifact
   */
  public val text: String? = null,
) : BackboneElement
