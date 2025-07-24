//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.library

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r6.datarequirement.DataRequirement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.parameterdefinition.ParameterDefinition
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r6.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r6.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a library of quality improvement components
 *
 * The Library resource is a general-purpose container for knowledge asset definitions. It can be
 * used to describe and expose existing knowledge assets such as logic libraries and information model
 * descriptions, as well as to describe a collection of knowledge assets.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this library, represented as a URI (globally unique)
 * @param version Business version of the library
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this library (computer friendly)
 * @param title Name for this library (human friendly)
 * @param subtitle Subordinate title of the library
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param type logic-library | model-definition | asset-collection | module-definition
 * @param subjectCodeableConcept Type of individual the library content is focused on
 * @param subjectReference Type of individual the library content is focused on
 * @param date Date last changed
 * @param publisher Name of the publisher/steward (organization or individual)
 * @param description Natural language description of the library
 * @param purpose Why this library is defined
 * @param usage Describes the clinical usage of the library
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
 * @param approvalDate When the library was approved by publisher
 * @param lastReviewDate When the library was last reviewed by the publisher
 * @param effectivePeriod When the library is expected to be used
 */
@SerialName("Library")
@Serializable
public data class Library(
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
   * Canonical identifier for this library, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the library
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
   * Name for this library (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this library (human friendly)
   */
  public val title: String? = null,
  /**
   * Subordinate title of the library
   */
  public val subtitle: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * For testing purposes, not real usage
   */
  public val experimental: Boolean? = null,
  /**
   * logic-library | model-definition | asset-collection | module-definition
   */
  public val type: CodeableConcept,
  /**
   * Type of individual the library content is focused on
   */
  public val subjectCodeableConcept: CodeableConcept? = null,
  /**
   * Type of individual the library content is focused on
   */
  public val subjectReference: Reference? = null,
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
   * Natural language description of the library
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this library is defined
   */
  public val purpose: String? = null,
  /**
   * Describes the clinical usage of the library
   */
  public val usage: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * Copyright holder and year(s)
   */
  public val copyrightLabel: String? = null,
  /**
   * When the library was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the library was last reviewed by the publisher
   */
  public val lastReviewDate: String? = null,
  /**
   * When the library is expected to be used
   */
  public val effectivePeriod: Period? = null,
  public val topic: List<CodeableConcept> = emptyList(),
  public val author: List<ContactDetail> = emptyList(),
  public val editor: List<ContactDetail> = emptyList(),
  public val reviewer: List<ContactDetail> = emptyList(),
  public val endorser: List<ContactDetail> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  public val parameter: List<ParameterDefinition> = emptyList(),
  public val dataRequirement: List<DataRequirement> = emptyList(),
  public val content: List<Attachment> = emptyList(),
) : DomainResource
