//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationstatement

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.dosage.Dosage
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r6.timing.Timing
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Record of medication being taken by a patient
 *
 * A record of a medication that is being consumed by a patient.   A MedicationStatement may
 * indicate that the patient may be taking the medication now or has taken the medication in the past
 * or will be taking the medication in the future.  The source of this information can be the patient,
 * significant other (such as a family member or spouse), or a clinician.  A common scenario where this
 * information is captured is during the history taking process during a patient visit or stay.   The
 * medication information may come from sources such as the patient's memory, from a prescription
 * bottle,  or from a list of medications the patient, clinician or other party maintains. 
 *
 * The primary difference between a medicationstatement and a medicationadministration is that the
 * medication administration has complete administration information and is based on actual
 * administration information from the person who administered the medication.  A medicationstatement
 * is often, if not always, less specific.  There is no required date/time when the medication was
 * administered, in fact we only know that a source has reported the patient is taking this medication,
 * where details such as time, quantity, or rate or even medication product may be incomplete or
 * missing or less precise.  As stated earlier, the Medication Statement information may come from the
 * patient's memory, from a prescription bottle or from a list of medications the patient, clinician or
 * other party maintains.  Medication administration is more formal and is not missing detailed
 * information.
 *
 * The MedicationStatement resource was previously called MedicationStatement.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status recorded | entered-in-error | draft
 * @param medication What medication was taken
 * @param subject Who is/was taking  the medication
 * @param encounter Encounter associated with MedicationStatement
 * @param effectiveDateTime The date/time or interval when the medication is/was/will be taken
 * @param effectivePeriod The date/time or interval when the medication is/was/will be taken
 * @param effectiveTiming The date/time or interval when the medication is/was/will be taken
 * @param dateAsserted When the usage was asserted?
 * @param renderedDosageInstruction Full representation of the dosage instructions
 * @param adherence Indicates whether the medication is or is not being consumed or administered
 */
@SerialName("MedicationStatement")
@Serializable
public data class MedicationStatement(
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
   * recorded | entered-in-error | draft
   */
  public val status: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * What medication was taken
   */
  public val medication: CodeableReference,
  /**
   * Who is/was taking  the medication
   */
  public val subject: Reference,
  /**
   * Encounter associated with MedicationStatement
   */
  public val encounter: Reference? = null,
  /**
   * The date/time or interval when the medication is/was/will be taken
   */
  public val effectiveDateTime: String? = null,
  /**
   * The date/time or interval when the medication is/was/will be taken
   */
  public val effectivePeriod: Period? = null,
  /**
   * The date/time or interval when the medication is/was/will be taken
   */
  public val effectiveTiming: Timing? = null,
  /**
   * When the usage was asserted?
   */
  public val dateAsserted: String? = null,
  public val informationSource: List<Reference> = emptyList(),
  public val derivedFrom: List<Reference> = emptyList(),
  public val reason: List<CodeableReference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val relatedClinicalInformation: List<Reference> = emptyList(),
  /**
   * Full representation of the dosage instructions
   */
  public val renderedDosageInstruction: String? = null,
  public val dosage: List<Dosage> = emptyList(),
  /**
   * Indicates whether the medication is or is not being consumed or administered
   */
  public val adherence: MedicationStatementAdherence? = null,
) : DomainResource
