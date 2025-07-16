//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.researchdefinition

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r4b.relatedartifact.RelatedArtifact
import io.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A research context or question
 *
 * The ResearchDefinition resource describes the conditional state (population and any exposures
 * being compared within the population) and outcome (if specified) that the knowledge (evidence,
 * assertion, recommendation) is about.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this research definition, represented as a URI (globally
 * unique)
 * @param version Business version of the research definition
 * @param name Name for this research definition (computer friendly)
 * @param title Name for this research definition (human friendly)
 * @param shortTitle Title for use in informal contexts
 * @param subtitle Subordinate title of the ResearchDefinition
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param subjectCodeableConcept E.g. Patient, Practitioner, RelatedPerson, Organization, Location,
 * Device
 * @param subjectReference E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the research definition
 * @param purpose Why this research definition is defined
 * @param usage Describes the clinical usage of the ResearchDefinition
 * @param copyright Use and/or publishing restrictions
 * @param approvalDate When the research definition was approved by publisher
 * @param lastReviewDate When the research definition was last reviewed
 * @param effectivePeriod When the research definition is expected to be used
 * @param population What population?
 * @param exposure What exposure?
 * @param exposureAlternative What alternative exposure state?
 * @param outcome What outcome?
 */
@SerialName("ResearchDefinition")
@Serializable
public data class ResearchDefinition(
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
   * Canonical identifier for this research definition, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the research definition
   */
  public val version: String? = null,
  /**
   * Name for this research definition (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this research definition (human friendly)
   */
  public val title: String? = null,
  /**
   * Title for use in informal contexts
   */
  public val shortTitle: String? = null,
  /**
   * Subordinate title of the ResearchDefinition
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
   * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
   */
  public val subjectCodeableConcept: CodeableConcept? = null,
  /**
   * E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
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
   * Natural language description of the research definition
   */
  public val description: String? = null,
  public val comment: List<String> = emptyList(),
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this research definition is defined
   */
  public val purpose: String? = null,
  /**
   * Describes the clinical usage of the ResearchDefinition
   */
  public val usage: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * When the research definition was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the research definition was last reviewed
   */
  public val lastReviewDate: String? = null,
  /**
   * When the research definition is expected to be used
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
   * What population?
   */
  public val population: Reference,
  /**
   * What exposure?
   */
  public val exposure: Reference? = null,
  /**
   * What alternative exposure state?
   */
  public val exposureAlternative: Reference? = null,
  /**
   * What outcome?
   */
  public val outcome: Reference? = null,
) : DomainResource
