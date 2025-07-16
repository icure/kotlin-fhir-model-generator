//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.evidence

import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Certainty or quality of the evidence
 *
 * Assessment of certainty, confidence in the estimates, or quality of the evidence.
 *
 * @param id Unique id for inter-element referencing
 * @param description Textual description of certainty
 * @param type Aspect of certainty being rated
 * @param rating Assessment or judgement of the aspect
 * @param rater Individual or group who did the rating
 */
@SerialName("EvidenceCertainty")
@Serializable
public data class EvidenceCertainty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Textual description of certainty
   */
  public val description: String? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * Aspect of certainty being rated
   */
  public val type: CodeableConcept? = null,
  /**
   * Assessment or judgement of the aspect
   */
  public val rating: CodeableConcept? = null,
  /**
   * Individual or group who did the rating
   */
  public val rater: String? = null,
  public val subcomponent: List<EvidenceCertainty> = emptyList(),
) : BackboneElement
