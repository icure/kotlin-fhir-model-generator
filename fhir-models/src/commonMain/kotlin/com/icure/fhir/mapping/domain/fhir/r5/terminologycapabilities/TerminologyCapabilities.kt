//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.terminologycapabilities

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A statement of system capabilities
 *
 * A TerminologyCapabilities resource documents a set of capabilities (behaviors) of a FHIR
 * Terminology Server that may be used as a statement of actual server functionality or a statement of
 * required or desired server implementation.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this terminology capabilities, represented as a URI (globally
 * unique)
 * @param version Business version of the terminology capabilities
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this terminology capabilities (computer friendly)
 * @param title Name for this terminology capabilities (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher/steward (organization or individual)
 * @param description Natural language description of the terminology capabilities
 * @param purpose Why this terminology capabilities is defined
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
 * @param kind instance | capability | requirements
 * @param software Software that is covered by this terminology capability statement
 * @param implementation If this describes a specific instance
 * @param lockedDate Whether lockedDate is supported
 * @param expansion Information about the [ValueSet/$expand](valueset-operation-expand.html)
 * operation
 * @param codeSearch in-compose | in-expansion | in-compose-or-expansion
 * @param validateCode Information about the
 * [ValueSet/$validate-code](valueset-operation-validate-code.html) operation
 * @param translation Information about the
 * [ConceptMap/$translate](conceptmap-operation-translate.html) operation
 * @param closure Information about the [ConceptMap/$closure](conceptmap-operation-closure.html)
 * operation
 */
@SerialName("TerminologyCapabilities")
@Serializable
public data class TerminologyCapabilities(
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
   * Canonical identifier for this terminology capabilities, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the terminology capabilities
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
   * Name for this terminology capabilities (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this terminology capabilities (human friendly)
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
   * Natural language description of the terminology capabilities
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this terminology capabilities is defined
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
  /**
   * instance | capability | requirements
   */
  public val kind: String? = null,
  /**
   * Software that is covered by this terminology capability statement
   */
  public val software: TerminologyCapabilitiesSoftware? = null,
  /**
   * If this describes a specific instance
   */
  public val implementation: TerminologyCapabilitiesImplementation? = null,
  /**
   * Whether lockedDate is supported
   */
  public val lockedDate: Boolean? = null,
  public val codeSystem: List<TerminologyCapabilitiesCodeSystem> = emptyList(),
  /**
   * Information about the [ValueSet/$expand](valueset-operation-expand.html) operation
   */
  public val expansion: TerminologyCapabilitiesExpansion? = null,
  /**
   * in-compose | in-expansion | in-compose-or-expansion
   */
  public val codeSearch: String? = null,
  /**
   * Information about the [ValueSet/$validate-code](valueset-operation-validate-code.html)
   * operation
   */
  public val validateCode: TerminologyCapabilitiesValidateCode? = null,
  /**
   * Information about the [ConceptMap/$translate](conceptmap-operation-translate.html) operation
   */
  public val translation: TerminologyCapabilitiesTranslation? = null,
  /**
   * Information about the [ConceptMap/$closure](conceptmap-operation-closure.html) operation
   */
  public val closure: TerminologyCapabilitiesClosure? = null,
) : DomainResource
