//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.immunizationevaluation

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Immunization evaluation information
 *
 * Describes a comparison of an immunization event against published recommendations to determine if
 * the administration is "valid" in relation to those  recommendations.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status completed | entered-in-error
 * @param patient Who this evaluation is for
 * @param date Date evaluation was performed
 * @param authority Who is responsible for publishing the recommendations
 * @param targetDisease Evaluation target disease
 * @param immunizationEvent Immunization being evaluated
 * @param doseStatus Status of the dose relative to published recommendations
 * @param description Evaluation notes
 * @param series Name of vaccine series
 * @param doseNumberPositiveInt Dose number within series
 * @param doseNumberString Dose number within series
 * @param seriesDosesPositiveInt Recommended number of doses for immunity
 * @param seriesDosesString Recommended number of doses for immunity
 */
@SerialName("ImmunizationEvaluation")
@Serializable
public data class ImmunizationEvaluation(
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
   * completed | entered-in-error
   */
  public val status: String? = null,
  /**
   * Who this evaluation is for
   */
  public val patient: Reference,
  /**
   * Date evaluation was performed
   */
  public val date: String? = null,
  /**
   * Who is responsible for publishing the recommendations
   */
  public val authority: Reference? = null,
  /**
   * Evaluation target disease
   */
  public val targetDisease: CodeableConcept,
  /**
   * Immunization being evaluated
   */
  public val immunizationEvent: Reference,
  /**
   * Status of the dose relative to published recommendations
   */
  public val doseStatus: CodeableConcept,
  public val doseStatusReason: List<CodeableConcept> = emptyList(),
  /**
   * Evaluation notes
   */
  public val description: String? = null,
  /**
   * Name of vaccine series
   */
  public val series: String? = null,
  /**
   * Dose number within series
   */
  public val doseNumberPositiveInt: Int? = null,
  /**
   * Dose number within series
   */
  public val doseNumberString: String? = null,
  /**
   * Recommended number of doses for immunity
   */
  public val seriesDosesPositiveInt: Int? = null,
  /**
   * Recommended number of doses for immunity
   */
  public val seriesDosesString: String? = null,
) : DomainResource
