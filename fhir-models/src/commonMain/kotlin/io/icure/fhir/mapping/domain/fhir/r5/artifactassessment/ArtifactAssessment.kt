//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.artifactassessment

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Adds metadata-supported comments, classifiers or ratings related to a Resource
 *
 * This Resource provides one or more comments, classifiers or ratings about a Resource and supports
 * attribution and rights management metadata for the added content.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param title A short title for the assessment for use in displaying and selecting
 * @param citeAsReference How to cite the comment or rating
 * @param citeAsMarkdown How to cite the comment or rating
 * @param date Date last changed
 * @param copyright Use and/or publishing restrictions
 * @param approvalDate When the artifact assessment was approved by publisher
 * @param lastReviewDate When the artifact assessment was last reviewed by the publisher
 * @param artifactReference The artifact assessed, commented upon or rated
 * @param artifactCanonical The artifact assessed, commented upon or rated
 * @param artifactUri The artifact assessed, commented upon or rated
 * @param workflowStatus submitted | triaged | waiting-for-input | resolved-no-change |
 * resolved-change-required | deferred | duplicate | applied | published | entered-in-error
 * @param disposition unresolved | not-persuasive | persuasive | persuasive-with-modification |
 * not-persuasive-with-modification
 */
@SerialName("ArtifactAssessment")
@Serializable
public data class ArtifactAssessment(
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
  public val identifier: List<Identifier> = emptyList(),
  /**
   * A short title for the assessment for use in displaying and selecting
   */
  public val title: String? = null,
  /**
   * How to cite the comment or rating
   */
  public val citeAsReference: Reference? = null,
  /**
   * How to cite the comment or rating
   */
  public val citeAsMarkdown: String? = null,
  /**
   * Date last changed
   */
  public val date: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * When the artifact assessment was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the artifact assessment was last reviewed by the publisher
   */
  public val lastReviewDate: String? = null,
  /**
   * The artifact assessed, commented upon or rated
   */
  public val artifactReference: Reference? = null,
  /**
   * The artifact assessed, commented upon or rated
   */
  public val artifactCanonical: String? = null,
  /**
   * The artifact assessed, commented upon or rated
   */
  public val artifactUri: String? = null,
  public val content: List<ArtifactAssessmentContent> = emptyList(),
  /**
   * submitted | triaged | waiting-for-input | resolved-no-change | resolved-change-required |
   * deferred | duplicate | applied | published | entered-in-error
   */
  public val workflowStatus: String? = null,
  /**
   * unresolved | not-persuasive | persuasive | persuasive-with-modification |
   * not-persuasive-with-modification
   */
  public val disposition: String? = null,
) : DomainResource
