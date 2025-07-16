//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.substanceamount

import io.icure.fhir.mapping.domain.fhir.r4.Element
import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Reference range of possible or expected values
 *
 * Reference range of possible or expected values.
 *
 * @param id Unique id for inter-element referencing
 * @param lowLimit Lower limit possible or expected
 * @param highLimit Upper limit possible or expected
 */
@SerialName("SubstanceAmountReferenceRange")
@Serializable
public data class SubstanceAmountReferenceRange(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Lower limit possible or expected
   */
  public val lowLimit: Quantity? = null,
  /**
   * Upper limit possible or expected
   */
  public val highLimit: Quantity? = null,
) : Element
