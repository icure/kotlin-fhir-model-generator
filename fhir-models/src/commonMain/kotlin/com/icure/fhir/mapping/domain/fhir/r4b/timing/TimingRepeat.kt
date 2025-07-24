//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.timing

import com.icure.fhir.mapping.domain.fhir.r4b.Element
import com.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.range.Range
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * When the event is to occur
 *
 * A set of rules that describe when the event is scheduled.
 *
 * @param id Unique id for inter-element referencing
 * @param boundsDuration Length/Range of lengths, or (Start and/or end) limits
 * @param boundsRange Length/Range of lengths, or (Start and/or end) limits
 * @param boundsPeriod Length/Range of lengths, or (Start and/or end) limits
 * @param count Number of times to repeat
 * @param countMax Maximum number of times to repeat
 * @param duration How long when it happens
 * @param durationMax How long when it happens (Max)
 * @param durationUnit s | min | h | d | wk | mo | a - unit of time (UCUM)
 * @param frequency Event occurs frequency times per period
 * @param frequencyMax Event occurs up to frequencyMax times per period
 * @param period Event occurs frequency times per period
 * @param periodMax Upper limit of period (3-4 hours)
 * @param periodUnit s | min | h | d | wk | mo | a - unit of time (UCUM)
 * @param offset Minutes from event (before or after)
 */
@SerialName("TimingRepeat")
@Serializable
public data class TimingRepeat(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Length/Range of lengths, or (Start and/or end) limits
   */
  public val boundsDuration: Duration? = null,
  /**
   * Length/Range of lengths, or (Start and/or end) limits
   */
  public val boundsRange: Range? = null,
  /**
   * Length/Range of lengths, or (Start and/or end) limits
   */
  public val boundsPeriod: Period? = null,
  /**
   * Number of times to repeat
   */
  public val count: Int? = null,
  /**
   * Maximum number of times to repeat
   */
  public val countMax: Int? = null,
  /**
   * How long when it happens
   */
  public val duration: Float? = null,
  /**
   * How long when it happens (Max)
   */
  public val durationMax: Float? = null,
  /**
   * s | min | h | d | wk | mo | a - unit of time (UCUM)
   */
  public val durationUnit: String? = null,
  /**
   * Event occurs frequency times per period
   */
  public val frequency: Int? = null,
  /**
   * Event occurs up to frequencyMax times per period
   */
  public val frequencyMax: Int? = null,
  /**
   * Event occurs frequency times per period
   */
  public val period: Float? = null,
  /**
   * Upper limit of period (3-4 hours)
   */
  public val periodMax: Float? = null,
  /**
   * s | min | h | d | wk | mo | a - unit of time (UCUM)
   */
  public val periodUnit: String? = null,
  public val dayOfWeek: List<String> = emptyList(),
  public val timeOfDay: List<String> = emptyList(),
  @JsonNames("when")
  public val when_fhir: List<String> = emptyList(),
  /**
   * Minutes from event (before or after)
   */
  public val offset: Int? = null,
) : Element
