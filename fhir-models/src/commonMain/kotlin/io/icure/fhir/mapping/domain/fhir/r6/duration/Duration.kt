//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.duration

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Float
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
 * @param comparator < | <= | >= | > | ad - how to understand the value
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
  override val `value`: Float? = null,
  /**
   * < | <= | >= | > | ad - how to understand the value
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
