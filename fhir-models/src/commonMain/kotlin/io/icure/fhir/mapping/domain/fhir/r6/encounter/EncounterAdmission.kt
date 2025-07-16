//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.encounter

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details about the admission to a healthcare service
 *
 * Details about the stay during which a healthcare service is provided.This does not describe the
 * event of admitting the patient, but rather any information that is relevant from the time of
 * admittance until the time of discharge.
 *
 * @param id Unique id for inter-element referencing
 * @param preAdmissionIdentifier Pre-admission identifier
 * @param origin The location/organization from which the patient came before admission
 * @param admitSource From where patient was admitted (physician referral, transfer)
 * @param reAdmission Indicates that the patient is being re-admitted
 * @param destination Location/organization to which the patient is discharged
 * @param dischargeDisposition Category or kind of location after discharge
 */
@SerialName("EncounterAdmission")
@Serializable
public data class EncounterAdmission(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Pre-admission identifier
   */
  public val preAdmissionIdentifier: Identifier? = null,
  /**
   * The location/organization from which the patient came before admission
   */
  public val origin: Reference? = null,
  /**
   * From where patient was admitted (physician referral, transfer)
   */
  public val admitSource: CodeableConcept? = null,
  /**
   * Indicates that the patient is being re-admitted
   */
  public val reAdmission: CodeableConcept? = null,
  /**
   * Location/organization to which the patient is discharged
   */
  public val destination: Reference? = null,
  /**
   * Category or kind of location after discharge
   */
  public val dischargeDisposition: CodeableConcept? = null,
) : BackboneElement
