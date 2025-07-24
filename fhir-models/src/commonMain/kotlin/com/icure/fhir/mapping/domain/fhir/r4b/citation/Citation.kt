//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.citation

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
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
 * @param url Canonical identifier for this citation, represented as a globally unique URI
 * @param version Business version of the citation
 * @param name Name for this citation (computer friendly)
 * @param title Name for this citation (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher The publisher of the Citation, not the publisher of the article or artifact
 * being cited
 * @param description Natural language description of the citation
 * @param purpose Why this citation is defined
 * @param copyright Use and/or publishing restrictions for the Citation, not for the cited artifact
 * @param approvalDate When the citation was approved by publisher
 * @param lastReviewDate When the citation was last reviewed
 * @param effectivePeriod When the citation is expected to be used
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
   * Canonical identifier for this citation, represented as a globally unique URI
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the citation
   */
  public val version: String? = null,
  /**
   * Name for this citation (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this citation (human friendly)
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
   * The publisher of the Citation, not the publisher of the article or artifact being cited
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
   * Use and/or publishing restrictions for the Citation, not for the cited artifact
   */
  public val copyright: String? = null,
  /**
   * When the citation was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the citation was last reviewed
   */
  public val lastReviewDate: String? = null,
  /**
   * When the citation is expected to be used
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
  public val relatesTo: List<CitationRelatesTo> = emptyList(),
  /**
   * The article or artifact being described
   */
  public val citedArtifact: CitationCitedArtifact? = null,
) : DomainResource
