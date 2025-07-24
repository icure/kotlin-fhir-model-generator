//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.explanationofbenefit

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Care Team members
 *
 * The members of the team who provided the products and services.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Order of care team
 * @param provider Practitioner or organization
 * @param responsible Indicator of the lead practitioner
 * @param role Function within the team
 * @param specialty Practitioner or provider specialization
 */
@SerialName("ExplanationOfBenefitCareTeam")
@Serializable
public data class ExplanationOfBenefitCareTeam(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Order of care team
   */
  public val sequence: Int? = null,
  /**
   * Practitioner or organization
   */
  public val provider: Reference,
  /**
   * Indicator of the lead practitioner
   */
  public val responsible: Boolean? = null,
  /**
   * Function within the team
   */
  public val role: CodeableConcept? = null,
  /**
   * Practitioner or provider specialization
   */
  public val specialty: CodeableConcept? = null,
) : BackboneElement
