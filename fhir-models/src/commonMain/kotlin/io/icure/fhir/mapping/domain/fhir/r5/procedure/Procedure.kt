//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.procedure

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.age.Age
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.range.Range
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r5.timing.Timing
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An action that is being or was performed on an individual or entity
 *
 * An action that is or was performed on or for a patient, practitioner, device, organization, or
 * location. For example, this can be a physical intervention on a patient like an operation, or less
 * invasive like long term services, counseling, or hypnotherapy.  This can be a quality or safety
 * inspection for a location, organization, or device.  This can be an accreditation procedure on a
 * practitioner for licensing.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status preparation | in-progress | not-done | on-hold | stopped | completed |
 * entered-in-error | unknown
 * @param statusReason Reason for current status
 * @param code Identification of the procedure
 * @param subject Individual or entity the procedure was performed on
 * @param focus Who is the target of the procedure when it is not the subject of record only
 * @param encounter The Encounter during which this Procedure was created
 * @param occurrenceDateTime When the procedure occurred or is occurring
 * @param occurrencePeriod When the procedure occurred or is occurring
 * @param occurrenceString When the procedure occurred or is occurring
 * @param occurrenceAge When the procedure occurred or is occurring
 * @param occurrenceRange When the procedure occurred or is occurring
 * @param occurrenceTiming When the procedure occurred or is occurring
 * @param recorded When the procedure was first captured in the subject's record
 * @param recorder Who recorded the procedure
 * @param reportedBoolean Reported rather than primary record
 * @param reportedReference Reported rather than primary record
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
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Identification of the procedure
   */
  public val code: CodeableConcept? = null,
  /**
   * Individual or entity the procedure was performed on
   */
  public val subject: Reference,
  /**
   * Who is the target of the procedure when it is not the subject of record only
   */
  public val focus: Reference? = null,
  /**
   * The Encounter during which this Procedure was created
   */
  public val encounter: Reference? = null,
  /**
   * When the procedure occurred or is occurring
   */
  public val occurrenceDateTime: String? = null,
  /**
   * When the procedure occurred or is occurring
   */
  public val occurrencePeriod: Period? = null,
  /**
   * When the procedure occurred or is occurring
   */
  public val occurrenceString: String? = null,
  /**
   * When the procedure occurred or is occurring
   */
  public val occurrenceAge: Age? = null,
  /**
   * When the procedure occurred or is occurring
   */
  public val occurrenceRange: Range? = null,
  /**
   * When the procedure occurred or is occurring
   */
  public val occurrenceTiming: Timing? = null,
  /**
   * When the procedure was first captured in the subject's record
   */
  public val recorded: String? = null,
  /**
   * Who recorded the procedure
   */
  public val recorder: Reference? = null,
  /**
   * Reported rather than primary record
   */
  public val reportedBoolean: Boolean? = null,
  /**
   * Reported rather than primary record
   */
  public val reportedReference: Reference? = null,
  public val performer: List<ProcedurePerformer> = emptyList(),
  /**
   * Where the procedure happened
   */
  public val location: Reference? = null,
  public val reason: List<CodeableReference> = emptyList(),
  public val bodySite: List<CodeableConcept> = emptyList(),
  /**
   * The result of procedure
   */
  public val outcome: CodeableConcept? = null,
  public val report: List<Reference> = emptyList(),
  public val complication: List<CodeableReference> = emptyList(),
  public val followUp: List<CodeableConcept> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val focalDevice: List<ProcedureFocalDevice> = emptyList(),
  public val used: List<CodeableReference> = emptyList(),
  public val supportingInfo: List<Reference> = emptyList(),
) : DomainResource
