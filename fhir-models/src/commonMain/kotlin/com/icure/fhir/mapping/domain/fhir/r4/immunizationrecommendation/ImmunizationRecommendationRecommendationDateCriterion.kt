//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.immunizationrecommendation

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Dates governing proposed immunization
 *
 * Vaccine date recommendations.  For example, earliest date to administer, latest date to
 * administer, etc.
 *
 * @param id Unique id for inter-element referencing
 * @param code Type of date
 * @param value Recommended date
 */
@SerialName("ImmunizationRecommendationRecommendationDateCriterion")
@Serializable
public data class ImmunizationRecommendationRecommendationDateCriterion(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of date
   */
  public val code: CodeableConcept,
  /**
   * Recommended date
   */
  public val `value`: String? = null,
) : BackboneElement
