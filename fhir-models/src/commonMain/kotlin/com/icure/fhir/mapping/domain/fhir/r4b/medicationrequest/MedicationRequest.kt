//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.medicationrequest

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.dosage.Dosage
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Ordering of medication for patient or group
 *
 * An order or request for both supply of the medication and the instructions for administration of
 * the medication to a patient. The resource is called "MedicationRequest" rather than
 * "MedicationPrescription" or "MedicationOrder" to generalize the use across inpatient and outpatient
 * settings, including care plans, etc., and to harmonize with workflow patterns.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | on-hold | cancelled | completed | entered-in-error | stopped | draft |
 * unknown
 * @param statusReason Reason for current status
 * @param intent proposal | plan | order | original-order | reflex-order | filler-order |
 * instance-order | option
 * @param priority routine | urgent | asap | stat
 * @param doNotPerform True if request is prohibiting action
 * @param reportedBoolean Reported rather than primary record
 * @param reportedReference Reported rather than primary record
 * @param medicationCodeableConcept Medication to be taken
 * @param medicationReference Medication to be taken
 * @param subject Who or group medication request is for
 * @param encounter Encounter created as part of encounter/admission/stay
 * @param authoredOn When request was initially authored
 * @param requester Who/What requested the Request
 * @param performer Intended performer of administration
 * @param performerType Desired kind of performer of the medication administration
 * @param recorder Person who entered the request
 * @param groupIdentifier Composite request this is part of
 * @param courseOfTherapyType Overall pattern of medication administration
 * @param dispenseRequest Medication supply authorization
 * @param substitution Any restrictions on medication substitution
 * @param priorPrescription An order/prescription that is being replaced
 */
@SerialName("MedicationRequest")
@Serializable
public data class MedicationRequest(
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
   * active | on-hold | cancelled | completed | entered-in-error | stopped | draft | unknown
   */
  public val status: String? = null,
  /**
   * Reason for current status
   */
  public val statusReason: CodeableConcept? = null,
  /**
   * proposal | plan | order | original-order | reflex-order | filler-order | instance-order |
   * option
   */
  public val intent: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * routine | urgent | asap | stat
   */
  public val priority: String? = null,
  /**
   * True if request is prohibiting action
   */
  public val doNotPerform: Boolean? = null,
  /**
   * Reported rather than primary record
   */
  public val reportedBoolean: Boolean? = null,
  /**
   * Reported rather than primary record
   */
  public val reportedReference: Reference? = null,
  /**
   * Medication to be taken
   */
  public val medicationCodeableConcept: CodeableConcept? = null,
  /**
   * Medication to be taken
   */
  public val medicationReference: Reference? = null,
  /**
   * Who or group medication request is for
   */
  public val subject: Reference,
  /**
   * Encounter created as part of encounter/admission/stay
   */
  public val encounter: Reference? = null,
  public val supportingInformation: List<Reference> = emptyList(),
  /**
   * When request was initially authored
   */
  public val authoredOn: String? = null,
  /**
   * Who/What requested the Request
   */
  public val requester: Reference? = null,
  /**
   * Intended performer of administration
   */
  public val performer: Reference? = null,
  /**
   * Desired kind of performer of the medication administration
   */
  public val performerType: CodeableConcept? = null,
  /**
   * Person who entered the request
   */
  public val recorder: Reference? = null,
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  public val instantiatesCanonical: List<String> = emptyList(),
  public val instantiatesUri: List<String> = emptyList(),
  public val basedOn: List<Reference> = emptyList(),
  /**
   * Composite request this is part of
   */
  public val groupIdentifier: Identifier? = null,
  /**
   * Overall pattern of medication administration
   */
  public val courseOfTherapyType: CodeableConcept? = null,
  public val insurance: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val dosageInstruction: List<Dosage> = emptyList(),
  /**
   * Medication supply authorization
   */
  public val dispenseRequest: MedicationRequestDispenseRequest? = null,
  /**
   * Any restrictions on medication substitution
   */
  public val substitution: MedicationRequestSubstitution? = null,
  /**
   * An order/prescription that is being replaced
   */
  public val priorPrescription: Reference? = null,
  public val detectedIssue: List<Reference> = emptyList(),
  public val eventHistory: List<Reference> = emptyList(),
) : DomainResource
