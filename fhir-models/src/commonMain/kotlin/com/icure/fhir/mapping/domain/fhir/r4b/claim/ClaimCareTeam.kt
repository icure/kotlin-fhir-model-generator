//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.claim

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Members of the care team
 *
 * The members of the team who provided the products and services.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Order of care team
 * @param provider Practitioner or organization
 * @param responsible Indicator of the lead practitioner
 * @param role Function within the team
 * @param qualification Practitioner credential or specialization
 */
@SerialName("ClaimCareTeam")
@Serializable
public data class ClaimCareTeam(
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
   * Practitioner credential or specialization
   */
  public val qualification: CodeableConcept? = null,
) : BackboneElement
