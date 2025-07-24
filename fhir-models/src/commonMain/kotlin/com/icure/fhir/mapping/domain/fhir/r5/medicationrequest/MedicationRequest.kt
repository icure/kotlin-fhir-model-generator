//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.medicationrequest

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.dosage.Dosage
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param priorPrescription Reference to an order/prescription that is being replaced by this
 * MedicationRequest
 * @param groupIdentifier Composite request this is part of
 * @param status active | on-hold | ended | stopped | completed | cancelled | entered-in-error |
 * draft | unknown
 * @param statusReason Reason for current status
 * @param statusChanged When the status was changed
 * @param intent proposal | plan | order | original-order | reflex-order | filler-order |
 * instance-order | option
 * @param priority routine | urgent | asap | stat
 * @param doNotPerform True if patient is to stop taking or not to start taking the medication
 * @param medication Medication to be taken
 * @param subject Individual or group for whom the medication has been requested
 * @param encounter Encounter created as part of encounter/admission/stay
 * @param authoredOn When request was initially authored
 * @param requester Who/What requested the Request
 * @param reported Reported rather than primary record
 * @param performerType Desired kind of performer of the medication administration
 * @param recorder Person who entered the request
 * @param courseOfTherapyType Overall pattern of medication administration
 * @param renderedDosageInstruction Full representation of the dosage instructions
 * @param effectiveDosePeriod Period over which the medication is to be taken
 * @param dispenseRequest Medication supply authorization
 * @param substitution Any restrictions on medication substitution
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
  public val basedOn: List<Reference> = emptyList(),
  /**
   * Reference to an order/prescription that is being replaced by this MedicationRequest
   */
  public val priorPrescription: Reference? = null,
  /**
   * Composite request this is part of
   */
  public val groupIdentifier: Identifier? = null,
  /**
   * active | on-hold | ended | stopped | completed | cancelled | entered-in-error | draft | unknown
   */
  public val status: String? = null,
  /**
   * Reason for current status
   */
  public val statusReason: CodeableConcept? = null,
  /**
   * When the status was changed
   */
  public val statusChanged: String? = null,
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
   * True if patient is to stop taking or not to start taking the medication
   */
  public val doNotPerform: Boolean? = null,
  /**
   * Medication to be taken
   */
  public val medication: CodeableReference,
  /**
   * Individual or group for whom the medication has been requested
   */
  public val subject: Reference,
  public val informationSource: List<Reference> = emptyList(),
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
   * Reported rather than primary record
   */
  public val reported: Boolean? = null,
  /**
   * Desired kind of performer of the medication administration
   */
  public val performerType: CodeableConcept? = null,
  public val performer: List<Reference> = emptyList(),
  public val device: List<CodeableReference> = emptyList(),
  /**
   * Person who entered the request
   */
  public val recorder: Reference? = null,
  public val reason: List<CodeableReference> = emptyList(),
  /**
   * Overall pattern of medication administration
   */
  public val courseOfTherapyType: CodeableConcept? = null,
  public val insurance: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  /**
   * Full representation of the dosage instructions
   */
  public val renderedDosageInstruction: String? = null,
  /**
   * Period over which the medication is to be taken
   */
  public val effectiveDosePeriod: Period? = null,
  public val dosageInstruction: List<Dosage> = emptyList(),
  /**
   * Medication supply authorization
   */
  public val dispenseRequest: MedicationRequestDispenseRequest? = null,
  /**
   * Any restrictions on medication substitution
   */
  public val substitution: MedicationRequestSubstitution? = null,
  public val eventHistory: List<Reference> = emptyList(),
) : DomainResource
