//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.composition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Composition is broken into sections
 *
 * The root of the sections that make up the composition.
 *
 * @param id Unique id for inter-element referencing
 * @param title Label for section (e.g. for ToC)
 * @param code Classification of section (recommended)
 * @param focus Who/what the section is about, when it is not about the subject of composition
 * @param text Text summary of the section, for human interpretation
 * @param orderedBy Order of section entries
 * @param emptyReason Why the section is empty
 */
@SerialName("CompositionSection")
@Serializable
public data class CompositionSection(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Label for section (e.g. for ToC)
   */
  public val title: String? = null,
  /**
   * Classification of section (recommended)
   */
  public val code: CodeableConcept? = null,
  public val author: List<Reference> = emptyList(),
  /**
   * Who/what the section is about, when it is not about the subject of composition
   */
  public val focus: Reference? = null,
  /**
   * Text summary of the section, for human interpretation
   */
  public val text: Narrative? = null,
  /**
   * Order of section entries
   */
  public val orderedBy: CodeableConcept? = null,
  public val entry: List<Reference> = emptyList(),
  /**
   * Why the section is empty
   */
  public val emptyReason: CodeableConcept? = null,
  public val section: List<CompositionSection> = emptyList(),
) : BackboneElement
