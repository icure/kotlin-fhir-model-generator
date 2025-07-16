//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.careteam

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param member Who is involved
 * @param onBehalfOf Organization of the practitioner
 * @param period Time period of participant
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
  public val role: List<CodeableConcept> = emptyList(),
  /**
   * Who is involved
   */
  public val member: Reference? = null,
  /**
   * Organization of the practitioner
   */
  public val onBehalfOf: Reference? = null,
  /**
   * Time period of participant
   */
  public val period: Period? = null,
) : BackboneElement
