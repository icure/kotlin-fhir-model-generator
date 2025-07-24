//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6

import com.icure.fhir.mapping.domain.fhir.FloatString
import com.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import kotlin.String
import kotlinx.serialization.Serializable

/**
 * A measured or measurable amount
 *
 * A measured amount (or an amount that can potentially be measured). Note that measured amounts
 * include amounts that are not precisely quantified, including amounts involving arbitrary units and
 * floating currencies.
 */
@Serializable(with = QuantitySerializer::class)
public interface Quantity : DataType {
  /**
   * Coded form of the unit
   */
  public val code: String?

  /**
   * < | <= | >= | > | ad - how to understand the value
   */
  public val comparator: String?

  /**
   * System that defines coded unit form
   */
  public val system: String?

  /**
   * Unit representation
   */
  public val unit: String?

  /**
   * Numerical value (with implicit precision)
   */
  public val `value`: FloatString?
}
