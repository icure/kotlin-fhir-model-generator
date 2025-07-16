//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.citation

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The component of the article or artifact
 *
 * The component of the article or artifact.
 *
 * @param id Unique id for inter-element referencing
 * @param type The kind of component
 * @param value The specification of the component
 * @param baseCitation The citation for the full article or artifact
 */
@SerialName("CitationCitedArtifactPart")
@Serializable
public data class CitationCitedArtifactPart(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The kind of component
   */
  public val type: CodeableConcept? = null,
  /**
   * The specification of the component
   */
  public val `value`: String? = null,
  /**
   * The citation for the full article or artifact
   */
  public val baseCitation: Reference? = null,
) : BackboneElement
