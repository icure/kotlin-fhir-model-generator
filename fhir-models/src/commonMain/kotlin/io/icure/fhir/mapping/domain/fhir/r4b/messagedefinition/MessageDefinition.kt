//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.messagedefinition

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A resource that defines a type of message that can be exchanged between systems
 *
 * Defines the characteristics of a message that can be shared between systems, including the type
 * of event that initiates the message, the content to be transmitted and what response(s), if any, are
 * permitted.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Business Identifier for a given MessageDefinition
 * @param version Business version of the message definition
 * @param name Name for this message definition (computer friendly)
 * @param title Name for this message definition (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the message definition
 * @param purpose Why this message definition is defined
 * @param copyright Use and/or publishing restrictions
 * @param base Definition this one is based on
 * @param eventCoding Event code  or link to the EventDefinition
 * @param eventUri Event code  or link to the EventDefinition
 * @param category consequence | currency | notification
 * @param responseRequired always | on-error | never | on-success
 */
@SerialName("MessageDefinition")
@Serializable
public data class MessageDefinition(
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
   * Business Identifier for a given MessageDefinition
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the message definition
   */
  public val version: String? = null,
  /**
   * Name for this message definition (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this message definition (human friendly)
   */
  public val title: String? = null,
  public val replaces: List<String> = emptyList(),
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
   * Natural language description of the message definition
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this message definition is defined
   */
  public val purpose: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * Definition this one is based on
   */
  public val base: String? = null,
  public val parent: List<String> = emptyList(),
  /**
   * Event code  or link to the EventDefinition
   */
  public val eventCoding: Coding? = null,
  /**
   * Event code  or link to the EventDefinition
   */
  public val eventUri: String? = null,
  /**
   * consequence | currency | notification
   */
  public val category: String? = null,
  public val focus: List<MessageDefinitionFocus> = emptyList(),
  /**
   * always | on-error | never | on-success
   */
  public val responseRequired: String? = null,
  public val allowedResponse: List<MessageDefinitionAllowedResponse> = emptyList(),
  public val graph: List<String> = emptyList(),
) : DomainResource
