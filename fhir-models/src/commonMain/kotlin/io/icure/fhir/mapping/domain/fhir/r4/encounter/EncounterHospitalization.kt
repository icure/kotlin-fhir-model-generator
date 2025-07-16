//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.encounter

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details about the admission to a healthcare service
 *
 * Details about the admission to a healthcare service.
 *
 * @param id Unique id for inter-element referencing
 * @param preAdmissionIdentifier Pre-admission identifier
 * @param origin The location/organization from which the patient came before admission
 * @param admitSource From where patient was admitted (physician referral, transfer)
 * @param reAdmission The type of hospital re-admission that has occurred (if any). If the value is
 * absent, then this is not identified as a readmission
 * @param destination Location/organization to which the patient is discharged
 * @param dischargeDisposition Category or kind of location after discharge
 */
@SerialName("EncounterHospitalization")
@Serializable
public data class EncounterHospitalization(
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
   * The type of hospital re-admission that has occurred (if any). If the value is absent, then this
   * is not identified as a readmission
   */
  public val reAdmission: CodeableConcept? = null,
  public val dietPreference: List<CodeableConcept> = emptyList(),
  public val specialCourtesy: List<CodeableConcept> = emptyList(),
  public val specialArrangement: List<CodeableConcept> = emptyList(),
  /**
   * Location/organization to which the patient is discharged
   */
  public val destination: Reference? = null,
  /**
   * Category or kind of location after discharge
   */
  public val dischargeDisposition: CodeableConcept? = null,
) : BackboneElement
