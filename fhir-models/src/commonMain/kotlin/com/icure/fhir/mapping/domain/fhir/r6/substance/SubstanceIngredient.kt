//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.substance

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.ratio.Ratio
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Composition information about the substance
 *
 * A substance can be composed of other substances.
 *
 * @param id Unique id for inter-element referencing
 * @param quantity Optional amount (concentration)
 * @param substanceCodeableConcept A component of the substance
 * @param substanceReference A component of the substance
 */
@SerialName("SubstanceIngredient")
@Serializable
public data class SubstanceIngredient(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Optional amount (concentration)
   */
  public val quantity: Ratio? = null,
  /**
   * A component of the substance
   */
  public val substanceCodeableConcept: CodeableConcept? = null,
  /**
   * A component of the substance
   */
  public val substanceReference: Reference? = null,
) : BackboneElement
