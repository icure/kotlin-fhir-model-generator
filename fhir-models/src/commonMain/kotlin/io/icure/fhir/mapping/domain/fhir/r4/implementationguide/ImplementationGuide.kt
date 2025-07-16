//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.implementationguide

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * A set of rules about how FHIR is used
 *
 * A set of rules of how a particular interoperability or standards problem is solved - typically
 * through the use of FHIR resources. This resource is used to gather all the parts of an
 * implementation guide into a logical whole and to publish a computable definition of all the parts.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this implementation guide, represented as a URI (globally
 * unique)
 * @param version Business version of the implementation guide
 * @param name Name for this implementation guide (computer friendly)
 * @param title Name for this implementation guide (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the implementation guide
 * @param copyright Use and/or publishing restrictions
 * @param packageId NPM Package name for IG
 * @param license SPDX license code for this IG (or not-open-source)
 * @param definition Information needed to build the IG
 * @param manifest Information about an assembled IG
 */
@SerialName("ImplementationGuide")
@Serializable
public data class ImplementationGuide(
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
   * Canonical identifier for this implementation guide, represented as a URI (globally unique)
   */
  public val url: String? = null,
  /**
   * Business version of the implementation guide
   */
  public val version: String? = null,
  /**
   * Name for this implementation guide (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this implementation guide (human friendly)
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
   * Natural language description of the implementation guide
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * NPM Package name for IG
   */
  public val packageId: String? = null,
  /**
   * SPDX license code for this IG (or not-open-source)
   */
  public val license: String? = null,
  public val fhirVersion: List<String> = emptyList(),
  public val dependsOn: List<ImplementationGuideDependsOn> = emptyList(),
  @JsonNames("global")
  public val global_fhir: List<ImplementationGuideGlobal> = emptyList(),
  /**
   * Information needed to build the IG
   */
  public val definition: ImplementationGuideDefinition? = null,
  /**
   * Information about an assembled IG
   */
  public val manifest: ImplementationGuideManifest? = null,
) : DomainResource
