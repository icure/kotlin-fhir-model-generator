//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproduct

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The product's name, including full name and possibly coded parts
 *
 * The product's name, including full name and possibly coded parts.
 *
 * @param id Unique id for inter-element referencing
 * @param productName The full product name
 */
@SerialName("MedicinalProductName")
@Serializable
public data class MedicinalProductName(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The full product name
   */
  public val productName: String? = null,
  public val namePart: List<MedicinalProductNameNamePart> = emptyList(),
  public val countryLanguage: List<MedicinalProductNameCountryLanguage> = emptyList(),
) : BackboneElement
