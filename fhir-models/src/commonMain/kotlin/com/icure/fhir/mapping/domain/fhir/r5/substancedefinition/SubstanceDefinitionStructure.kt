//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.substancedefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param molecularFormula An expression which states the number and type of atoms present in a
 * molecule of a substance
 * @param molecularFormulaByMoiety Specified per moiety according to the Hill system
 * @param molecularWeight The molecular weight or weight range
 */
@SerialName("SubstanceDefinitionStructure")
@Serializable
public data class SubstanceDefinitionStructure(
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
   * An expression which states the number and type of atoms present in a molecule of a substance
   */
  public val molecularFormula: String? = null,
  /**
   * Specified per moiety according to the Hill system
   */
  public val molecularFormulaByMoiety: String? = null,
  /**
   * The molecular weight or weight range
   */
  public val molecularWeight: SubstanceDefinitionMolecularWeight? = null,
  public val technique: List<CodeableConcept> = emptyList(),
  public val sourceDocument: List<Reference> = emptyList(),
  public val representation: List<SubstanceDefinitionStructureRepresentation> = emptyList(),
) : BackboneElement
