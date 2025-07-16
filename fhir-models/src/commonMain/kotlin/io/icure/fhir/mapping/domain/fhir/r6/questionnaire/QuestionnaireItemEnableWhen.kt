//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.questionnaire

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Only allow data when
 *
 * A constraint indicating that this item should only be enabled (displayed/allow answers to be
 * captured) when the specified condition is true.
 *
 * @param id Unique id for inter-element referencing
 * @param question The linkId of question that determines whether item is enabled/disabled
 * @param operator exists | = | != | > | < | >= | <=
 * @param answerBoolean Value for question comparison based on operator
 * @param answerDecimal Value for question comparison based on operator
 * @param answerInteger Value for question comparison based on operator
 * @param answerDate Value for question comparison based on operator
 * @param answerDateTime Value for question comparison based on operator
 * @param answerTime Value for question comparison based on operator
 * @param answerString Value for question comparison based on operator
 * @param answerCoding Value for question comparison based on operator
 * @param answerQuantity Value for question comparison based on operator
 * @param answerReference Value for question comparison based on operator
 */
@SerialName("QuestionnaireItemEnableWhen")
@Serializable
public data class QuestionnaireItemEnableWhen(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The linkId of question that determines whether item is enabled/disabled
   */
  public val question: String? = null,
  /**
   * exists | = | != | > | < | >= | <=
   */
  public val `operator`: String? = null,
  /**
   * Value for question comparison based on operator
   */
  public val answerBoolean: Boolean? = null,
  /**
   * Value for question comparison based on operator
   */
  public val answerDecimal: Float? = null,
  /**
   * Value for question comparison based on operator
   */
  public val answerInteger: Int? = null,
  /**
   * Value for question comparison based on operator
   */
  public val answerDate: String? = null,
  /**
   * Value for question comparison based on operator
   */
  public val answerDateTime: String? = null,
  /**
   * Value for question comparison based on operator
   */
  public val answerTime: String? = null,
  /**
   * Value for question comparison based on operator
   */
  public val answerString: String? = null,
  /**
   * Value for question comparison based on operator
   */
  public val answerCoding: Coding? = null,
  /**
   * Value for question comparison based on operator
   */
  public val answerQuantity: Quantity? = null,
  /**
   * Value for question comparison based on operator
   */
  public val answerReference: Reference? = null,
) : BackboneElement
