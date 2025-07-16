//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.citation

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
  public val artifactAssessment: List<Reference> = emptyList(),
) : BackboneElement
