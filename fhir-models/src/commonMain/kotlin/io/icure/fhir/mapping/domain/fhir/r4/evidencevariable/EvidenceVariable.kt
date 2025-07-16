//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.evidencevariable

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import io.icure.fhir.mapping.domain.fhir.r4.relatedartifact.RelatedArtifact
import io.icure.fhir.mapping.domain.fhir.r4.usagecontext.UsageContext
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A population, intervention, or exposure definition
 *
 * The EvidenceVariable resource describes a "PICO" element that knowledge (evidence, assertion,
 * recommendation) is about.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this evidence variable, represented as a URI (globally
 * unique)
 * @param version Business version of the evidence variable
 * @param name Name for this evidence variable (computer friendly)
 * @param title Name for this evidence variable (human friendly)
 * @param shortTitle Title for use in informal contexts
 * @param subtitle Subordinate title of the EvidenceVariable
 * @param status draft | active | retired | unknown
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the evidence variable
 * @param copyright Use and/or publishing restrictions
 * @param approvalDate When the evidence variable was approved by publisher
 * @param lastReviewDate When the evidence variable was last reviewed
 * @param effectivePeriod When the evidence variable is expected to be used
 * @param type dichotomous | continuous | descriptive
 */
@SerialName("EvidenceVariable")
@Serializable
public data class EvidenceVariable(
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
   * Canonical identifier for this evidence variable, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the evidence variable
   */
  public val version: String? = null,
  /**
   * Name for this evidence variable (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this evidence variable (human friendly)
   */
  public val title: String? = null,
  /**
   * Title for use in informal contexts
   */
  public val shortTitle: String? = null,
  /**
   * Subordinate title of the EvidenceVariable
   */
  public val subtitle: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
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
   * Natural language description of the evidence variable
   */
  public val description: String? = null,
  public val note: List<Annotation> = emptyList(),
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * When the evidence variable was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the evidence variable was last reviewed
   */
  public val lastReviewDate: String? = null,
  /**
   * When the evidence variable is expected to be used
   */
  public val effectivePeriod: Period? = null,
  public val topic: List<CodeableConcept> = emptyList(),
  public val author: List<ContactDetail> = emptyList(),
  public val editor: List<ContactDetail> = emptyList(),
  public val reviewer: List<ContactDetail> = emptyList(),
  public val endorser: List<ContactDetail> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  /**
   * dichotomous | continuous | descriptive
   */
  public val type: String? = null,
  public val characteristic: List<EvidenceVariableCharacteristic> = emptyList(),
) : DomainResource
