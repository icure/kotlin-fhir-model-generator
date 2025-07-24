//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.substancedefinition

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param structure Structural information
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
  public val `property`: List<SubstanceDefinitionProperty> = emptyList(),
  public val molecularWeight: List<SubstanceDefinitionMolecularWeight> = emptyList(),
  /**
   * Structural information
   */
  public val structure: SubstanceDefinitionStructure? = null,
  public val code: List<SubstanceDefinitionString> = emptyList(),
  public val name: List<SubstanceDefinitionName> = emptyList(),
  public val relationship: List<SubstanceDefinitionRelationship> = emptyList(),
  /**
   * Material or taxonomic/anatomical source
   */
  public val sourceMaterial: SubstanceDefinitionSourceMaterial? = null,
) : DomainResource
