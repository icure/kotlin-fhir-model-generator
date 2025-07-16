//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.observation

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Triggering observation(s)
 *
 * Identifies the observation(s) that triggered the performance of this observation.
 *
 * @param id Unique id for inter-element referencing
 * @param observation Triggering observation
 * @param type reflex | repeat | re-run
 * @param reason Reason that the observation was triggered
 */
@SerialName("ObservationTriggeredBy")
@Serializable
public data class ObservationTriggeredBy(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Triggering observation
   */
  public val observation: Reference,
  /**
   * reflex | repeat | re-run
   */
  public val type: String? = null,
  /**
   * Reason that the observation was triggered
   */
  public val reason: String? = null,
) : BackboneElement
