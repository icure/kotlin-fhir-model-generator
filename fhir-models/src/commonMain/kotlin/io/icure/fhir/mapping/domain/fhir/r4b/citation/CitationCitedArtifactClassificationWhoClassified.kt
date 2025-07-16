//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.citation

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Provenance and copyright of classification
 *
 * Provenance and copyright of classification.
 *
 * @param id Unique id for inter-element referencing
 * @param person Person who created the classification
 * @param organization Organization who created the classification
 * @param publisher The publisher of the classification, not the publisher of the article or
 * artifact being cited
 * @param classifierCopyright Rights management statement for the classification
 * @param freeToShare Acceptable to re-use the classification
 */
@SerialName("CitationCitedArtifactClassificationWhoClassified")
@Serializable
public data class CitationCitedArtifactClassificationWhoClassified(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Person who created the classification
   */
  public val person: Reference? = null,
  /**
   * Organization who created the classification
   */
  public val organization: Reference? = null,
  /**
   * The publisher of the classification, not the publisher of the article or artifact being cited
   */
  public val publisher: Reference? = null,
  /**
   * Rights management statement for the classification
   */
  public val classifierCopyright: String? = null,
  /**
   * Acceptable to re-use the classification
   */
  public val freeToShare: Boolean? = null,
) : BackboneElement
