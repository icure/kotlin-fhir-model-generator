//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.codesystem

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
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
 * @param name Name for this code system (computer friendly)
 * @param title Name for this code system (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the code system
 * @param purpose Why this code system is defined
 * @param copyright Use and/or publishing restrictions
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
   * Name of the publisher (organization or individual)
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
