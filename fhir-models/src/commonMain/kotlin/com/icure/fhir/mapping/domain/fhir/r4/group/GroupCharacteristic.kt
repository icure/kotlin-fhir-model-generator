//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.group

import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.range.Range
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
