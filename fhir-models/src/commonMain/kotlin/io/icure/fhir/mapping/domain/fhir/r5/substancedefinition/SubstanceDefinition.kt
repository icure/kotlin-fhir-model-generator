//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.substancedefinition

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param version A business level version identifier of the substance
 * @param status Status of substance within the catalogue e.g. active, retired
 * @param domain If the substance applies to human or veterinary use
 * @param description Textual description of the substance
 * @param referenceInformation General information detailing this substance
 * @param structure Structural information
 * @param nucleicAcid Data items specific to nucleic acids
 * @param polymer Data items specific to polymers
 * @param protein Data items specific to proteins
 * @param sourceMaterial Material or taxonomic/anatomical source
 */
@SerialName("SubstanceDefinition")
@Serializable
public data class SubstanceDefinition(
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
  public val identifier: List<Identifier> = emptyList(),
  /**
   * A business level version identifier of the substance
   */
  public val version: String? = null,
  /**
   * Status of substance within the catalogue e.g. active, retired
   */
  public val status: CodeableConcept? = null,
  public val classification: List<CodeableConcept> = emptyList(),
  /**
   * If the substance applies to human or veterinary use
   */
  public val domain: CodeableConcept? = null,
  public val grade: List<CodeableConcept> = emptyList(),
  /**
   * Textual description of the substance
   */
  public val description: String? = null,
  public val informationSource: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val manufacturer: List<Reference> = emptyList(),
  public val supplier: List<Reference> = emptyList(),
  public val moiety: List<SubstanceDefinitionMoiety> = emptyList(),
  public val characterization: List<SubstanceDefinitionCharacterization> = emptyList(),
  public val `property`: List<SubstanceDefinitionProperty> = emptyList(),
  /**
   * General information detailing this substance
   */
  public val referenceInformation: Reference? = null,
  public val molecularWeight: List<SubstanceDefinitionMolecularWeight> = emptyList(),
  /**
   * Structural information
   */
  public val structure: SubstanceDefinitionStructure? = null,
  public val code: List<SubstanceDefinitionString> = emptyList(),
  public val name: List<SubstanceDefinitionName> = emptyList(),
  public val relationship: List<SubstanceDefinitionRelationship> = emptyList(),
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
   * Material or taxonomic/anatomical source
   */
  public val sourceMaterial: SubstanceDefinitionSourceMaterial? = null,
) : DomainResource
