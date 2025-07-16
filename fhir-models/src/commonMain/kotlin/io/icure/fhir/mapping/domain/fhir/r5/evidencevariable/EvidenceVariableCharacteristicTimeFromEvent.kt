//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.evidencevariable

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.range.Range
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Timing in which the characteristic is determined
 *
 * Timing in which the characteristic is determined.
 *
 * @param id Unique id for inter-element referencing
 * @param description Human readable description
 * @param eventCodeableConcept The event used as a base point (reference point) in time
 * @param eventReference The event used as a base point (reference point) in time
 * @param eventDateTime The event used as a base point (reference point) in time
 * @param eventId The event used as a base point (reference point) in time
 * @param quantity Used to express the observation at a defined amount of time before or after the
 * event
 * @param range Used to express the observation within a period before and/or after the event
 */
@SerialName("EvidenceVariableCharacteristicTimeFromEvent")
@Serializable
public data class EvidenceVariableCharacteristicTimeFromEvent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Human readable description
   */
  public val description: String? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * The event used as a base point (reference point) in time
   */
  public val eventCodeableConcept: CodeableConcept? = null,
  /**
   * The event used as a base point (reference point) in time
   */
  public val eventReference: Reference? = null,
  /**
   * The event used as a base point (reference point) in time
   */
  public val eventDateTime: String? = null,
  /**
   * The event used as a base point (reference point) in time
   */
  public val eventId: String? = null,
  /**
   * Used to express the observation at a defined amount of time before or after the event
   */
  public val quantity: Quantity? = null,
  /**
   * Used to express the observation within a period before and/or after the event
   */
  public val range: Range? = null,
) : BackboneElement
