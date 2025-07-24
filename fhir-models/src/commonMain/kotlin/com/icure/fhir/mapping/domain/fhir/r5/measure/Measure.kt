//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.measure

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r5.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r5.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A quality measure definition
 *
 * The Measure resource provides the definition of a quality measure.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this measure, represented as a URI (globally unique)
 * @param version Business version of the measure
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this measure (computer friendly)
 * @param title Name for this measure (human friendly)
 * @param subtitle Subordinate title of the measure
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param subjectCodeableConcept E.g. Patient, Practitioner, RelatedPerson, Organization, Location,
 * Device
 * @param subjectReference E.g. Patient, Practitioner, RelatedPerson, Organization, Location, Device
 * @param basis Population basis
 * @param date Date last changed
 * @param publisher Name of the publisher/steward (organization or individual)
 * @param description Natural language description of the measure
 * @param purpose Why this measure is defined
 * @param usage Describes the clinical usage of the measure
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
 * @param approvalDate When the measure was approved by publisher
 * @param lastReviewDate When the measure was last reviewed by the publisher
 * @param effectivePeriod When the measure is expected to be used
 * @param disclaimer Disclaimer for use of the measure or its referenced content
 * @param scoring proportion | ratio | continuous-variable | cohort
 * @param scoringUnit What units?
 * @param compositeScoring opportunity | all-or-nothing | linear | weighted
 * @param riskAdjustment How risk adjustment is applied for this measure
 * @param rateAggregation How is rate aggregation performed for this measure
 * @param rationale Detailed description of why the measure exists
 * @param clinicalRecommendationStatement Summary of clinical guidelines
 * @param improvementNotation increase | decrease
 * @param guidance Additional guidance for implementers (deprecated)
 */
@SerialName("Measure")
@Serializable
public data class Measure(
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
   * Canonical identifier for this measure, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the measure
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
   * Name for this measure (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this measure (human friendly)
   */
  public val title: String? = null,
  /**
   * Subordinate title of the measure
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
   * Population basis
   */
  public val basis: String? = null,
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
   * Natural language description of the measure
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this measure is defined
   */
  public val purpose: String? = null,
  /**
   * Describes the clinical usage of the measure
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
   * When the measure was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the measure was last reviewed by the publisher
   */
  public val lastReviewDate: String? = null,
  /**
   * When the measure is expected to be used
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
   * Disclaimer for use of the measure or its referenced content
   */
  public val disclaimer: String? = null,
  /**
   * proportion | ratio | continuous-variable | cohort
   */
  public val scoring: CodeableConcept? = null,
  /**
   * What units?
   */
  public val scoringUnit: CodeableConcept? = null,
  /**
   * opportunity | all-or-nothing | linear | weighted
   */
  public val compositeScoring: CodeableConcept? = null,
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * How risk adjustment is applied for this measure
   */
  public val riskAdjustment: String? = null,
  /**
   * How is rate aggregation performed for this measure
   */
  public val rateAggregation: String? = null,
  /**
   * Detailed description of why the measure exists
   */
  public val rationale: String? = null,
  /**
   * Summary of clinical guidelines
   */
  public val clinicalRecommendationStatement: String? = null,
  /**
   * increase | decrease
   */
  public val improvementNotation: CodeableConcept? = null,
  public val term: List<MeasureTerm> = emptyList(),
  /**
   * Additional guidance for implementers (deprecated)
   */
  public val guidance: String? = null,
  public val group: List<MeasureGroup> = emptyList(),
  public val supplementalData: List<MeasureSupplementalData> = emptyList(),
) : DomainResource
