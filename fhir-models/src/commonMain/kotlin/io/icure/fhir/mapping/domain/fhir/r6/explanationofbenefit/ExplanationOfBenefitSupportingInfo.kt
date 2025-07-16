//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.explanationofbenefit

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Supporting information
 *
 * Additional information codes regarding exceptions, special considerations, the condition,
 * situation, prior or concurrent issues.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Information instance identifier
 * @param category Classification of the supplied information
 * @param code Type of information
 * @param timingDate When it occurred
 * @param timingPeriod When it occurred
 * @param valueBoolean Data to be provided
 * @param valueString Data to be provided
 * @param valueQuantity Data to be provided
 * @param valueAttachment Data to be provided
 * @param valueReference Data to be provided
 * @param valueIdentifier Data to be provided
 * @param reason Explanation for the information
 */
@SerialName("ExplanationOfBenefitSupportingInfo")
@Serializable
public data class ExplanationOfBenefitSupportingInfo(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Information instance identifier
   */
  public val sequence: Int? = null,
  /**
   * Classification of the supplied information
   */
  public val category: CodeableConcept,
  /**
   * Type of information
   */
  public val code: CodeableConcept? = null,
  /**
   * When it occurred
   */
  public val timingDate: String? = null,
  /**
   * When it occurred
   */
  public val timingPeriod: Period? = null,
  /**
   * Data to be provided
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Data to be provided
   */
  public val valueString: String? = null,
  /**
   * Data to be provided
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Data to be provided
   */
  public val valueAttachment: Attachment? = null,
  /**
   * Data to be provided
   */
  public val valueReference: Reference? = null,
  /**
   * Data to be provided
   */
  public val valueIdentifier: Identifier? = null,
  /**
   * Explanation for the information
   */
  public val reason: Coding? = null,
) : BackboneElement
