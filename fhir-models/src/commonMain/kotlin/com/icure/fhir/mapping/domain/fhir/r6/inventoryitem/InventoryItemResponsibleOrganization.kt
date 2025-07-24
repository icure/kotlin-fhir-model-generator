//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.inventoryitem

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Organization(s) responsible for the product
 *
 * Organization(s) responsible for the product.
 *
 * @param id Unique id for inter-element referencing
 * @param role The role of the organization e.g. manufacturer, distributor, or other
 * @param organization An organization that is associated with the item
 */
@SerialName("InventoryItemResponsibleOrganization")
@Serializable
public data class InventoryItemResponsibleOrganization(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The role of the organization e.g. manufacturer, distributor, or other
   */
  public val role: CodeableConcept,
  /**
   * An organization that is associated with the item
   */
  public val organization: Reference,
) : BackboneElement
