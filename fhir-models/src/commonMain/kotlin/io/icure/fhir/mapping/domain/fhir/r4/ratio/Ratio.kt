//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.ratio

import io.icure.fhir.mapping.domain.fhir.r4.Element
import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A ratio of two Quantity values - a numerator and a denominator
 *
 * A relationship of two Quantity values - expressed as a numerator and a denominator.
 *
 * @param id Unique id for inter-element referencing
 * @param numerator Numerator value
 * @param denominator Denominator value
 */
@SerialName("Ratio")
@Serializable
public data class Ratio(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Numerator value
   */
  public val numerator: Quantity? = null,
  /**
   * Denominator value
   */
  public val denominator: Quantity? = null,
) : Element
