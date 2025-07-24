//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.medication

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.ratio.Ratio
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Active or inactive ingredient
 *
 * Identifies a particular constituent of interest in the product.
 *
 * @param id Unique id for inter-element referencing
 * @param itemCodeableConcept The actual ingredient or content
 * @param itemReference The actual ingredient or content
 * @param isActive Active ingredient indicator
 * @param strength Quantity of ingredient present
 */
@SerialName("MedicationIngredient")
@Serializable
public data class MedicationIngredient(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The actual ingredient or content
   */
  public val itemCodeableConcept: CodeableConcept? = null,
  /**
   * The actual ingredient or content
   */
  public val itemReference: Reference? = null,
  /**
   * Active ingredient indicator
   */
  public val isActive: Boolean? = null,
  /**
   * Quantity of ingredient present
   */
  public val strength: Ratio? = null,
) : BackboneElement
