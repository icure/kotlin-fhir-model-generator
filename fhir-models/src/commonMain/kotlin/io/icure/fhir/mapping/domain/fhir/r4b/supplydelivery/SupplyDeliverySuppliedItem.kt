//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.supplydelivery

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
