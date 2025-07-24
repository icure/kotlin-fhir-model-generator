//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.devicerequest

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.range.Range
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Device details
 *
 * Specific parameters for the ordered item.  For example, the prism value for lenses.
 *
 * @param id Unique id for inter-element referencing
 * @param code Device detail
 * @param valueCodeableConcept Value of detail
 * @param valueQuantity Value of detail
 * @param valueRange Value of detail
 * @param valueBoolean Value of detail
 */
@SerialName("DeviceRequestParameter")
@Serializable
public data class DeviceRequestParameter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Device detail
   */
  public val code: CodeableConcept? = null,
  /**
   * Value of detail
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Value of detail
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Value of detail
   */
  public val valueRange: Range? = null,
  /**
   * Value of detail
   */
  public val valueBoolean: Boolean? = null,
) : BackboneElement
