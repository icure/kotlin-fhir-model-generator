//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.substancedefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
