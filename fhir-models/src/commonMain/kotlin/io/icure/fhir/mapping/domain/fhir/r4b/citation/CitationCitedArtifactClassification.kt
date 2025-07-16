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
 * The assignment to an organizing scheme
 *
 * The assignment to an organizing scheme.
 *
 * @param id Unique id for inter-element referencing
 * @param type The kind of classifier (e.g. publication type, keyword)
 * @param whoClassified Provenance and copyright of classification
 */
@SerialName("CitationCitedArtifactClassification")
@Serializable
public data class CitationCitedArtifactClassification(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The kind of classifier (e.g. publication type, keyword)
   */
  public val type: CodeableConcept? = null,
  public val classifier: List<CodeableConcept> = emptyList(),
  /**
   * Provenance and copyright of classification
   */
  public val whoClassified: CitationCitedArtifactClassificationWhoClassified? = null,
) : BackboneElement
