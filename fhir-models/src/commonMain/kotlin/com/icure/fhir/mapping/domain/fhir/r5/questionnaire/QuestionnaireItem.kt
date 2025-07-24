//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.questionnaire

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Questions and sections within the Questionnaire
 *
 * A particular question, question grouping or display text that is part of the questionnaire.
 *
 * @param id Unique id for inter-element referencing
 * @param linkId Unique id for item in questionnaire
 * @param definition ElementDefinition - details for the item
 * @param prefix E.g. "1(a)", "2.5.3"
 * @param text Primary text for the item
 * @param type group | display | boolean | decimal | integer | date | dateTime +
 * @param enableBehavior all | any
 * @param disabledDisplay hidden | protected
 * @param required Whether the item must be included in data results
 * @param repeats Whether the item may repeat
 * @param readOnly Don't allow human editing
 * @param maxLength No more than these many characters
 * @param answerConstraint optionsOnly | optionsOrType | optionsOrString
 * @param answerValueSet ValueSet containing permitted answers
 */
@SerialName("QuestionnaireItem")
@Serializable
public data class QuestionnaireItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Unique id for item in questionnaire
   */
  public val linkId: String? = null,
  /**
   * ElementDefinition - details for the item
   */
  public val definition: String? = null,
  public val code: List<Coding> = emptyList(),
  /**
   * E.g. "1(a)", "2.5.3"
   */
  public val prefix: String? = null,
  /**
   * Primary text for the item
   */
  public val text: String? = null,
  /**
   * group | display | boolean | decimal | integer | date | dateTime +
   */
  public val type: String? = null,
  public val enableWhen: List<QuestionnaireItemEnableWhen> = emptyList(),
  /**
   * all | any
   */
  public val enableBehavior: String? = null,
  /**
   * hidden | protected
   */
  public val disabledDisplay: String? = null,
  /**
   * Whether the item must be included in data results
   */
  public val required: Boolean? = null,
  /**
   * Whether the item may repeat
   */
  public val repeats: Boolean? = null,
  /**
   * Don't allow human editing
   */
  public val readOnly: Boolean? = null,
  /**
   * No more than these many characters
   */
  public val maxLength: Int? = null,
  /**
   * optionsOnly | optionsOrType | optionsOrString
   */
  public val answerConstraint: String? = null,
  /**
   * ValueSet containing permitted answers
   */
  public val answerValueSet: String? = null,
  public val answerOption: List<QuestionnaireItemAnswerOption> = emptyList(),
  public val initial: List<QuestionnaireItemInitial> = emptyList(),
  public val item: List<QuestionnaireItem> = emptyList(),
) : BackboneElement
