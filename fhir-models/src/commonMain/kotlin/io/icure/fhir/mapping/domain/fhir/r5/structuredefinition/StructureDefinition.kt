//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.structuredefinition

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r5.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Structural Definition
 *
 * A definition of a FHIR structure. This resource is used to describe the underlying resources,
 * data types defined in FHIR, and also for describing extensions and constraints on resources and data
 * types.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this structure definition, represented as a URI (globally
 * unique)
 * @param version Business version of the structure definition
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this structure definition (computer friendly)
 * @param title Name for this structure definition (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher/steward (organization or individual)
 * @param description Natural language description of the structure definition
 * @param purpose Why this structure definition is defined
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
 * @param fhirVersion FHIR Version this StructureDefinition targets
 * @param kind primitive-type | complex-type | resource | logical
 * @param abstract Whether the structure is abstract
 * @param type Type defined or constrained by this structure
 * @param baseDefinition Definition that this type is constrained/specialized from
 * @param derivation specialization | constraint - How relates to base definition
 * @param snapshot Snapshot view of the structure
 * @param differential Differential view of the structure
 */
@SerialName("StructureDefinition")
@Serializable
public data class StructureDefinition(
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
   * Canonical identifier for this structure definition, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the structure definition
   */
  public val version: String? = null,
  /**
   * How to compare versions
   */
  public val versionAlgorithmString: String? = null,
  /**
   * How to compare versions
   */
  public val versionAlgorithmCoding: Coding? = null,
  /**
   * Name for this structure definition (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this structure definition (human friendly)
   */
  public val title: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * For testing purposes, not real usage
   */
  public val experimental: Boolean? = null,
  /**
   * Date last changed
   */
  public val date: String? = null,
  /**
   * Name of the publisher/steward (organization or individual)
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  /**
   * Natural language description of the structure definition
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this structure definition is defined
   */
  public val purpose: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * Copyright holder and year(s)
   */
  public val copyrightLabel: String? = null,
  public val keyword: List<Coding> = emptyList(),
  /**
   * FHIR Version this StructureDefinition targets
   */
  public val fhirVersion: String? = null,
  public val mapping: List<StructureDefinitionMapping> = emptyList(),
  /**
   * primitive-type | complex-type | resource | logical
   */
  public val kind: String? = null,
  /**
   * Whether the structure is abstract
   */
  public val `abstract`: Boolean? = null,
  public val context: List<StructureDefinitionContext> = emptyList(),
  public val contextInvariant: List<String> = emptyList(),
  /**
   * Type defined or constrained by this structure
   */
  public val type: String? = null,
  /**
   * Definition that this type is constrained/specialized from
   */
  public val baseDefinition: String? = null,
  /**
   * specialization | constraint - How relates to base definition
   */
  public val derivation: String? = null,
  /**
   * Snapshot view of the structure
   */
  public val snapshot: StructureDefinitionSnapshot? = null,
  /**
   * Differential view of the structure
   */
  public val differential: StructureDefinitionDifferential? = null,
) : DomainResource
