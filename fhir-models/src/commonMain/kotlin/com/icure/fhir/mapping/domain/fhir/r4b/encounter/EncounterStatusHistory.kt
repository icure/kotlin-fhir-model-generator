//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.encounter

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * List of past encounter statuses
 *
 * The status history permits the encounter resource to contain the status history without needing
 * to read through the historical versions of the resource, or even have the server store them.
 *
 * @param id Unique id for inter-element referencing
 * @param status planned | arrived | triaged | in-progress | onleave | finished | cancelled +
 * @param period The time that the episode was in the specified status
 */
@SerialName("EncounterStatusHistory")
@Serializable
public data class EncounterStatusHistory(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * planned | arrived | triaged | in-progress | onleave | finished | cancelled +
   */
  public val status: String? = null,
  /**
   * The time that the episode was in the specified status
   */
  public val period: Period,
) : BackboneElement
