//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.citation

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
  public val classifier: List<CodeableConcept> = emptyList(),
  /**
   * The specific URL
   */
  public val url: String? = null,
) : BackboneElement
