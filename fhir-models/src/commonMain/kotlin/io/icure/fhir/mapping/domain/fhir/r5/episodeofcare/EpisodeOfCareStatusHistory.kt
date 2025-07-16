//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.episodeofcare

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Past list of status codes (the current status may be included to cover the start date of the
 * status)
 *
 * The history of statuses that the EpisodeOfCare has been through (without requiring processing the
 * history of the resource).
 *
 * @param id Unique id for inter-element referencing
 * @param status planned | waitlist | active | onhold | finished | cancelled | entered-in-error
 * @param period Duration the EpisodeOfCare was in the specified status
 */
@SerialName("EpisodeOfCareStatusHistory")
@Serializable
public data class EpisodeOfCareStatusHistory(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * planned | waitlist | active | onhold | finished | cancelled | entered-in-error
   */
  public val status: String? = null,
  /**
   * Duration the EpisodeOfCare was in the specified status
   */
  public val period: Period,
) : BackboneElement
