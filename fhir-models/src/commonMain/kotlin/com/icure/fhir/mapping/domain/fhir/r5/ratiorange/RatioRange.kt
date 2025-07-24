//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.ratiorange

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Range of ratio values
 *
 * A range of ratios expressed as a low and high numerator and a denominator.
 *
 * @param id Unique id for inter-element referencing
 * @param lowNumerator Low Numerator limit
 * @param highNumerator High Numerator limit
 * @param denominator Denominator value
 */
@SerialName("RatioRange")
@Serializable
public data class RatioRange(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Low Numerator limit
   */
  public val lowNumerator: Quantity? = null,
  /**
   * High Numerator limit
   */
  public val highNumerator: Quantity? = null,
  /**
   * Denominator value
   */
  public val denominator: Quantity? = null,
) : DataType
