//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.riskassessment

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Potential outcomes for a subject with likelihood
 *
 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood
 * of each outcome.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param basedOn Request fulfilled by this assessment
 * @param parent Part of this occurrence
 * @param status registered | preliminary | final | amended +
 * @param method Evaluation mechanism
 * @param code Type of assessment
 * @param subject Who/what does assessment apply to?
 * @param encounter Where was assessment performed?
 * @param occurrenceDateTime When was assessment made?
 * @param occurrencePeriod When was assessment made?
 * @param condition Condition assessed
 * @param performer Who did assessment?
 * @param mitigation How to reduce risk
 */
@SerialName("RiskAssessment")
@Serializable
public data class RiskAssessment(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Request fulfilled by this assessment
   */
  public val basedOn: Reference? = null,
  /**
   * Part of this occurrence
   */
  public val parent: Reference? = null,
  /**
   * registered | preliminary | final | amended +
   */
  public val status: String? = null,
  /**
   * Evaluation mechanism
   */
  public val method: CodeableConcept? = null,
  /**
   * Type of assessment
   */
  public val code: CodeableConcept? = null,
  /**
   * Who/what does assessment apply to?
   */
  public val subject: Reference,
  /**
   * Where was assessment performed?
   */
  public val encounter: Reference? = null,
  /**
   * When was assessment made?
   */
  public val occurrenceDateTime: String? = null,
  /**
   * When was assessment made?
   */
  public val occurrencePeriod: Period? = null,
  /**
   * Condition assessed
   */
  public val condition: Reference? = null,
  /**
   * Who did assessment?
   */
  public val performer: Reference? = null,
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  public val basis: List<Reference> = emptyList(),
  public val prediction: List<RiskAssessmentPrediction> = emptyList(),
  /**
   * How to reduce risk
   */
  public val mitigation: String? = null,
  public val note: List<Annotation> = emptyList(),
) : DomainResource
