//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.citation

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Used for any URL for the article or artifact cited
 *
 * Used for any URL for the article or artifact cited.
 *
 * @param id Unique id for inter-element referencing
 * @param type Code the reason for different URLs, e.g. abstract and full-text
 * @param url The specific URL
 */
@SerialName("CitationCitedArtifactWebLocation")
@Serializable
public data class CitationCitedArtifactWebLocation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code the reason for different URLs, e.g. abstract and full-text
   */
  public val type: CodeableConcept? = null,
  /**
   * The specific URL
   */
  public val url: String? = null,
) : BackboneElement
