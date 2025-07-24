//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substancespecification

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Structural information
 *
 * Structural information.
 *
 * @param id Unique id for inter-element referencing
 * @param stereochemistry Stereochemistry type
 * @param opticalActivity Optical activity type
 * @param molecularFormula Molecular formula
 * @param molecularFormulaByMoiety Specified per moiety according to the Hill system, i.e. first C,
 * then H, then alphabetical, each moiety separated by a dot
 * @param molecularWeight The molecular weight or weight range (for proteins, polymers or nucleic
 * acids)
 */
@SerialName("SubstanceSpecificationStructure")
@Serializable
public data class SubstanceSpecificationStructure(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Stereochemistry type
   */
  public val stereochemistry: CodeableConcept? = null,
  /**
   * Optical activity type
   */
  public val opticalActivity: CodeableConcept? = null,
  /**
   * Molecular formula
   */
  public val molecularFormula: String? = null,
  /**
   * Specified per moiety according to the Hill system, i.e. first C, then H, then alphabetical,
   * each moiety separated by a dot
   */
  public val molecularFormulaByMoiety: String? = null,
  public val isotope: List<SubstanceSpecificationStructureIsotope> = emptyList(),
  /**
   * The molecular weight or weight range (for proteins, polymers or nucleic acids)
   */
  public val molecularWeight: SubstanceSpecificationStructureIsotopeMolecularWeight? = null,
  public val source: List<Reference> = emptyList(),
  public val representation: List<SubstanceSpecificationStructureRepresentation> = emptyList(),
) : BackboneElement
