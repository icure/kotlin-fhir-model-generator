//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substancespecification

import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio
 *
 * Applicable for single substances that contain a radionuclide or a non-natural isotopic ratio.
 *
 * @param id Unique id for inter-element referencing
 * @param identifier Substance identifier for each non-natural or radioisotope
 * @param name Substance name for each non-natural or radioisotope
 * @param substitution The type of isotopic substitution present in a single substance
 * @param halfLife Half life - for a non-natural nuclide
 * @param molecularWeight The molecular weight or weight range (for proteins, polymers or nucleic
 * acids)
 */
@SerialName("SubstanceSpecificationStructureIsotope")
@Serializable
public data class SubstanceSpecificationStructureIsotope(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Substance identifier for each non-natural or radioisotope
   */
  public val identifier: Identifier? = null,
  /**
   * Substance name for each non-natural or radioisotope
   */
  public val name: CodeableConcept? = null,
  /**
   * The type of isotopic substitution present in a single substance
   */
  public val substitution: CodeableConcept? = null,
  /**
   * Half life - for a non-natural nuclide
   */
  public val halfLife: Quantity? = null,
  /**
   * The molecular weight or weight range (for proteins, polymers or nucleic acids)
   */
  public val molecularWeight: SubstanceSpecificationStructureIsotopeMolecularWeight? = null,
) : BackboneElement
