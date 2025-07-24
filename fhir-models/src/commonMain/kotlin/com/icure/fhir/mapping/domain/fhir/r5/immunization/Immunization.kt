//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.immunization

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r5.servicelike.ServiceLike
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Immunization event information
 *
 * Describes the event of a patient being administered a vaccine or a record of an immunization as
 * reported by a patient, a clinician or another party.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status completed | entered-in-error | not-done
 * @param statusReason Reason for current status
 * @param vaccineCode Vaccine administered
 * @param administeredProduct Product that was administered
 * @param manufacturer Vaccine manufacturer
 * @param lotNumber Vaccine lot number
 * @param expirationDate Vaccine expiration date
 * @param patient Who was immunized
 * @param encounter Encounter immunization was part of
 * @param occurrenceDateTime Vaccine administration date
 * @param occurrenceString Vaccine administration date
 * @param primarySource Indicates context the data was captured in
 * @param informationSource Indicates the source of a  reported record
 * @param location Where immunization occurred
 * @param site Body site vaccine  was administered
 * @param route How vaccine entered body
 * @param doseQuantity Amount of vaccine administered
 * @param isSubpotent Dose potency
 * @param fundingSource Funding source for the vaccine
 */
@SerialName("Immunization")
@Serializable
public data class Immunization(
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
   * completed | entered-in-error | not-done
   */
  public val status: String? = null,
  /**
   * Reason for current status
   */
  public val statusReason: CodeableConcept? = null,
  /**
   * Vaccine administered
   */
  public val vaccineCode: CodeableConcept,
  /**
   * Product that was administered
   */
  public val administeredProduct: CodeableReference? = null,
  /**
   * Vaccine manufacturer
   */
  public val manufacturer: CodeableReference? = null,
  /**
   * Vaccine lot number
   */
  public val lotNumber: String? = null,
  /**
   * Vaccine expiration date
   */
  public val expirationDate: String? = null,
  /**
   * Who was immunized
   */
  public val patient: Reference,
  /**
   * Encounter immunization was part of
   */
  public val encounter: Reference? = null,
  public val supportingInformation: List<Reference> = emptyList(),
  /**
   * Vaccine administration date
   */
  public val occurrenceDateTime: String? = null,
  /**
   * Vaccine administration date
   */
  public val occurrenceString: String? = null,
  /**
   * Indicates context the data was captured in
   */
  public val primarySource: Boolean? = null,
  /**
   * Indicates the source of a  reported record
   */
  public val informationSource: CodeableReference? = null,
  /**
   * Where immunization occurred
   */
  public val location: Reference? = null,
  /**
   * Body site vaccine  was administered
   */
  public val site: CodeableConcept? = null,
  /**
   * How vaccine entered body
   */
  public val route: CodeableConcept? = null,
  /**
   * Amount of vaccine administered
   */
  public val doseQuantity: Quantity? = null,
  public val performer: List<ImmunizationPerformer> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val reason: List<CodeableReference> = emptyList(),
  /**
   * Dose potency
   */
  public val isSubpotent: Boolean? = null,
  public val subpotentReason: List<CodeableConcept> = emptyList(),
  public val programEligibility: List<ImmunizationProgramEligibility> = emptyList(),
  /**
   * Funding source for the vaccine
   */
  public val fundingSource: CodeableConcept? = null,
  public val reaction: List<ImmunizationReaction> = emptyList(),
  public val protocolApplied: List<ImmunizationProtocolApplied> = emptyList(),
) : ServiceLike, DomainResource
