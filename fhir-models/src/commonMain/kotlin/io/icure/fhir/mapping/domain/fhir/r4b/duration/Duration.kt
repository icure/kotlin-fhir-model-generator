//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.duration

import io.icure.fhir.mapping.domain.fhir.FloatString
import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A length of time
 *
 * A length of time.
 *
 * @param id Unique id for inter-element referencing
 * @param value Numerical value (with implicit precision)
 * @param comparator < | <= | >= | > - how to understand the value
 * @param unit Unit representation
 * @param system System that defines coded unit form
 * @param code Coded form of the unit
 */
@SerialName("Duration")
@Serializable
public data class Duration(
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
