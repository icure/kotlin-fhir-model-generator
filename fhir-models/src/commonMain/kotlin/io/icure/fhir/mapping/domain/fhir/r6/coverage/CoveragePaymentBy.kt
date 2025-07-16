//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.coverage

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Self-pay parties and responsibility
 *
 * Link to the paying party and optionally what specifically they will be responsible to pay.
 *
 * @param id Unique id for inter-element referencing
 * @param party Parties performing self-payment
 * @param responsibility Party's responsibility
 */
@SerialName("CoveragePaymentBy")
@Serializable
public data class CoveragePaymentBy(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Parties performing self-payment
   */
  public val party: Reference,
  /**
   * Party's responsibility
   */
  public val responsibility: String? = null,
) : BackboneElement
