//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.immunizationrecommendation

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Vaccine administration recommendations
 *
 * Vaccine administration recommendations.
 *
 * @param id Unique id for inter-element referencing
 * @param forecastStatus Vaccine recommendation status
 * @param description Protocol details
 * @param series Name of vaccination series
 * @param doseNumber Recommended dose number within series
 * @param seriesDoses Recommended number of doses for immunity
 */
@SerialName("ImmunizationRecommendationRecommendation")
@Serializable
public data class ImmunizationRecommendationRecommendation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val vaccineCode: List<CodeableConcept> = emptyList(),
  public val targetDisease: List<CodeableConcept> = emptyList(),
  public val contraindicatedVaccineCode: List<CodeableConcept> = emptyList(),
  /**
   * Vaccine recommendation status
   */
  public val forecastStatus: CodeableConcept,
  public val forecastReason: List<CodeableConcept> = emptyList(),
  public val dateCriterion: List<ImmunizationRecommendationRecommendationDateCriterion> =
      emptyList(),
  /**
   * Protocol details
   */
  public val description: String? = null,
  /**
   * Name of vaccination series
   */
  public val series: String? = null,
  /**
   * Recommended dose number within series
   */
  public val doseNumber: String? = null,
  /**
   * Recommended number of doses for immunity
   */
  public val seriesDoses: String? = null,
  public val supportingImmunization: List<Reference> = emptyList(),
  public val supportingPatientInformation: List<Reference> = emptyList(),
) : BackboneElement
