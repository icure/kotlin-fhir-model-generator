//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.inventoryitem

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.ratio.Ratio
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Association with other items or products
 *
 * Association with other items or products.
 *
 * @param id Unique id for inter-element referencing
 * @param associationType The type of association between the device and the other item
 * @param relatedItem The related item or product
 * @param quantity The quantity of the product in this product
 */
@SerialName("InventoryItemAssociation")
@Serializable
public data class InventoryItemAssociation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of association between the device and the other item
   */
  public val associationType: CodeableConcept,
  /**
   * The related item or product
   */
  public val relatedItem: Reference,
  /**
   * The quantity of the product in this product
   */
  public val quantity: Ratio,
) : BackboneElement
