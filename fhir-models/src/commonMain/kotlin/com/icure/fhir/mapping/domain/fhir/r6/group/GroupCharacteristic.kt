//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.group

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r6.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.range.Range
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r6.relativetime.RelativeTime
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Include / Exclude group members by Trait
 *
 * Identifies traits whose presence r absence is shared by members of the group.
 *
 * @param id Unique id for inter-element referencing
 * @param code Kind of characteristic
 * @param valueCodeableConcept Value held by characteristic
 * @param valueBoolean Value held by characteristic
 * @param valueQuantity Value held by characteristic
 * @param valueRange Value held by characteristic
 * @param valueReference Value held by characteristic
 * @param valueUri Value held by characteristic
 * @param valueExpression Value held by characteristic
 * @param exclude Group includes or excludes
 * @param description Natural language description of the characteristic
 * @param determinedByReference Defines the characteristic
 * @param determinedByExpression Defines the characteristic
 * @param offset Reference point for comparison
 * @param instancesQuantity Number of occurrences meeting the characteristic
 * @param instancesRange Number of occurrences meeting the characteristic
 * @param durationDuration Length of time in which the characteristic is met
 * @param durationRange Length of time in which the characteristic is met
 * @param period Period over which characteristic is tested
 */
@SerialName("GroupCharacteristic")
@Serializable
public data class GroupCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Kind of characteristic
   */
  public val code: CodeableConcept,
  /**
   * Value held by characteristic
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Value held by characteristic
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Value held by characteristic
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Value held by characteristic
   */
  public val valueRange: Range? = null,
  /**
   * Value held by characteristic
   */
  public val valueReference: Reference? = null,
  /**
   * Value held by characteristic
   */
  public val valueUri: String? = null,
  /**
   * Value held by characteristic
   */
  public val valueExpression: Expression? = null,
  /**
   * Group includes or excludes
   */
  public val exclude: Boolean? = null,
  /**
   * Natural language description of the characteristic
   */
  public val description: String? = null,
  public val method: List<CodeableConcept> = emptyList(),
  /**
   * Defines the characteristic
   */
  public val determinedByReference: Reference? = null,
  /**
   * Defines the characteristic
   */
  public val determinedByExpression: Expression? = null,
  /**
   * Reference point for comparison
   */
  public val offset: CodeableConcept? = null,
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
  public val durationDuration: Duration? = null,
  /**
   * Length of time in which the characteristic is met
   */
  public val durationRange: Range? = null,
  /**
   * Period over which characteristic is tested
   */
  public val period: Period? = null,
  public val timing: List<RelativeTime> = emptyList(),
) : BackboneElement
