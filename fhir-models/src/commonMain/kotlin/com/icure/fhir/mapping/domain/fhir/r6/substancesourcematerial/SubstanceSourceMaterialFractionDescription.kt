//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.substancesourcematerial

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Many complex materials are fractions of parts of plants, animals, or minerals. Fraction elements
 * are often necessary to define both Substances and Specified Group 1 Substances. For substances
 * derived from Plants, fraction information will be captured at the Substance information level ( .
 * Oils, Juices and Exudates). Additional information for Extracts, such as extraction solvent
 * composition, will be captured at the Specified Substance Group 1 information level. For
 * plasma-derived products fraction information will be captured at the Substance and the Specified
 * Substance Group 1 levels
 *
 * Many complex materials are fractions of parts of plants, animals, or minerals. Fraction elements
 * are often necessary to define both Substances and Specified Group 1 Substances. For substances
 * derived from Plants, fraction information will be captured at the Substance information level ( .
 * Oils, Juices and Exudates). Additional information for Extracts, such as extraction solvent
 * composition, will be captured at the Specified Substance Group 1 information level. For
 * plasma-derived products fraction information will be captured at the Substance and the Specified
 * Substance Group 1 levels.
 *
 * @param id Unique id for inter-element referencing
 * @param fraction This element is capturing information about the fraction of a plant part, or
 * human plasma for fractionation
 * @param materialType The specific type of the material constituting the component. For Herbal
 * preparations the particulars of the extracts (liquid/dry) is described in Specified Substance Group
 * 1
 */
@SerialName("SubstanceSourceMaterialFractionDescription")
@Serializable
public data class SubstanceSourceMaterialFractionDescription(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * This element is capturing information about the fraction of a plant part, or human plasma for
   * fractionation
   */
  public val fraction: String? = null,
  /**
   * The specific type of the material constituting the component. For Herbal preparations the
   * particulars of the extracts (liquid/dry) is described in Specified Substance Group 1
   */
  public val materialType: CodeableConcept? = null,
) : BackboneElement
