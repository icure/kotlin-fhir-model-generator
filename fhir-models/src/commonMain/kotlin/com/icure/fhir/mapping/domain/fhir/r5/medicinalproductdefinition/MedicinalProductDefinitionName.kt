//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.medicinalproductdefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
 * @param type Type of product name, such as rINN, BAN, Proprietary, Non-Proprietary
 */
@SerialName("MedicinalProductDefinitionName")
@Serializable
public data class MedicinalProductDefinitionName(
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
  /**
   * Type of product name, such as rINN, BAN, Proprietary, Non-Proprietary
   */
  public val type: CodeableConcept? = null,
  public val part: List<MedicinalProductDefinitionNamePart> = emptyList(),
  public val usage: List<MedicinalProductDefinitionNameUsage> = emptyList(),
) : BackboneElement
