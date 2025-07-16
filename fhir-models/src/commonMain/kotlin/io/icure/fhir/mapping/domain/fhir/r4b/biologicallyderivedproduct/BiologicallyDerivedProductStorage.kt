//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.biologicallyderivedproduct

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Product storage
 *
 * Product storage.
 *
 * @param id Unique id for inter-element referencing
 * @param description Description of storage
 * @param temperature Storage temperature
 * @param scale farenheit | celsius | kelvin
 * @param duration Storage timeperiod
 */
@SerialName("BiologicallyDerivedProductStorage")
@Serializable
public data class BiologicallyDerivedProductStorage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of storage
   */
  public val description: String? = null,
  /**
   * Storage temperature
   */
  public val temperature: Float? = null,
  /**
   * farenheit | celsius | kelvin
   */
  public val scale: String? = null,
  /**
   * Storage timeperiod
   */
  public val duration: Period? = null,
) : BackboneElement
