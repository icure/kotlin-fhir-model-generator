//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.structuremap

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A Map of relationships between 2 structures that can be used to transform data
 *
 * A Map of relationships between 2 structures that can be used to transform data.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this structure map, represented as a URI (globally unique)
 * @param version Business version of the structure map
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this structure map (computer friendly)
 * @param title Name for this structure map (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher/steward (organization or individual)
 * @param description Natural language description of the structure map
 * @param purpose Why this structure map is defined
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
 */
@SerialName("StructureMap")
@Serializable
public data class StructureMap(
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
   * Canonical identifier for this structure map, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the structure map
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
   * Name for this structure map (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this structure map (human friendly)
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
   * Natural language description of the structure map
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this structure map is defined
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
  public val structure: List<StructureMapStructure> = emptyList(),
  @SerialName("import")
  public val import_fhir: List<String> = emptyList(),
  public val `const`: List<StructureMapConst> = emptyList(),
  public val group: List<StructureMapGroup> = emptyList(),
) : DomainResource
