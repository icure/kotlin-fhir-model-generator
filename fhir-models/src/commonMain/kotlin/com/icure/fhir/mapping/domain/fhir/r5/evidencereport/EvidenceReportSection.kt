//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.evidencereport

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param focus Classification of section (recommended)
 * @param focusReference Classification of section by Resource
 * @param text Text summary of the section, for human interpretation
 * @param mode working | snapshot | changes
 * @param orderedBy Order of section entries
 * @param emptyReason Why the section is empty
 */
@SerialName("EvidenceReportSection")
@Serializable
public data class EvidenceReportSection(
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
  public val focus: CodeableConcept? = null,
  /**
   * Classification of section by Resource
   */
  public val focusReference: Reference? = null,
  public val author: List<Reference> = emptyList(),
  /**
   * Text summary of the section, for human interpretation
   */
  public val text: Narrative? = null,
  /**
   * working | snapshot | changes
   */
  public val mode: String? = null,
  /**
   * Order of section entries
   */
  public val orderedBy: CodeableConcept? = null,
  public val entryClassifier: List<CodeableConcept> = emptyList(),
  public val entryReference: List<Reference> = emptyList(),
  public val entryQuantity: List<Quantity> = emptyList(),
  /**
   * Why the section is empty
   */
  public val emptyReason: CodeableConcept? = null,
  public val section: List<EvidenceReportSection> = emptyList(),
) : BackboneElement
