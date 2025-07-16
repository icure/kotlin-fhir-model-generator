//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.questionnaireresponse

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The response(s) to the question
 *
 * The respondent's answer(s) to the question.
 *
 * @param id Unique id for inter-element referencing
 * @param valueBoolean Single-valued answer to the question
 * @param valueDecimal Single-valued answer to the question
 * @param valueInteger Single-valued answer to the question
 * @param valueDate Single-valued answer to the question
 * @param valueDateTime Single-valued answer to the question
 * @param valueTime Single-valued answer to the question
 * @param valueString Single-valued answer to the question
 * @param valueUri Single-valued answer to the question
 * @param valueAttachment Single-valued answer to the question
 * @param valueCoding Single-valued answer to the question
 * @param valueQuantity Single-valued answer to the question
 * @param valueReference Single-valued answer to the question
 */
@SerialName("QuestionnaireResponseItemAnswer")
@Serializable
public data class QuestionnaireResponseItemAnswer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Single-valued answer to the question
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Single-valued answer to the question
   */
  public val valueDecimal: Float? = null,
  /**
   * Single-valued answer to the question
   */
  public val valueInteger: Int? = null,
  /**
   * Single-valued answer to the question
   */
  public val valueDate: String? = null,
  /**
   * Single-valued answer to the question
   */
  public val valueDateTime: String? = null,
  /**
   * Single-valued answer to the question
   */
  public val valueTime: String? = null,
  /**
   * Single-valued answer to the question
   */
  public val valueString: String? = null,
  /**
   * Single-valued answer to the question
   */
  public val valueUri: String? = null,
  /**
   * Single-valued answer to the question
   */
  public val valueAttachment: Attachment? = null,
  /**
   * Single-valued answer to the question
   */
  public val valueCoding: Coding? = null,
  /**
   * Single-valued answer to the question
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Single-valued answer to the question
   */
  public val valueReference: Reference? = null,
  public val item: List<QuestionnaireResponseItem> = emptyList(),
) : BackboneElement
