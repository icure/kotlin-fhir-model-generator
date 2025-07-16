//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.observationdefinition

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Characteristics of quantitative results
 *
 * Characteristics for quantitative results of this observation.
 *
 * @param id Unique id for inter-element referencing
 * @param customaryUnit Customary unit for quantitative results
 * @param unit SI unit for quantitative results
 * @param conversionFactor SI to Customary unit conversion factor
 * @param decimalPrecision Decimal precision of observation quantitative results
 */
@SerialName("ObservationDefinitionQuantitativeDetails")
@Serializable
public data class ObservationDefinitionQuantitativeDetails(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Customary unit for quantitative results
   */
  public val customaryUnit: CodeableConcept? = null,
  /**
   * SI unit for quantitative results
   */
  public val unit: CodeableConcept? = null,
  /**
   * SI to Customary unit conversion factor
   */
  public val conversionFactor: Float? = null,
  /**
   * Decimal precision of observation quantitative results
   */
  public val decimalPrecision: Int? = null,
) : BackboneElement
