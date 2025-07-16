//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.triggerdefinition

import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.datarequirement.DataRequirement
import io.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r5.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r5.timing.Timing
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
 * @param code Coded definition of the event
 * @param subscriptionTopic What event
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
   * Coded definition of the event
   */
  public val code: CodeableConcept? = null,
  /**
   * What event
   */
  public val subscriptionTopic: String? = null,
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
) : DataType
