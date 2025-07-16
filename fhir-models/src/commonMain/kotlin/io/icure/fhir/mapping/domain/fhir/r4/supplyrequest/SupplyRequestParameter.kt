//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.supplyrequest

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.range.Range
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Ordered item details
 *
 * Specific parameters for the ordered item.  For example, the size of the indicated item.
 *
 * @param id Unique id for inter-element referencing
 * @param code Item detail
 * @param valueCodeableConcept Value of detail
 * @param valueQuantity Value of detail
 * @param valueRange Value of detail
 * @param valueBoolean Value of detail
 */
@SerialName("SupplyRequestParameter")
@Serializable
public data class SupplyRequestParameter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Item detail
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
