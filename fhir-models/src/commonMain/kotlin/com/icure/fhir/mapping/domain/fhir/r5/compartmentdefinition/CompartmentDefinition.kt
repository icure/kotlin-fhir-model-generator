//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.compartmentdefinition

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Compartment Definition for a resource
 *
 * A compartment definition that defines how resources are accessed on a server.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this compartment definition, represented as a URI (globally
 * unique)
 * @param version Business version of the compartment definition
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this compartment definition (computer friendly)
 * @param title Name for this compartment definition (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher/steward (organization or individual)
 * @param description Natural language description of the compartment definition
 * @param purpose Why this compartment definition is defined
 * @param code Patient | Encounter | RelatedPerson | Practitioner | Device | EpisodeOfCare
 * @param search Whether the search syntax is supported
 */
@SerialName("CompartmentDefinition")
@Serializable
public data class CompartmentDefinition(
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
   * Canonical identifier for this compartment definition, represented as a URI (globally unique)
   */
  public val url: String? = null,
  /**
   * Business version of the compartment definition
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
   * Name for this compartment definition (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this compartment definition (human friendly)
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
   * Natural language description of the compartment definition
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  /**
   * Why this compartment definition is defined
   */
  public val purpose: String? = null,
  /**
   * Patient | Encounter | RelatedPerson | Practitioner | Device | EpisodeOfCare
   */
  public val code: String? = null,
  /**
   * Whether the search syntax is supported
   */
  public val search: Boolean? = null,
  public val resource: List<CompartmentDefinitionResource> = emptyList(),
) : DomainResource
