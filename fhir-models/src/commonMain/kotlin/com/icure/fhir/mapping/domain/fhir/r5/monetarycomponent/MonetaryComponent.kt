//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.monetarycomponent

import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.money.Money
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Availability data for an {item}
 *
 * Availability data for an {item}.
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
