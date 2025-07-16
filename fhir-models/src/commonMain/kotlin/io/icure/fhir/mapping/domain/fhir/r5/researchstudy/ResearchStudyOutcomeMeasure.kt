//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.researchstudy

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A variable measured during the study
 *
 * An "outcome measure", "endpoint", "effect measure" or "measure of effect" is a specific
 * measurement or observation used to quantify the effect of experimental variables on the participants
 * in a study, or for observational studies, to describe patterns of diseases or traits or associations
 * with exposures, risk factors or treatment.
 *
 * @param id Unique id for inter-element referencing
 * @param name Label for the outcome
 * @param description Description of the outcome
 * @param reference Structured outcome definition
 */
@SerialName("ResearchStudyOutcomeMeasure")
@Serializable
public data class ResearchStudyOutcomeMeasure(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Label for the outcome
   */
  public val name: String? = null,
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * Description of the outcome
   */
  public val description: String? = null,
  /**
   * Structured outcome definition
   */
  public val reference: Reference? = null,
) : BackboneElement
