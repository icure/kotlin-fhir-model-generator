//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.triggerdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.Element
import com.icure.fhir.mapping.domain.fhir.r4b.datarequirement.DataRequirement
import com.icure.fhir.mapping.domain.fhir.r4b.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Defines an expected trigger for a module
 *
 * A description of a triggering event. Triggering events can be named events, data events, or
 * periodic, as determined by the type element.
 *
 * @param id Unique id for inter-element referencing
 * @param type named-event | periodic | data-changed | data-added | data-modified | data-removed |
 * data-accessed | data-access-ended
 * @param name Name or URI that identifies the event
 * @param timingTiming Timing of the event
 * @param timingReference Timing of the event
 * @param timingDate Timing of the event
 * @param timingDateTime Timing of the event
 * @param condition Whether the event triggers (boolean expression)
 */
@SerialName("TriggerDefinition")
@Serializable
public data class TriggerDefinition(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * named-event | periodic | data-changed | data-added | data-modified | data-removed |
   * data-accessed | data-access-ended
   */
  public val type: String? = null,
  /**
   * Name or URI that identifies the event
   */
  public val name: String? = null,
  /**
   * Timing of the event
   */
  public val timingTiming: Timing? = null,
  /**
   * Timing of the event
   */
  public val timingReference: Reference? = null,
  /**
   * Timing of the event
   */
  public val timingDate: String? = null,
  /**
   * Timing of the event
   */
  public val timingDateTime: String? = null,
  public val `data`: List<DataRequirement> = emptyList(),
  /**
   * Whether the event triggers (boolean expression)
   */
  public val condition: Expression? = null,
) : Element
