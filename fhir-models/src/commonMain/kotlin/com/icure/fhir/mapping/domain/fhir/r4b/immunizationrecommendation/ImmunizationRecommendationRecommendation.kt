//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.immunizationrecommendation

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Int
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
 * @param targetDisease Disease to be immunized against
 * @param forecastStatus Vaccine recommendation status
 * @param description Protocol details
 * @param series Name of vaccination series
 * @param doseNumberPositiveInt Recommended dose number within series
 * @param doseNumberString Recommended dose number within series
 * @param seriesDosesPositiveInt Recommended number of doses for immunity
 * @param seriesDosesString Recommended number of doses for immunity
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
  /**
   * Disease to be immunized against
   */
  public val targetDisease: CodeableConcept? = null,
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
  public val doseNumberPositiveInt: Int? = null,
  /**
   * Recommended dose number within series
   */
  public val doseNumberString: String? = null,
  /**
   * Recommended number of doses for immunity
   */
  public val seriesDosesPositiveInt: Int? = null,
  /**
   * Recommended number of doses for immunity
   */
  public val seriesDosesString: String? = null,
  public val supportingImmunization: List<Reference> = emptyList(),
  public val supportingPatientInformation: List<Reference> = emptyList(),
) : BackboneElement
