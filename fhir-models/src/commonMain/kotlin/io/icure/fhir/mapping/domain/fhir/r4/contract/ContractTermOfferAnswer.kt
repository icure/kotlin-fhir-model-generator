//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.contract

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
 * Response to offer text
 *
 * Response to offer text.
 *
 * @param id Unique id for inter-element referencing
 * @param valueBoolean The actual answer response
 * @param valueDecimal The actual answer response
 * @param valueInteger The actual answer response
 * @param valueDate The actual answer response
 * @param valueDateTime The actual answer response
 * @param valueTime The actual answer response
 * @param valueString The actual answer response
 * @param valueUri The actual answer response
 * @param valueAttachment The actual answer response
 * @param valueCoding The actual answer response
 * @param valueQuantity The actual answer response
 * @param valueReference The actual answer response
 */
@SerialName("ContractTermOfferAnswer")
@Serializable
public data class ContractTermOfferAnswer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The actual answer response
   */
  public val valueBoolean: Boolean? = null,
  /**
   * The actual answer response
   */
  public val valueDecimal: Float? = null,
  /**
   * The actual answer response
   */
  public val valueInteger: Int? = null,
  /**
   * The actual answer response
   */
  public val valueDate: String? = null,
  /**
   * The actual answer response
   */
  public val valueDateTime: String? = null,
  /**
   * The actual answer response
   */
  public val valueTime: String? = null,
  /**
   * The actual answer response
   */
  public val valueString: String? = null,
  /**
   * The actual answer response
   */
  public val valueUri: String? = null,
  /**
   * The actual answer response
   */
  public val valueAttachment: Attachment? = null,
  /**
   * The actual answer response
   */
  public val valueCoding: Coding? = null,
  /**
   * The actual answer response
   */
  public val valueQuantity: Quantity? = null,
  /**
   * The actual answer response
   */
  public val valueReference: Reference? = null,
) : BackboneElement
