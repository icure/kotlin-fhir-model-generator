//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.inventoryitem

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A functional description of an inventory item used in inventory and supply-related workflows
 *
 * A functional description of an inventory item used in inventory and supply-related workflows.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | inactive | entered-in-error | unknown
 * @param description Descriptive characteristics of the item
 * @param baseUnit The base unit of measure - the unit in which the product is used or counted
 * @param netContent Net content or amount present in the item
 * @param instance Instances or occurrences of the product
 * @param productReference Link to a product resource used in clinical workflows
 */
@SerialName("InventoryItem")
@Serializable
public data class InventoryItem(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * active | inactive | entered-in-error | unknown
   */
  public val status: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  public val code: List<CodeableConcept> = emptyList(),
  public val name: List<InventoryItemName> = emptyList(),
  public val responsibleOrganization: List<InventoryItemResponsibleOrganization> = emptyList(),
  /**
   * Descriptive characteristics of the item
   */
  public val description: InventoryItemDescription? = null,
  public val inventoryStatus: List<CodeableConcept> = emptyList(),
  /**
   * The base unit of measure - the unit in which the product is used or counted
   */
  public val baseUnit: CodeableConcept? = null,
  /**
   * Net content or amount present in the item
   */
  public val netContent: Quantity? = null,
  public val association: List<InventoryItemAssociation> = emptyList(),
  public val characteristic: List<InventoryItemCharacteristic> = emptyList(),
  /**
   * Instances or occurrences of the product
   */
  public val instance: InventoryItemInstance? = null,
  /**
   * Link to a product resource used in clinical workflows
   */
  public val productReference: Reference? = null,
) : DomainResource
