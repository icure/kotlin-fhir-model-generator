//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.citation

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
