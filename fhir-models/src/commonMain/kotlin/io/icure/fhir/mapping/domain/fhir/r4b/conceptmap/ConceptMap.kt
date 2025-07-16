//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.conceptmap

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
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
 * A map from one set of concepts to one or more other concepts
 *
 * A statement of relationships from one set of concepts to one or more other concepts - either
 * concepts in code systems, or data element/data element concepts, or classes in class models.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this concept map, represented as a URI (globally unique)
 * @param identifier Additional identifier for the concept map
 * @param version Business version of the concept map
 * @param name Name for this concept map (computer friendly)
 * @param title Name for this concept map (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the concept map
 * @param purpose Why this concept map is defined
 * @param copyright Use and/or publishing restrictions
 * @param sourceUri The source value set that contains the concepts that are being mapped
 * @param sourceCanonical The source value set that contains the concepts that are being mapped
 * @param targetUri The target value set which provides context for the mappings
 * @param targetCanonical The target value set which provides context for the mappings
 */
@SerialName("ConceptMap")
@Serializable
public data class ConceptMap(
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
   * Canonical identifier for this concept map, represented as a URI (globally unique)
   */
  public val url: String? = null,
  /**
   * Additional identifier for the concept map
   */
  public val identifier: Identifier? = null,
  /**
   * Business version of the concept map
   */
  public val version: String? = null,
  /**
   * Name for this concept map (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this concept map (human friendly)
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
   * Natural language description of the concept map
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this concept map is defined
   */
  public val purpose: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * The source value set that contains the concepts that are being mapped
   */
  public val sourceUri: String? = null,
  /**
   * The source value set that contains the concepts that are being mapped
   */
  public val sourceCanonical: String? = null,
  /**
   * The target value set which provides context for the mappings
   */
  public val targetUri: String? = null,
  /**
   * The target value set which provides context for the mappings
   */
  public val targetCanonical: String? = null,
  public val group: List<ConceptMapGroup> = emptyList(),
) : DomainResource
