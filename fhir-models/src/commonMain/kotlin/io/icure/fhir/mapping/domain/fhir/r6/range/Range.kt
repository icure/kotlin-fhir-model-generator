//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.range

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Set of values bounded by low and high
 *
 * A set of ordered Quantities defined by a low and high limit.
 *
 * @param id Unique id for inter-element referencing
 * @param low Low limit
 * @param high High limit
 */
@SerialName("Range")
@Serializable
public data class Range(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Low limit
   */
  public val low: Quantity? = null,
  /**
   * High limit
   */
  public val high: Quantity? = null,
) : DataType
