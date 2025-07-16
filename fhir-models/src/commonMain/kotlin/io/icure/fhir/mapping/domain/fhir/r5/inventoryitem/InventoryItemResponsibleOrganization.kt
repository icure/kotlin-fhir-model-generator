//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.inventoryitem

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
