//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.inventoryreport

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An inventory listing section (grouped by any of the attributes)
 *
 * An inventory listing section (grouped by any of the attributes).
 *
 * @param id Unique id for inter-element referencing
 * @param location Location of the inventory items
 * @param itemStatus The status of the items that are being reported
 * @param countingDateTime The date and time when the items were counted
 */
@SerialName("InventoryReportInventoryListing")
@Serializable
public data class InventoryReportInventoryListing(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Location of the inventory items
   */
  public val location: Reference? = null,
  /**
   * The status of the items that are being reported
   */
  public val itemStatus: CodeableConcept? = null,
  /**
   * The date and time when the items were counted
   */
  public val countingDateTime: String? = null,
  public val item: List<InventoryReportInventoryListingItem> = emptyList(),
) : BackboneElement
