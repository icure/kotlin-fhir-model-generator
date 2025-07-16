//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.questionnaireresponse

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A structured set of questions and their answers
 *
 * A structured set of questions and their answers. The questions are ordered and grouped into
 * coherent subsets, corresponding to the structure of the grouping of the questionnaire being
 * responded to.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param identifier Unique id for this set of answers
 * @param questionnaire Form being answered
 * @param status in-progress | completed | amended | entered-in-error | stopped
 * @param subject The subject of the questions
 * @param encounter Encounter created as part of
 * @param authored Date the answers were gathered
 * @param author Person who received and recorded the answers
 * @param source The person who answered the questions
 */
@SerialName("QuestionnaireResponse")
@Serializable
public data class QuestionnaireResponse(
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
   * Unique id for this set of answers
   */
  public val identifier: Identifier? = null,
  public val basedOn: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * Form being answered
   */
  public val questionnaire: String? = null,
  /**
   * in-progress | completed | amended | entered-in-error | stopped
   */
  public val status: String? = null,
  /**
   * The subject of the questions
   */
  public val subject: Reference? = null,
  /**
   * Encounter created as part of
   */
  public val encounter: Reference? = null,
  /**
   * Date the answers were gathered
   */
  public val authored: String? = null,
  /**
   * Person who received and recorded the answers
   */
  public val author: Reference? = null,
  /**
   * The person who answered the questions
   */
  public val source: Reference? = null,
  public val item: List<QuestionnaireResponseItem> = emptyList(),
) : DomainResource
