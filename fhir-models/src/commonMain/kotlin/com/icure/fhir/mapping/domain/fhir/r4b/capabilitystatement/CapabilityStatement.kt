//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.capabilitystatement

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
 * A statement of system capabilities
 *
 * A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server for a
 * particular version of FHIR that may be used as a statement of actual server functionality or a
 * statement of required or desired server implementation.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this capability statement, represented as a URI (globally
 * unique)
 * @param version Business version of the capability statement
 * @param name Name for this capability statement (computer friendly)
 * @param title Name for this capability statement (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the capability statement
 * @param purpose Why this capability statement is defined
 * @param copyright Use and/or publishing restrictions
 * @param kind instance | capability | requirements
 * @param software Software that is covered by this capability statement
 * @param implementation If this describes a specific instance
 * @param fhirVersion FHIR Version the system supports
 */
@SerialName("CapabilityStatement")
@Serializable
public data class CapabilityStatement(
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
   * Canonical identifier for this capability statement, represented as a URI (globally unique)
   */
  public val url: String? = null,
  /**
   * Business version of the capability statement
   */
  public val version: String? = null,
  /**
   * Name for this capability statement (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this capability statement (human friendly)
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
   * Name of the publisher (organization or individual)
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  /**
   * Natural language description of the capability statement
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this capability statement is defined
   */
  public val purpose: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * instance | capability | requirements
   */
  public val kind: String? = null,
  public val instantiates: List<String> = emptyList(),
  public val imports: List<String> = emptyList(),
  /**
   * Software that is covered by this capability statement
   */
  public val software: CapabilityStatementSoftware? = null,
  /**
   * If this describes a specific instance
   */
  public val implementation: CapabilityStatementImplementation? = null,
  /**
   * FHIR Version the system supports
   */
  public val fhirVersion: String? = null,
  public val format: List<String> = emptyList(),
  public val patchFormat: List<String> = emptyList(),
  public val implementationGuide: List<String> = emptyList(),
  public val rest: List<CapabilityStatementRest> = emptyList(),
  public val messaging: List<CapabilityStatementMessaging> = emptyList(),
  public val document: List<CapabilityStatementDocument> = emptyList(),
) : DomainResource
