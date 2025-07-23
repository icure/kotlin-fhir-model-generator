//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.count

import io.icure.fhir.mapping.domain.fhir.FloatString
import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A measured or measurable amount
 *
 * A measured amount (or an amount that can potentially be measured). Note that measured amounts
 * include amounts that are not precisely quantified, including amounts involving arbitrary units and
 * floating currencies.
 *
 * @param id Unique id for inter-element referencing
 * @param value Numerical value (with implicit precision)
 * @param comparator < | <= | >= | > - how to understand the value
 * @param unit Unit representation
 * @param system System that defines coded unit form
 * @param code Coded form of the unit
 */
@SerialName("Count")
@Serializable
public data class Count(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Numerical value (with implicit precision)
   */
  override val `value`: FloatString? = null,
  /**
   * < | <= | >= | > - how to understand the value
   */
  override val comparator: String? = null,
  /**
   * Unit representation
   */
  override val unit: String? = null,
  /**
   * System that defines coded unit form
   */
  override val system: String? = null,
  /**
   * Coded form of the unit
   */
  override val code: String? = null,
) : Quantity
