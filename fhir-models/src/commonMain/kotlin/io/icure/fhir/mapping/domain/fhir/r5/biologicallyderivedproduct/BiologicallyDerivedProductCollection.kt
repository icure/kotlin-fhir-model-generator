//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.biologicallyderivedproduct

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
