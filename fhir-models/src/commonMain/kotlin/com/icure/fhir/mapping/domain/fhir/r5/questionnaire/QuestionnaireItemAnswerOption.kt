//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.questionnaire

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Permitted answer
 *
 * One of the permitted answers for the question.
 *
 * @param id Unique id for inter-element referencing
 * @param valueInteger Answer value
 * @param valueDate Answer value
 * @param valueTime Answer value
 * @param valueString Answer value
 * @param valueCoding Answer value
 * @param valueReference Answer value
 * @param initialSelected Whether option is selected by default
 */
@SerialName("QuestionnaireItemAnswerOption")
@Serializable
public data class QuestionnaireItemAnswerOption(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Answer value
   */
  public val valueInteger: Int? = null,
  /**
   * Answer value
   */
  public val valueDate: String? = null,
  /**
   * Answer value
   */
  public val valueTime: String? = null,
  /**
   * Answer value
   */
  public val valueString: String? = null,
  /**
   * Answer value
   */
  public val valueCoding: Coding? = null,
  /**
   * Answer value
   */
  public val valueReference: Reference? = null,
  /**
   * Whether option is selected by default
   */
  public val initialSelected: Boolean? = null,
) : BackboneElement
