//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.inventoryitem

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The item name(s) - the brand name, or common name, functional name, generic name or others
 *
 * The item name(s) - the brand name, or common name, functional name, generic name.
 *
 * @param id Unique id for inter-element referencing
 * @param nameType The type of name e.g. 'brand-name', 'functional-name', 'common-name'
 * @param language The language used to express the item name
 * @param name The name or designation of the item
 */
@SerialName("InventoryItemName")
@Serializable
public data class InventoryItemName(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of name e.g. 'brand-name', 'functional-name', 'common-name'
   */
  public val nameType: Coding,
  /**
   * The language used to express the item name
   */
  public val language: String? = null,
  /**
   * The name or designation of the item
   */
  public val name: String? = null,
) : BackboneElement
