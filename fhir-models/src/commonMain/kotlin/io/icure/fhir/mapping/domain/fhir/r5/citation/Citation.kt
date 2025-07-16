//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.citation

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r5.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.relatedartifact.RelatedArtifact
import io.icure.fhir.mapping.domain.fhir.r5.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A description of identification, location, or contributorship of a publication (article or
 * artifact)
 *
 * The Citation Resource enables reference to any knowledge artifact for purposes of identification
 * and attribution. The Citation Resource supports existing reference structures and developing
 * publication practices such as versioning, expressing complex contributorship roles, and referencing
 * computable resources.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this citation record, represented as a globally unique URI
 * @param version Business version of the citation record
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this citation record (computer friendly)
 * @param title Name for this citation record (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher The publisher of the citation record, not the publisher of the article or
 * artifact being cited
 * @param description Natural language description of the citation
 * @param purpose Why this citation is defined
 * @param copyright Use and/or publishing restrictions for the citation record, not for the cited
 * artifact
 * @param copyrightLabel Copyright holder and year(s) for the ciation record, not for the cited
 * artifact
 * @param approvalDate When the citation record was approved by publisher
 * @param lastReviewDate When the citation record was last reviewed by the publisher
 * @param effectivePeriod When the citation record is expected to be used
 * @param citedArtifact The article or artifact being described
 */
@SerialName("Citation")
@Serializable
public data class Citation(
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
   * Canonical identifier for this citation record, represented as a globally unique URI
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the citation record
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
   * Name for this citation record (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this citation record (human friendly)
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
   * The publisher of the citation record, not the publisher of the article or artifact being cited
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  /**
   * Natural language description of the citation
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this citation is defined
   */
  public val purpose: String? = null,
  /**
   * Use and/or publishing restrictions for the citation record, not for the cited artifact
   */
  public val copyright: String? = null,
  /**
   * Copyright holder and year(s) for the ciation record, not for the cited artifact
   */
  public val copyrightLabel: String? = null,
  /**
   * When the citation record was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the citation record was last reviewed by the publisher
   */
  public val lastReviewDate: String? = null,
  /**
   * When the citation record is expected to be used
   */
  public val effectivePeriod: Period? = null,
  public val author: List<ContactDetail> = emptyList(),
  public val editor: List<ContactDetail> = emptyList(),
  public val reviewer: List<ContactDetail> = emptyList(),
  public val endorser: List<ContactDetail> = emptyList(),
  public val summary: List<CitationSummary> = emptyList(),
  public val classification: List<CitationClassification> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val currentState: List<CodeableConcept> = emptyList(),
  public val statusDate: List<CitationStatusDate> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  /**
   * The article or artifact being described
   */
  public val citedArtifact: CitationCitedArtifact? = null,
) : DomainResource
