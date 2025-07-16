//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.evidence

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r4b.relatedartifact.RelatedArtifact
import io.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Single evidence bit
 *
 * The Evidence Resource provides a machine-interpretable expression of an evidence concept
 * including the evidence variables (eg population, exposures/interventions, comparators, outcomes,
 * measured variables, confounding variables), the statistics, and the certainty of this evidence.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this evidence, represented as a globally unique URI
 * @param version Business version of this summary
 * @param title Name for this summary (human friendly)
 * @param citeAsReference Citation for this evidence
 * @param citeAsMarkdown Citation for this evidence
 * @param status draft | active | retired | unknown
 * @param date Date last changed
 * @param approvalDate When the summary was approved by publisher
 * @param lastReviewDate When the summary was last reviewed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Description of the particular summary
 * @param assertion Declarative description of the Evidence
 * @param synthesisType The method to combine studies
 * @param studyType The type of study that produced this evidence
 */
@SerialName("Evidence")
@Serializable
public data class Evidence(
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
   * Canonical identifier for this evidence, represented as a globally unique URI
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of this summary
   */
  public val version: String? = null,
  /**
   * Name for this summary (human friendly)
   */
  public val title: String? = null,
  /**
   * Citation for this evidence
   */
  public val citeAsReference: Reference? = null,
  /**
   * Citation for this evidence
   */
  public val citeAsMarkdown: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * Date last changed
   */
  public val date: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  /**
   * When the summary was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the summary was last reviewed
   */
  public val lastReviewDate: String? = null,
  /**
   * Name of the publisher (organization or individual)
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  public val author: List<ContactDetail> = emptyList(),
  public val editor: List<ContactDetail> = emptyList(),
  public val reviewer: List<ContactDetail> = emptyList(),
  public val endorser: List<ContactDetail> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  /**
   * Description of the particular summary
   */
  public val description: String? = null,
  /**
   * Declarative description of the Evidence
   */
  public val assertion: String? = null,
  public val note: List<Annotation> = emptyList(),
  public val variableDefinition: List<EvidenceVariableDefinition> = emptyList(),
  /**
   * The method to combine studies
   */
  public val synthesisType: CodeableConcept? = null,
  /**
   * The type of study that produced this evidence
   */
  public val studyType: CodeableConcept? = null,
  public val statistic: List<EvidenceStatistic> = emptyList(),
  public val certainty: List<EvidenceCertainty> = emptyList(),
) : DomainResource
