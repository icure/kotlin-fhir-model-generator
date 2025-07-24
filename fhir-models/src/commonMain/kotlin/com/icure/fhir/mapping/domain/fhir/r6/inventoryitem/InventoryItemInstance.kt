//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.inventoryitem

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Instances or occurrences of the product
 *
 * Instances or occurrences of the product.
 *
 * @param id Unique id for inter-element referencing
 * @param lotNumber The lot or batch number of the item
 * @param expiry The expiry date or date and time for the product
 * @param subject The subject that the item is associated with
 * @param location The location that the item is associated with
 */
@SerialName("InventoryItemInstance")
@Serializable
public data class InventoryItemInstance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * The lot or batch number of the item
   */
  public val lotNumber: String? = null,
  /**
   * The expiry date or date and time for the product
   */
  public val expiry: String? = null,
  /**
   * The subject that the item is associated with
   */
  public val subject: Reference? = null,
  /**
   * The location that the item is associated with
   */
  public val location: Reference? = null,
) : BackboneElement
