//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.evidencevariable

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.range.Range
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Observation time from study start
 *
 * Indicates duration, period, or point of observation from the participant's study entry.
 *
 * @param id Unique id for inter-element referencing
 * @param description Human readable description
 * @param quantity Used to express the observation at a defined amount of time after the study start
 * @param range Used to express the observation within a period after the study start
 */
@SerialName("EvidenceVariableCharacteristicTimeFromStart")
@Serializable
public data class EvidenceVariableCharacteristicTimeFromStart(
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
  /**
   * Used to express the observation at a defined amount of time after the study start
   */
  public val quantity: Quantity? = null,
  /**
   * Used to express the observation within a period after the study start
   */
  public val range: Range? = null,
  public val note: List<Annotation> = emptyList(),
) : BackboneElement
