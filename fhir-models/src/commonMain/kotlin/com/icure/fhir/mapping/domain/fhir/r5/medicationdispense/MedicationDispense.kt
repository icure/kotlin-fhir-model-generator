//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.medicationdispense

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.dosage.Dosage
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param notPerformedReason Why a dispense was not performed
 * @param statusChanged When the status changed
 * @param medication What medication was supplied
 * @param subject Who the dispense is for
 * @param encounter Encounter associated with event
 * @param location Where the dispense occurred
 * @param type Trial fill, partial fill, emergency fill, etc
 * @param quantity Amount dispensed
 * @param daysSupply Amount of medication expressed as a timing amount
 * @param recorded When the recording of the dispense started
 * @param whenPrepared When product was packaged and reviewed
 * @param whenHandedOver When product was given out
 * @param destination Where the medication was/will be sent
 * @param renderedDosageInstruction Full representation of the dosage instructions
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
  public val basedOn: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * preparation | in-progress | cancelled | on-hold | completed | entered-in-error | stopped |
   * declined | unknown
   */
  public val status: String? = null,
  /**
   * Why a dispense was not performed
   */
  public val notPerformedReason: CodeableReference? = null,
  /**
   * When the status changed
   */
  public val statusChanged: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * What medication was supplied
   */
  public val medication: CodeableReference,
  /**
   * Who the dispense is for
   */
  public val subject: Reference,
  /**
   * Encounter associated with event
   */
  public val encounter: Reference? = null,
  public val supportingInformation: List<Reference> = emptyList(),
  public val performer: List<MedicationDispensePerformer> = emptyList(),
  /**
   * Where the dispense occurred
   */
  public val location: Reference? = null,
  public val authorizingPrescription: List<Reference> = emptyList(),
  /**
   * Trial fill, partial fill, emergency fill, etc
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
   * When the recording of the dispense started
   */
  public val recorded: String? = null,
  /**
   * When product was packaged and reviewed
   */
  public val whenPrepared: String? = null,
  /**
   * When product was given out
   */
  public val whenHandedOver: String? = null,
  /**
   * Where the medication was/will be sent
   */
  public val destination: Reference? = null,
  public val `receiver`: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  /**
   * Full representation of the dosage instructions
   */
  public val renderedDosageInstruction: String? = null,
  public val dosageInstruction: List<Dosage> = emptyList(),
  /**
   * Whether a substitution was performed on the dispense
   */
  public val substitution: MedicationDispenseSubstitution? = null,
  public val eventHistory: List<Reference> = emptyList(),
) : DomainResource
