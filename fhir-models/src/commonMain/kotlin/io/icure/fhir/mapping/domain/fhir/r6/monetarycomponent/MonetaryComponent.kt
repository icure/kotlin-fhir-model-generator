//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.monetarycomponent

import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.money.Money
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Types and value of financial information that apply to line item(s)
 *
 * Financial line items use this datatype to commonly categorize the value, and other factors that
 * may effect how the value should be interpreted.
 *
 * @param id Unique id for inter-element referencing
 * @param type base | surcharge | deduction | discount | tax | informational
 * @param code Codes may be used to differentiate between kinds of taxes, surcharges, discounts etc.
 * @param factor Factor used for calculating this component
 * @param amount Explicit value amount to be used
 */
@SerialName("MonetaryComponent")
@Serializable
public data class MonetaryComponent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * base | surcharge | deduction | discount | tax | informational
   */
  public val type: String? = null,
  /**
   * Codes may be used to differentiate between kinds of taxes, surcharges, discounts etc.
   */
  public val code: CodeableConcept? = null,
  /**
   * Factor used for calculating this component
   */
  public val factor: Float? = null,
  /**
   * Explicit value amount to be used
   */
  public val amount: Money? = null,
) : DataType
