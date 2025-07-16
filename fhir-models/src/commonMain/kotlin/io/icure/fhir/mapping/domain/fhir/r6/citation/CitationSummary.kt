//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.citation

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A human-readable display of key concepts to represent the citation
 *
 * A human-readable display of key concepts to represent the citation.
 *
 * @param id Unique id for inter-element referencing
 * @param style Format for display of the citation summary
 * @param text The human-readable display of the citation summary
 */
@SerialName("CitationSummary")
@Serializable
public data class CitationSummary(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Format for display of the citation summary
   */
  public val style: CodeableConcept? = null,
  /**
   * The human-readable display of the citation summary
   */
  public val text: String? = null,
) : BackboneElement
