//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.timing

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A timing schedule that specifies an event that may occur multiple times
 *
 * Specifies an event that may occur multiple times. Timing schedules are used to record when things
 * are planned, expected or requested to occur. The most common usage is in dosage instructions for
 * medications. They are also used when planning care of various kinds, and may be used for reporting
 * the schedule to which past regular activities were carried out.
 *
 * @param id Unique id for inter-element referencing
 * @param repeat When the event is to occur
 * @param code BID | TID | QID | AM | PM | QD | QOD | +
 */
@SerialName("Timing")
@Serializable
public data class Timing(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val event: List<String> = emptyList(),
  /**
   * When the event is to occur
   */
  public val repeat: TimingRepeat? = null,
  /**
   * BID | TID | QID | AM | PM | QD | QOD | +
   */
  public val code: CodeableConcept? = null,
) : BackboneElement
