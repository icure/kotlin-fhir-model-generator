//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.activitydefinition

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.age.Age
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r4.dosage.Dosage
import com.icure.fhir.mapping.domain.fhir.r4.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.range.Range
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r4.timing.Timing
import com.icure.fhir.mapping.domain.fhir.r4.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The definition of a specific activity to be taken, independent of any particular patient or
 * context
 *
 * This resource allows for the definition of some activity to be performed, independent of a
 * particular patient, practitioner, or other performance context.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this activity definition, represented as a URI (globally
 * unique)
 * @param version Business version of the activity definition
 * @param name Name for this activity definition (computer friendly)
 * @param title Name for this activity definition (human friendly)
 * @param subtitle Subordinate title of the activity definition
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param subjectCodeableConcept Type of individual the activity definition is intended for
 * @param subjectReference Type of individual the activity definition is intended for
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the activity definition
 * @param purpose Why this activity definition is defined
 * @param usage Describes the clinical usage of the activity definition
 * @param copyright Use and/or publishing restrictions
 * @param approvalDate When the activity definition was approved by publisher
 * @param lastReviewDate When the activity definition was last reviewed
 * @param effectivePeriod When the activity definition is expected to be used
 * @param kind Kind of resource
 * @param profile What profile the resource needs to conform to
 * @param code Detail type of activity
 * @param intent proposal | plan | directive | order | original-order | reflex-order | filler-order
 * | instance-order | option
 * @param priority routine | urgent | asap | stat
 * @param doNotPerform True if the activity should not be performed
 * @param timingTiming When activity is to occur
 * @param timingDateTime When activity is to occur
 * @param timingAge When activity is to occur
 * @param timingPeriod When activity is to occur
 * @param timingRange When activity is to occur
 * @param timingDuration When activity is to occur
 * @param location Where it should happen
 * @param productReference What's administered/supplied
 * @param productCodeableConcept What's administered/supplied
 * @param quantity How much is administered/consumed/supplied
 * @param transform Transform to apply the template
 */
@SerialName("ActivityDefinition")
@Serializable
public data class ActivityDefinition(
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
   * Canonical identifier for this activity definition, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the activity definition
   */
  public val version: String? = null,
  /**
   * Name for this activity definition (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this activity definition (human friendly)
   */
  public val title: String? = null,
  /**
   * Subordinate title of the activity definition
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
   * Type of individual the activity definition is intended for
   */
  public val subjectCodeableConcept: CodeableConcept? = null,
  /**
   * Type of individual the activity definition is intended for
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
   * Natural language description of the activity definition
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this activity definition is defined
   */
  public val purpose: String? = null,
  /**
   * Describes the clinical usage of the activity definition
   */
  public val usage: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * When the activity definition was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the activity definition was last reviewed
   */
  public val lastReviewDate: String? = null,
  /**
   * When the activity definition is expected to be used
   */
  public val effectivePeriod: Period? = null,
  public val topic: List<CodeableConcept> = emptyList(),
  public val author: List<ContactDetail> = emptyList(),
  public val editor: List<ContactDetail> = emptyList(),
  public val reviewer: List<ContactDetail> = emptyList(),
  public val endorser: List<ContactDetail> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  public val library: List<String> = emptyList(),
  /**
   * Kind of resource
   */
  public val kind: String? = null,
  /**
   * What profile the resource needs to conform to
   */
  public val profile: String? = null,
  /**
   * Detail type of activity
   */
  public val code: CodeableConcept? = null,
  /**
   * proposal | plan | directive | order | original-order | reflex-order | filler-order |
   * instance-order | option
   */
  public val intent: String? = null,
  /**
   * routine | urgent | asap | stat
   */
  public val priority: String? = null,
  /**
   * True if the activity should not be performed
   */
  public val doNotPerform: Boolean? = null,
  /**
   * When activity is to occur
   */
  public val timingTiming: Timing? = null,
  /**
   * When activity is to occur
   */
  public val timingDateTime: String? = null,
  /**
   * When activity is to occur
   */
  public val timingAge: Age? = null,
  /**
   * When activity is to occur
   */
  public val timingPeriod: Period? = null,
  /**
   * When activity is to occur
   */
  public val timingRange: Range? = null,
  /**
   * When activity is to occur
   */
  public val timingDuration: Duration? = null,
  /**
   * Where it should happen
   */
  public val location: Reference? = null,
  public val participant: List<ActivityDefinitionParticipant> = emptyList(),
  /**
   * What's administered/supplied
   */
  public val productReference: Reference? = null,
  /**
   * What's administered/supplied
   */
  public val productCodeableConcept: CodeableConcept? = null,
  /**
   * How much is administered/consumed/supplied
   */
  public val quantity: Quantity? = null,
  public val dosage: List<Dosage> = emptyList(),
  public val bodySite: List<CodeableConcept> = emptyList(),
  public val specimenRequirement: List<Reference> = emptyList(),
  public val observationRequirement: List<Reference> = emptyList(),
  public val observationResultRequirement: List<Reference> = emptyList(),
  /**
   * Transform to apply the template
   */
  public val transform: String? = null,
  public val dynamicValue: List<ActivityDefinitionDynamicValue> = emptyList(),
) : DomainResource
