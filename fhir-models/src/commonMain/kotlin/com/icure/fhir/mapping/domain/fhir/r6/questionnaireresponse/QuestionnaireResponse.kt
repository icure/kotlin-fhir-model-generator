//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.questionnaireresponse

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param questionnaire Canonical URL of Questionnaire being answered
 * @param status in-progress | completed | amended | entered-in-error | stopped
 * @param subject The subject of the questions
 * @param encounter Encounter the questionnaire response is part of
 * @param authored Date the answers were gathered
 * @param author The individual or device that received and recorded the answers
 * @param source The individual or device that answered the questions
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
  public val identifier: List<Identifier> = emptyList(),
  public val basedOn: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * Canonical URL of Questionnaire being answered
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
   * Encounter the questionnaire response is part of
   */
  public val encounter: Reference? = null,
  /**
   * Date the answers were gathered
   */
  public val authored: String? = null,
  /**
   * The individual or device that received and recorded the answers
   */
  public val author: Reference? = null,
  /**
   * The individual or device that answered the questions
   */
  public val source: Reference? = null,
  public val item: List<QuestionnaireResponseItem> = emptyList(),
) : DomainResource
