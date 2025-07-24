//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.evidencereport

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4b.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A EvidenceReport
 *
 * The EvidenceReport Resource is a specialized container for a collection of resources and codable
 * concepts, adapted to support compositions of Evidence, EvidenceVariable, and Citation resources and
 * related concepts.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this EvidenceReport, represented as a globally unique URI
 * @param status draft | active | retired | unknown
 * @param citeAsReference Citation for this report
 * @param citeAsMarkdown Citation for this report
 * @param type Kind of report
 * @param subject Focus of the report
 * @param publisher Name of the publisher (organization or individual)
 */
@SerialName("EvidenceReport")
@Serializable
public data class EvidenceReport(
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
   * Canonical identifier for this EvidenceReport, represented as a globally unique URI
   */
  public val url: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  public val relatedIdentifier: List<Identifier> = emptyList(),
  /**
   * Citation for this report
   */
  public val citeAsReference: Reference? = null,
  /**
   * Citation for this report
   */
  public val citeAsMarkdown: String? = null,
  /**
   * Kind of report
   */
  public val type: CodeableConcept? = null,
  public val note: List<Annotation> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  /**
   * Focus of the report
   */
  public val subject: EvidenceReportSubject,
  /**
   * Name of the publisher (organization or individual)
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  public val author: List<ContactDetail> = emptyList(),
  public val editor: List<ContactDetail> = emptyList(),
  public val reviewer: List<ContactDetail> = emptyList(),
  public val endorser: List<ContactDetail> = emptyList(),
  public val relatesTo: List<EvidenceReportRelatesTo> = emptyList(),
  public val section: List<EvidenceReportSection> = emptyList(),
) : DomainResource
