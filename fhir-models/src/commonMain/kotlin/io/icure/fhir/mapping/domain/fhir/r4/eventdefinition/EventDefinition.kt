//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.eventdefinition

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r4.relatedartifact.RelatedArtifact
import io.icure.fhir.mapping.domain.fhir.r4.triggerdefinition.TriggerDefinition
import io.icure.fhir.mapping.domain.fhir.r4.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A description of when an event can occur
 *
 * The EventDefinition resource provides a reusable description of when a particular event can
 * occur.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this event definition, represented as a URI (globally unique)
 * @param version Business version of the event definition
 * @param name Name for this event definition (computer friendly)
 * @param title Name for this event definition (human friendly)
 * @param subtitle Subordinate title of the event definition
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param subjectCodeableConcept Type of individual the event definition is focused on
 * @param subjectReference Type of individual the event definition is focused on
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the event definition
 * @param purpose Why this event definition is defined
 * @param usage Describes the clinical usage of the event definition
 * @param copyright Use and/or publishing restrictions
 * @param approvalDate When the event definition was approved by publisher
 * @param lastReviewDate When the event definition was last reviewed
 * @param effectivePeriod When the event definition is expected to be used
 */
@SerialName("EventDefinition")
@Serializable
public data class EventDefinition(
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
   * Canonical identifier for this event definition, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the event definition
   */
  public val version: String? = null,
  /**
   * Name for this event definition (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this event definition (human friendly)
   */
  public val title: String? = null,
  /**
   * Subordinate title of the event definition
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
   * Type of individual the event definition is focused on
   */
  public val subjectCodeableConcept: CodeableConcept? = null,
  /**
   * Type of individual the event definition is focused on
   */
  public val subjectReference: Reference? = null,
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
   * Natural language description of the event definition
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this event definition is defined
   */
  public val purpose: String? = null,
  /**
   * Describes the clinical usage of the event definition
   */
  public val usage: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * When the event definition was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the event definition was last reviewed
   */
  public val lastReviewDate: String? = null,
  /**
   * When the event definition is expected to be used
   */
  public val effectivePeriod: Period? = null,
  public val topic: List<CodeableConcept> = emptyList(),
  public val author: List<ContactDetail> = emptyList(),
  public val editor: List<ContactDetail> = emptyList(),
  public val reviewer: List<ContactDetail> = emptyList(),
  public val endorser: List<ContactDetail> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  public val trigger: List<TriggerDefinition> = emptyList(),
) : DomainResource
