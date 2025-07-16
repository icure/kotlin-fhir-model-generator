//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.money

import io.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An amount of economic utility in some recognized currency
 *
 * An amount of economic utility in some recognized currency.
 *
 * @param id Unique id for inter-element referencing
 * @param value Numerical value (with implicit precision)
 * @param currency ISO 4217 Currency Code
 */
@SerialName("Money")
@Serializable
public data class Money(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Numerical value (with implicit precision)
   */
  public val `value`: Float? = null,
  /**
   * ISO 4217 Currency Code
   */
  public val currency: String? = null,
) : DataType
