//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.inventoryreport

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The item or items in this listing
 *
 * The item or items in this listing.
 *
 * @param id Unique id for inter-element referencing
 * @param category The inventory category or classification of the items being reported
 * @param quantity The quantity of the item or items being reported
 * @param item The code or reference to the item type
 */
@SerialName("InventoryReportInventoryListingItem")
@Serializable
public data class InventoryReportInventoryListingItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The inventory category or classification of the items being reported
   */
  public val category: CodeableConcept? = null,
  /**
   * The quantity of the item or items being reported
   */
  public val quantity: Quantity,
  /**
   * The code or reference to the item type
   */
  public val item: CodeableReference,
) : BackboneElement
