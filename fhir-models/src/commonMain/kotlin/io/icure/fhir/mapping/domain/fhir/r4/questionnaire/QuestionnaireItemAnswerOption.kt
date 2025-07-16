//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.questionnaire

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Permitted answer
 *
 * One of the permitted answers for a "choice" or "open-choice" question.
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
