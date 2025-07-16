//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.questionnaire

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Initial value(s) when item is first rendered
 *
 * One or more values that should be pre-populated in the answer when initially rendering the
 * questionnaire for user input.
 *
 * @param id Unique id for inter-element referencing
 * @param valueBoolean Actual value for initializing the question
 * @param valueDecimal Actual value for initializing the question
 * @param valueInteger Actual value for initializing the question
 * @param valueDate Actual value for initializing the question
 * @param valueDateTime Actual value for initializing the question
 * @param valueTime Actual value for initializing the question
 * @param valueString Actual value for initializing the question
 * @param valueUri Actual value for initializing the question
 * @param valueAttachment Actual value for initializing the question
 * @param valueCoding Actual value for initializing the question
 * @param valueQuantity Actual value for initializing the question
 * @param valueReference Actual value for initializing the question
 */
@SerialName("QuestionnaireItemInitial")
@Serializable
public data class QuestionnaireItemInitial(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Actual value for initializing the question
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Actual value for initializing the question
   */
  public val valueDecimal: Float? = null,
  /**
   * Actual value for initializing the question
   */
  public val valueInteger: Int? = null,
  /**
   * Actual value for initializing the question
   */
  public val valueDate: String? = null,
  /**
   * Actual value for initializing the question
   */
  public val valueDateTime: String? = null,
  /**
   * Actual value for initializing the question
   */
  public val valueTime: String? = null,
  /**
   * Actual value for initializing the question
   */
  public val valueString: String? = null,
  /**
   * Actual value for initializing the question
   */
  public val valueUri: String? = null,
  /**
   * Actual value for initializing the question
   */
  public val valueAttachment: Attachment? = null,
  /**
   * Actual value for initializing the question
   */
  public val valueCoding: Coding? = null,
  /**
   * Actual value for initializing the question
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Actual value for initializing the question
   */
  public val valueReference: Reference? = null,
) : BackboneElement
