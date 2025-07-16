//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.compartmentdefinition

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
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
 * @param name Name for this compartment definition (computer friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the compartment definition
 * @param purpose Why this compartment definition is defined
 * @param code Patient | Encounter | RelatedPerson | Practitioner | Device
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
   * Name for this compartment definition (computer friendly)
   */
  public val name: String? = null,
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
   * Name of the publisher (organization or individual)
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
   * Patient | Encounter | RelatedPerson | Practitioner | Device
   */
  public val code: String? = null,
  /**
   * Whether the search syntax is supported
   */
  public val search: Boolean? = null,
  public val resource: List<CompartmentDefinitionResource> = emptyList(),
) : DomainResource
