//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.supplydelivery

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The item that is delivered or supplied
 *
 * The item that is being delivered or has been supplied.
 *
 * @param id Unique id for inter-element referencing
 * @param quantity Amount dispensed
 * @param itemCodeableConcept Medication, Substance, or Device supplied
 * @param itemReference Medication, Substance, or Device supplied
 */
@SerialName("SupplyDeliverySuppliedItem")
@Serializable
public data class SupplyDeliverySuppliedItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Amount dispensed
   */
  public val quantity: Quantity? = null,
  /**
   * Medication, Substance, or Device supplied
   */
  public val itemCodeableConcept: CodeableConcept? = null,
  /**
   * Medication, Substance, or Device supplied
   */
  public val itemReference: Reference? = null,
) : BackboneElement
