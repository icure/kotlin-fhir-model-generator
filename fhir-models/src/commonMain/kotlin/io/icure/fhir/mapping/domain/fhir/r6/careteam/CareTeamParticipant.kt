//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.careteam

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r6.timing.Timing
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
