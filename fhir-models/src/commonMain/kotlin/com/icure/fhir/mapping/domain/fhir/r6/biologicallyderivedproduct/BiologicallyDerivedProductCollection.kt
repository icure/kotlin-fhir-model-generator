//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.biologicallyderivedproduct

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * How this product was collected
 *
 * How this product was collected.
 *
 * @param id Unique id for inter-element referencing
 * @param collector Individual performing collection
 * @param source The patient who underwent the medical procedure to collect the product or the
 * organization that facilitated the collection
 * @param collectedDateTime Time of product collection
 * @param collectedPeriod Time of product collection
 */
@SerialName("BiologicallyDerivedProductCollection")
@Serializable
public data class BiologicallyDerivedProductCollection(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Individual performing collection
   */
  public val collector: Reference? = null,
  /**
   * The patient who underwent the medical procedure to collect the product or the organization that
   * facilitated the collection
   */
  public val source: Reference? = null,
  /**
   * Time of product collection
   */
  public val collectedDateTime: String? = null,
  /**
   * Time of product collection
   */
  public val collectedPeriod: Period? = null,
) : BackboneElement
