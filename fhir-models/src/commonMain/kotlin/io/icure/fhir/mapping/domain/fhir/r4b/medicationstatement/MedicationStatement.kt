//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.medicationstatement

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.dosage.Dosage
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * The primary difference between a medication statement and a medication administration is that the
 * medication administration has complete administration information and is based on actual
 * administration information from the person who administered the medication.  A medication statement
 * is often, if not always, less specific.  There is no required date/time when the medication was
 * administered, in fact we only know that a source has reported the patient is taking this medication,
 * where details such as time, quantity, or rate or even medication product may be incomplete or
 * missing or less precise.  As stated earlier, the medication statement information may come from the
 * patient's memory, from a prescription bottle or from a list of medications the patient, clinician or
 * other party maintains.  Medication administration is more formal and is not missing detailed
 * information.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | completed | entered-in-error | intended | stopped | on-hold | unknown |
 * not-taken
 * @param category Type of medication usage
 * @param medicationCodeableConcept What medication was taken
 * @param medicationReference What medication was taken
 * @param subject Who is/was taking  the medication
 * @param context Encounter / Episode associated with MedicationStatement
 * @param effectiveDateTime The date/time or interval when the medication is/was/will be taken
 * @param effectivePeriod The date/time or interval when the medication is/was/will be taken
 * @param dateAsserted When the statement was asserted?
 * @param informationSource Person or organization that provided the information about the taking of
 * this medication
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
  public val basedOn: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * active | completed | entered-in-error | intended | stopped | on-hold | unknown | not-taken
   */
  public val status: String? = null,
  public val statusReason: List<CodeableConcept> = emptyList(),
  /**
   * Type of medication usage
   */
  public val category: CodeableConcept? = null,
  /**
   * What medication was taken
   */
  public val medicationCodeableConcept: CodeableConcept? = null,
  /**
   * What medication was taken
   */
  public val medicationReference: Reference? = null,
  /**
   * Who is/was taking  the medication
   */
  public val subject: Reference,
  /**
   * Encounter / Episode associated with MedicationStatement
   */
  public val context: Reference? = null,
  /**
   * The date/time or interval when the medication is/was/will be taken
   */
  public val effectiveDateTime: String? = null,
  /**
   * The date/time or interval when the medication is/was/will be taken
   */
  public val effectivePeriod: Period? = null,
  /**
   * When the statement was asserted?
   */
  public val dateAsserted: String? = null,
  /**
   * Person or organization that provided the information about the taking of this medication
   */
  public val informationSource: Reference? = null,
  public val derivedFrom: List<Reference> = emptyList(),
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val dosage: List<Dosage> = emptyList(),
) : DomainResource
