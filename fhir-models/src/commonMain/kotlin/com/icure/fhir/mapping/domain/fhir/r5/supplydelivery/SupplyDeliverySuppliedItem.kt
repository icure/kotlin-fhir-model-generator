//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.supplydelivery

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param quantity Amount supplied
 * @param itemCodeableConcept Medication, Substance, Device or Biologically Derived Product supplied
 * @param itemReference Medication, Substance, Device or Biologically Derived Product supplied
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
   * Amount supplied
   */
  public val quantity: Quantity? = null,
  /**
   * Medication, Substance, Device or Biologically Derived Product supplied
   */
  public val itemCodeableConcept: CodeableConcept? = null,
  /**
   * Medication, Substance, Device or Biologically Derived Product supplied
   */
  public val itemReference: Reference? = null,
) : BackboneElement
