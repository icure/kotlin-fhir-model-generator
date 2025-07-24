//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.evidencevariable

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A defining factor of the EvidenceVariable
 *
 * A defining factor of the EvidenceVariable. Multiple characteristics are applied with "and"
 * semantics.
 *
 * @param id Unique id for inter-element referencing
 * @param linkId Label for internal linking
 * @param description Natural language description of the characteristic
 * @param exclude Whether the characteristic is an inclusion criterion or exclusion criterion
 * @param definitionReference Defines the characteristic (without using type and value) by a
 * Reference
 * @param definitionCanonical Defines the characteristic (without using type and value) by a
 * Canonical
 * @param definitionCodeableConcept Defines the characteristic (without using type and value) by a
 * CodeableConcept
 * @param definitionExpression Defines the characteristic (without using type and value) by an
 * expression
 * @param definitionId Defines the characteristic (without using type and value) by an id
 * @param definitionByTypeAndValue Defines the characteristic using type and value
 * @param definitionByCombination Used to specify how two or more characteristics are combined
 * @param instancesQuantity Number of occurrences meeting the characteristic
 * @param instancesRange Number of occurrences meeting the characteristic
 * @param durationQuantity Length of time in which the characteristic is met
 * @param durationRange Length of time in which the characteristic is met
 */
@SerialName("EvidenceVariableCharacteristic")
@Serializable
public data class EvidenceVariableCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Label for internal linking
   */
  public val linkId: String? = null,
  /**
   * Natural language description of the characteristic
   */
  public val description: String? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * Whether the characteristic is an inclusion criterion or exclusion criterion
   */
  public val exclude: Boolean? = null,
  /**
   * Defines the characteristic (without using type and value) by a Reference
   */
  public val definitionReference: Reference? = null,
  /**
   * Defines the characteristic (without using type and value) by a Canonical
   */
  public val definitionCanonical: String? = null,
  /**
   * Defines the characteristic (without using type and value) by a CodeableConcept
   */
  public val definitionCodeableConcept: CodeableConcept? = null,
  /**
   * Defines the characteristic (without using type and value) by an expression
   */
  public val definitionExpression: Expression? = null,
  /**
   * Defines the characteristic (without using type and value) by an id
   */
  public val definitionId: String? = null,
  /**
   * Defines the characteristic using type and value
   */
  public val definitionByTypeAndValue: EvidenceVariableCharacteristicDefinitionByTypeAndValue? =
      null,
  /**
   * Used to specify how two or more characteristics are combined
   */
  public val definitionByCombination: EvidenceVariableCharacteristicDefinitionByCombination? = null,
  /**
   * Number of occurrences meeting the characteristic
   */
  public val instancesQuantity: Quantity? = null,
  /**
   * Number of occurrences meeting the characteristic
   */
  public val instancesRange: Range? = null,
  /**
   * Length of time in which the characteristic is met
   */
  public val durationQuantity: Quantity? = null,
  /**
   * Length of time in which the characteristic is met
   */
  public val durationRange: Range? = null,
  public val timeFromEvent: List<EvidenceVariableCharacteristicTimeFromEvent> = emptyList(),
) : BackboneElement
