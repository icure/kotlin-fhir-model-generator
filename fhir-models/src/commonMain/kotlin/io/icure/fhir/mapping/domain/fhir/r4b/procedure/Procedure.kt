//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.procedure

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.age.Age
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.range.Range
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An action that is being or was performed on a patient
 *
 * An action that is or was performed on or for a patient. This can be a physical intervention like
 * an operation, or less invasive like long term services, counseling, or hypnotherapy.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status preparation | in-progress | not-done | on-hold | stopped | completed |
 * entered-in-error | unknown
 * @param statusReason Reason for current status
 * @param category Classification of the procedure
 * @param code Identification of the procedure
 * @param subject Who the procedure was performed on
 * @param encounter Encounter created as part of
 * @param performedDateTime When the procedure was performed
 * @param performedPeriod When the procedure was performed
 * @param performedString When the procedure was performed
 * @param performedAge When the procedure was performed
 * @param performedRange When the procedure was performed
 * @param recorder Who recorded the procedure
 * @param asserter Person who asserts this procedure
 * @param location Where the procedure happened
 * @param outcome The result of procedure
 */
@SerialName("Procedure")
@Serializable
public data class Procedure(
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
  public val instantiatesCanonical: List<String> = emptyList(),
  public val instantiatesUri: List<String> = emptyList(),
  public val basedOn: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * preparation | in-progress | not-done | on-hold | stopped | completed | entered-in-error |
   * unknown
   */
  public val status: String? = null,
  /**
   * Reason for current status
   */
  public val statusReason: CodeableConcept? = null,
  /**
   * Classification of the procedure
   */
  public val category: CodeableConcept? = null,
  /**
   * Identification of the procedure
   */
  public val code: CodeableConcept? = null,
  /**
   * Who the procedure was performed on
   */
  public val subject: Reference,
  /**
   * Encounter created as part of
   */
  public val encounter: Reference? = null,
  /**
   * When the procedure was performed
   */
  public val performedDateTime: String? = null,
  /**
   * When the procedure was performed
   */
  public val performedPeriod: Period? = null,
  /**
   * When the procedure was performed
   */
  public val performedString: String? = null,
  /**
   * When the procedure was performed
   */
  public val performedAge: Age? = null,
  /**
   * When the procedure was performed
   */
  public val performedRange: Range? = null,
  /**
   * Who recorded the procedure
   */
  public val recorder: Reference? = null,
  /**
   * Person who asserts this procedure
   */
  public val asserter: Reference? = null,
  public val performer: List<ProcedurePerformer> = emptyList(),
  /**
   * Where the procedure happened
   */
  public val location: Reference? = null,
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  public val bodySite: List<CodeableConcept> = emptyList(),
  /**
   * The result of procedure
   */
  public val outcome: CodeableConcept? = null,
  public val report: List<Reference> = emptyList(),
  public val complication: List<CodeableConcept> = emptyList(),
  public val complicationDetail: List<Reference> = emptyList(),
  public val followUp: List<CodeableConcept> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val focalDevice: List<ProcedureFocalDevice> = emptyList(),
  public val usedReference: List<Reference> = emptyList(),
  public val usedCode: List<CodeableConcept> = emptyList(),
) : DomainResource
