//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.evidence

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
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r5.relatedartifact.RelatedArtifact
import io.icure.fhir.mapping.domain.fhir.r5.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Single evidence bit
 *
 * The Evidence Resource provides a machine-interpretable expression of an evidence concept
 * including the evidence variables (e.g., population, exposures/interventions, comparators, outcomes,
 * measured variables, confounding variables), the statistics, and the certainty of this evidence.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this evidence, represented as a globally unique URI
 * @param version Business version of this summary
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this summary (machine friendly)
 * @param title Name for this summary (human friendly)
 * @param citeAsReference Citation for this evidence
 * @param citeAsMarkdown Citation for this evidence
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param approvalDate When the summary was approved by publisher
 * @param lastReviewDate When the summary was last reviewed by the publisher
 * @param publisher Name of the publisher/steward (organization or individual)
 * @param purpose Why this Evidence is defined
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
 * @param description Description of the particular summary
 * @param assertion Declarative description of the Evidence
 * @param synthesisType The method to combine studies
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
   * How to compare versions
   */
  public val versionAlgorithmString: String? = null,
  /**
   * How to compare versions
   */
  public val versionAlgorithmCoding: Coding? = null,
  /**
   * Name for this summary (machine friendly)
   */
  public val name: String? = null,
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
   * For testing purposes, not real usage
   */
  public val experimental: Boolean? = null,
  /**
   * Date last changed
   */
  public val date: String? = null,
  /**
   * When the summary was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the summary was last reviewed by the publisher
   */
  public val lastReviewDate: String? = null,
  /**
   * Name of the publisher/steward (organization or individual)
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  public val author: List<ContactDetail> = emptyList(),
  public val editor: List<ContactDetail> = emptyList(),
  public val reviewer: List<ContactDetail> = emptyList(),
  public val endorser: List<ContactDetail> = emptyList(),
  public val useContext: List<UsageContext> = emptyList(),
  /**
   * Why this Evidence is defined
   */
  public val purpose: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * Copyright holder and year(s)
   */
  public val copyrightLabel: String? = null,
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
  public val studyDesign: List<CodeableConcept> = emptyList(),
  public val statistic: List<EvidenceStatistic> = emptyList(),
  public val certainty: List<EvidenceCertainty> = emptyList(),
) : DomainResource
