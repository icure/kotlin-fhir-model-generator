//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.evidence

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.range.Range
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An aspect of the statistical model
 *
 * A component of the method to generate the statistic.
 *
 * @param id Unique id for inter-element referencing
 * @param conditionCodeableConcept When this characteristic is used
 * @param conditionExpression When this characteristic is used
 * @param code Model specification
 * @param valueQuantity The specific value (when paired with code)
 * @param valueRange The specific value (when paired with code)
 * @param valueCodeableConcept The specific value (when paired with code)
 * @param intended The plan for analysis
 * @param applied The analysis that was applied
 */
@SerialName("EvidenceStatisticModelCharacteristic")
@Serializable
public data class EvidenceStatisticModelCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * When this characteristic is used
   */
  public val conditionCodeableConcept: CodeableConcept? = null,
  /**
   * When this characteristic is used
   */
  public val conditionExpression: Expression? = null,
  /**
   * Model specification
   */
  public val code: CodeableConcept,
  /**
   * The specific value (when paired with code)
   */
  public val valueQuantity: Quantity? = null,
  /**
   * The specific value (when paired with code)
   */
  public val valueRange: Range? = null,
  /**
   * The specific value (when paired with code)
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * The plan for analysis
   */
  public val intended: Boolean? = null,
  /**
   * The analysis that was applied
   */
  public val applied: Boolean? = null,
  public val variable: List<EvidenceStatisticModelCharacteristicVariable> = emptyList(),
  public val attributeEstimate: List<EvidenceStatisticAttributeEstimate> = emptyList(),
  public val modelCharacteristic: List<EvidenceStatisticModelCharacteristic> = emptyList(),
) : BackboneElement
