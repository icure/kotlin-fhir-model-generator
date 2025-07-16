//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.group

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.range.Range
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param exclude Group includes or excludes
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
   * Group includes or excludes
   */
  public val exclude: Boolean? = null,
  /**
   * Period over which characteristic is tested
   */
  public val period: Period? = null,
) : BackboneElement
