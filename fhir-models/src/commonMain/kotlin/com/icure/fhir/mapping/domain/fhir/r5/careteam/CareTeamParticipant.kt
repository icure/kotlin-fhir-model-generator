//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.careteam

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r5.timing.Timing
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Members of the team
 *
 * Identifies all people and organizations who are expected to be involved in the care team.
 *
 * @param id Unique id for inter-element referencing
 * @param role Type of involvement
 * @param member Who is involved
 * @param onBehalfOf Organization of the practitioner
 * @param coveragePeriod When the member is generally available within this care team
 * @param coverageTiming When the member is generally available within this care team
 */
@SerialName("CareTeamParticipant")
@Serializable
public data class CareTeamParticipant(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of involvement
   */
  public val role: CodeableConcept? = null,
  /**
   * Who is involved
   */
  public val member: Reference? = null,
  /**
   * Organization of the practitioner
   */
  public val onBehalfOf: Reference? = null,
  /**
   * When the member is generally available within this care team
   */
  public val coveragePeriod: Period? = null,
  /**
   * When the member is generally available within this care team
   */
  public val coverageTiming: Timing? = null,
) : BackboneElement
