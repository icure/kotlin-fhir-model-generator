//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.relativetime

import io.icure.fhir.mapping.domain.fhir.r6.backbonetype.BackboneType
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.range.Range
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A point in time or an interval of time relative to an event
 *
 * RelativeTime is used to express a point in time or an interval of time relative to an event
 * defined in data types other than dateTime.
 *
 * @param id Unique id for inter-element referencing
 * @param contextReference The specific event occurrence or resource context used as a base point
 * (reference point) in time
 * @param contextDefinition The type of event used as a base point
 * @param contextPath Path to the element defining the point in time
 * @param contextCode Coded representation of the event used as a base point (reference point) in
 * time
 * @param offsetDuration An offset or offset range before (negative values) or after (positive
 * values) the event
 * @param offsetRange An offset or offset range before (negative values) or after (positive values)
 * the event
 * @param text Free-text description
 */
@SerialName("RelativeTime")
@Serializable
public data class RelativeTime(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The specific event occurrence or resource context used as a base point (reference point) in
   * time
   */
  public val contextReference: Reference? = null,
  /**
   * The type of event used as a base point
   */
  public val contextDefinition: String? = null,
  /**
   * Path to the element defining the point in time
   */
  public val contextPath: String? = null,
  /**
   * Coded representation of the event used as a base point (reference point) in time
   */
  public val contextCode: CodeableConcept? = null,
  /**
   * An offset or offset range before (negative values) or after (positive values) the event
   */
  public val offsetDuration: Duration? = null,
  /**
   * An offset or offset range before (negative values) or after (positive values) the event
   */
  public val offsetRange: Range? = null,
  /**
   * Free-text description
   */
  public val text: String? = null,
) : BackboneType
