//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.operationdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Definition of an operation or a named query
 *
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using
 * the search interaction).
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this operation definition, represented as a URI (globally
 * unique)
 * @param version Business version of the operation definition
 * @param name Name for this operation definition (computer friendly)
 * @param title Name for this operation definition (human friendly)
 * @param status draft | active | retired | unknown
 * @param kind operation | query
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the operation definition
 * @param purpose Why this operation definition is defined
 * @param affectsState Whether content is changed by the operation
 * @param code Name used to invoke the operation
 * @param comment Additional information about use
 * @param base Marks this as a profile of the base
 * @param system Invoke at the system level?
 * @param type Invoke at the type level?
 * @param instance Invoke on an instance?
 * @param inputProfile Validation information for in parameters
 * @param outputProfile Validation information for out parameters
 */
@SerialName("OperationDefinition")
@Serializable
public data class OperationDefinition(
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
   * Canonical identifier for this operation definition, represented as a URI (globally unique)
   */
  public val url: String? = null,
  /**
   * Business version of the operation definition
   */
  public val version: String? = null,
  /**
   * Name for this operation definition (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this operation definition (human friendly)
   */
  public val title: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * operation | query
   */
  public val kind: String? = null,
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
   * Natural language description of the operation definition
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this operation definition is defined
   */
  public val purpose: String? = null,
  /**
   * Whether content is changed by the operation
   */
  public val affectsState: Boolean? = null,
  /**
   * Name used to invoke the operation
   */
  public val code: String? = null,
  /**
   * Additional information about use
   */
  public val comment: String? = null,
  /**
   * Marks this as a profile of the base
   */
  public val base: String? = null,
  public val resource: List<String> = emptyList(),
  /**
   * Invoke at the system level?
   */
  public val system: Boolean? = null,
  /**
   * Invoke at the type level?
   */
  public val type: Boolean? = null,
  /**
   * Invoke on an instance?
   */
  public val instance: Boolean? = null,
  /**
   * Validation information for in parameters
   */
  public val inputProfile: String? = null,
  /**
   * Validation information for out parameters
   */
  public val outputProfile: String? = null,
  public val parameter: List<OperationDefinitionParameter> = emptyList(),
  public val overload: List<OperationDefinitionOverload> = emptyList(),
) : DomainResource
