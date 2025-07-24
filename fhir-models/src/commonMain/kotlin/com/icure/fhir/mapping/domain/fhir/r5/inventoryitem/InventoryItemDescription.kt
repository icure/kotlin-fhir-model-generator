//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.inventoryitem

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Descriptive characteristics of the item
 *
 * The descriptive characteristics of the inventory item.
 *
 * @param id Unique id for inter-element referencing
 * @param language The language that is used in the item description
 * @param description Textual description of the item
 */
@SerialName("InventoryItemDescription")
@Serializable
public data class InventoryItemDescription(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The language that is used in the item description
   */
  public val language: String? = null,
  /**
   * Textual description of the item
   */
  public val description: String? = null,
) : BackboneElement
