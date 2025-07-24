//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.medicationdispense

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.dosage.Dosage
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Dispensing a medication to a named patient
 *
 * Indicates that a medication product is to be or has been dispensed for a named person/patient. 
 * This includes a description of the medication product (supply) provided and the instructions for
 * administering the medication.  The medication dispense is the result of a pharmacy system responding
 * to a medication order.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status preparation | in-progress | cancelled | on-hold | completed | entered-in-error |
 * stopped | declined | unknown
 * @param statusReasonCodeableConcept Why a dispense was not performed
 * @param statusReasonReference Why a dispense was not performed
 * @param category Type of medication dispense
 * @param medicationCodeableConcept What medication was supplied
 * @param medicationReference What medication was supplied
 * @param subject Who the dispense is for
 * @param context Encounter / Episode associated with event
 * @param location Where the dispense occurred
 * @param type Trial fill, partial fill, emergency fill, etc.
 * @param quantity Amount dispensed
 * @param daysSupply Amount of medication expressed as a timing amount
 * @param whenPrepared When product was packaged and reviewed
 * @param whenHandedOver When product was given out
 * @param destination Where the medication was sent
 * @param substitution Whether a substitution was performed on the dispense
 */
@SerialName("MedicationDispense")
@Serializable
public data class MedicationDispense(
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
  public val partOf: List<Reference> = emptyList(),
  /**
   * preparation | in-progress | cancelled | on-hold | completed | entered-in-error | stopped |
   * declined | unknown
   */
  public val status: String? = null,
  /**
   * Why a dispense was not performed
   */
  public val statusReasonCodeableConcept: CodeableConcept? = null,
  /**
   * Why a dispense was not performed
   */
  public val statusReasonReference: Reference? = null,
  /**
   * Type of medication dispense
   */
  public val category: CodeableConcept? = null,
  /**
   * What medication was supplied
   */
  public val medicationCodeableConcept: CodeableConcept? = null,
  /**
   * What medication was supplied
   */
  public val medicationReference: Reference? = null,
  /**
   * Who the dispense is for
   */
  public val subject: Reference? = null,
  /**
   * Encounter / Episode associated with event
   */
  public val context: Reference? = null,
  public val supportingInformation: List<Reference> = emptyList(),
  public val performer: List<MedicationDispensePerformer> = emptyList(),
  /**
   * Where the dispense occurred
   */
  public val location: Reference? = null,
  public val authorizingPrescription: List<Reference> = emptyList(),
  /**
   * Trial fill, partial fill, emergency fill, etc.
   */
  public val type: CodeableConcept? = null,
  /**
   * Amount dispensed
   */
  public val quantity: Quantity? = null,
  /**
   * Amount of medication expressed as a timing amount
   */
  public val daysSupply: Quantity? = null,
  /**
   * When product was packaged and reviewed
   */
  public val whenPrepared: String? = null,
  /**
   * When product was given out
   */
  public val whenHandedOver: String? = null,
  /**
   * Where the medication was sent
   */
  public val destination: Reference? = null,
  public val `receiver`: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val dosageInstruction: List<Dosage> = emptyList(),
  /**
   * Whether a substitution was performed on the dispense
   */
  public val substitution: MedicationDispenseSubstitution? = null,
  public val detectedIssue: List<Reference> = emptyList(),
  public val eventHistory: List<Reference> = emptyList(),
) : DomainResource
