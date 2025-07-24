//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.questionnaireresponse

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Groups and questions
 *
 * A group or question item from the original questionnaire for which answers are provided.
 *
 * @param id Unique id for inter-element referencing
 * @param linkId Pointer to specific item from Questionnaire
 * @param definition ElementDefinition - details for the item
 * @param text Name for group or question text
 */
@SerialName("QuestionnaireResponseItem")
@Serializable
public data class QuestionnaireResponseItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Pointer to specific item from Questionnaire
   */
  public val linkId: String? = null,
  /**
   * ElementDefinition - details for the item
   */
  public val definition: String? = null,
  /**
   * Name for group or question text
   */
  public val text: String? = null,
  public val answer: List<QuestionnaireResponseItemAnswer> = emptyList(),
  public val item: List<QuestionnaireResponseItem> = emptyList(),
) : BackboneElement
