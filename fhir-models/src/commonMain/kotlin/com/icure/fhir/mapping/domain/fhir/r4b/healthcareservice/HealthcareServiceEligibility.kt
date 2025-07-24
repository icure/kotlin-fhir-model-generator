//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.healthcareservice

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specific eligibility requirements required to use the service
 *
 * Does this service have specific eligibility requirements that need to be met in order to use the
 * service?
 *
 * @param id Unique id for inter-element referencing
 * @param code Coded value for the eligibility
 * @param comment Describes the eligibility conditions for the service
 */
@SerialName("HealthcareServiceEligibility")
@Serializable
public data class HealthcareServiceEligibility(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Coded value for the eligibility
   */
  public val code: CodeableConcept? = null,
  /**
   * Describes the eligibility conditions for the service
   */
  public val comment: String? = null,
) : BackboneElement
