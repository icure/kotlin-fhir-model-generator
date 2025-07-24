//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.inventoryreport

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
