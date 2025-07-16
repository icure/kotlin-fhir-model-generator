//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.substancespecification

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The detailed description of a substance, typically at a level beyond what is used for prescribing
 *
 * The detailed description of a substance, typically at a level beyond what is used for
 * prescribing.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param identifier Identifier by which this substance is known
 * @param type High level categorization, e.g. polymer or nucleic acid
 * @param status Status of substance within the catalogue e.g. approved
 * @param domain If the substance applies to only human or veterinary use
 * @param description Textual description of the substance
 * @param comment Textual comment about this record of a substance
 * @param referenceInformation General information detailing this substance
 * @param structure Structural information
 * @param nucleicAcid Data items specific to nucleic acids
 * @param polymer Data items specific to polymers
 * @param protein Data items specific to proteins
 * @param sourceMaterial Material or taxonomic/anatomical source for the substance
 */
@SerialName("SubstanceSpecification")
@Serializable
public data class SubstanceSpecification(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifier by which this substance is known
   */
  public val identifier: Identifier? = null,
  /**
   * High level categorization, e.g. polymer or nucleic acid
   */
  public val type: CodeableConcept? = null,
  /**
   * Status of substance within the catalogue e.g. approved
   */
  public val status: CodeableConcept? = null,
  /**
   * If the substance applies to only human or veterinary use
   */
  public val domain: CodeableConcept? = null,
  /**
   * Textual description of the substance
   */
  public val description: String? = null,
  public val source: List<Reference> = emptyList(),
  /**
   * Textual comment about this record of a substance
   */
  public val comment: String? = null,
  public val moiety: List<SubstanceSpecificationMoiety> = emptyList(),
  public val `property`: List<SubstanceSpecificationProperty> = emptyList(),
  /**
   * General information detailing this substance
   */
  public val referenceInformation: Reference? = null,
  /**
   * Structural information
   */
  public val structure: SubstanceSpecificationStructure? = null,
  public val code: List<SubstanceSpecificationString> = emptyList(),
  public val name: List<SubstanceSpecificationName> = emptyList(),
  public val molecularWeight: List<SubstanceSpecificationStructureIsotopeMolecularWeight> =
      emptyList(),
  public val relationship: List<SubstanceSpecificationRelationship> = emptyList(),
  /**
   * Data items specific to nucleic acids
   */
  public val nucleicAcid: Reference? = null,
  /**
   * Data items specific to polymers
   */
  public val polymer: Reference? = null,
  /**
   * Data items specific to proteins
   */
  public val protein: Reference? = null,
  /**
   * Material or taxonomic/anatomical source for the substance
   */
  public val sourceMaterial: Reference? = null,
) : DomainResource
