//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.codesystem

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r6.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.relatedartifact.RelatedArtifact
import io.icure.fhir.mapping.domain.fhir.r6.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Declares the existence of and describes a code system or code system supplement
 *
 * The CodeSystem resource is used to declare the existence of and describe a code system or code
 * system supplement and its key properties, and optionally define a part or all of its content.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this code system, represented as a URI (globally unique)
 * (Coding.system)
 * @param version Business version of the code system (Coding.version)
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this code system (computer friendly)
 * @param title Name for this code system (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher/steward (organization or individual)
 * @param description Natural language description of the code system
 * @param purpose Why this code system is defined
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
 * @param approvalDate When the CodeSystem was approved by publisher
 * @param lastReviewDate When the CodeSystem was last reviewed by the publisher
 * @param effectivePeriod When the CodeSystem is expected to be used
 * @param caseSensitive If code comparison is case sensitive
 * @param valueSet Canonical reference to the value set with entire code system
 * @param hierarchyMeaning grouped-by | is-a | part-of | classified-with
 * @param compositional If code system defines a compositional grammar
 * @param versionNeeded If definitions are not stable
 * @param content not-present | example | fragment | complete | supplement
 * @param supplements Canonical URL of Code System this adds designations and properties to
 * @param count Total concepts in the code system
 */
@SerialName("CodeSystem")
@Serializable
public data class CodeSystem(
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
   * Canonical identifier for this code system, represented as a URI (globally unique)
   * (Coding.system)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the code system (Coding.version)
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
   * Name for this code system (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this code system (human friendly)
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
   * Natural language description of the code system
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this code system is defined
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
   * When the CodeSystem was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the CodeSystem was last reviewed by the publisher
   */
  public val lastReviewDate: String? = null,
  /**
   * When the CodeSystem is expected to be used
   */
  public val effectivePeriod: Period? = null,
  public val topic: List<CodeableConcept> = emptyList(),
  public val author: List<ContactDetail> = emptyList(),
  public val editor: List<ContactDetail> = emptyList(),
  public val reviewer: List<ContactDetail> = emptyList(),
  public val endorser: List<ContactDetail> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  /**
   * If code comparison is case sensitive
   */
  public val caseSensitive: Boolean? = null,
  /**
   * Canonical reference to the value set with entire code system
   */
  public val valueSet: String? = null,
  /**
   * grouped-by | is-a | part-of | classified-with
   */
  public val hierarchyMeaning: String? = null,
  /**
   * If code system defines a compositional grammar
   */
  public val compositional: Boolean? = null,
  /**
   * If definitions are not stable
   */
  public val versionNeeded: Boolean? = null,
  /**
   * not-present | example | fragment | complete | supplement
   */
  public val content: String? = null,
  /**
   * Canonical URL of Code System this adds designations and properties to
   */
  public val supplements: String? = null,
  /**
   * Total concepts in the code system
   */
  public val count: Int? = null,
  public val filter: List<CodeSystemFilter> = emptyList(),
  public val `property`: List<CodeSystemProperty> = emptyList(),
  public val concept: List<CodeSystemConcept> = emptyList(),
) : DomainResource
