//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.paymentreconciliation

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Note concerning processing
 *
 * A note that describes or explains the processing in a human readable form.
 *
 * @param id Unique id for inter-element referencing
 * @param type display | print | printoper
 * @param text Note explanatory text
 */
@SerialName("PaymentReconciliationProcessNote")
@Serializable
public data class PaymentReconciliationProcessNote(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * display | print | printoper
   */
  public val type: String? = null,
  /**
   * Note explanatory text
   */
  public val text: String? = null,
) : BackboneElement
