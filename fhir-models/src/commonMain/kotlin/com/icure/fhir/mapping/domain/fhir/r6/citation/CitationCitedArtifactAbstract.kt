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
 * Summary of the article or artifact
 *
 * The abstract may be used to convey article-contained abstracts, externally-created abstracts, or
 * other descriptive summaries.
 *
 * @param id Unique id for inter-element referencing
 * @param type The kind of abstract
 * @param language Used to express the specific language
 * @param text Abstract content
 * @param copyright Copyright notice for the abstract
 */
@SerialName("CitationCitedArtifactAbstract")
@Serializable
public data class CitationCitedArtifactAbstract(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The kind of abstract
   */
  public val type: CodeableConcept? = null,
  /**
   * Used to express the specific language
   */
  public val language: CodeableConcept? = null,
  /**
   * Abstract content
   */
  public val text: String? = null,
  /**
   * Copyright notice for the abstract
   */
  public val copyright: String? = null,
) : BackboneElement
