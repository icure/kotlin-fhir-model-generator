//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.packagedproductdefinition

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The item(s) within the packaging
 *
 * The item(s) within the packaging.
 *
 * @param id Unique id for inter-element referencing
 * @param item The actual item(s) of medication, as manufactured, or a device, or other medically
 * related item (food, biologicals, raw materials, medical fluids, gases etc.), as contained in the
 * package
 * @param amount The number of this type of item within this packaging or for continuous items such
 * as liquids it is the quantity (for example 25ml). See also
 * PackagedProductDefinition.containedItemQuantity (especially the long definition)
 */
@SerialName("PackagedProductDefinitionPackagingContainedItem")
@Serializable
public data class PackagedProductDefinitionPackagingContainedItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The actual item(s) of medication, as manufactured, or a device, or other medically related item
   * (food, biologicals, raw materials, medical fluids, gases etc.), as contained in the package
   */
  public val item: CodeableReference,
  /**
   * The number of this type of item within this packaging or for continuous items such as liquids
   * it is the quantity (for example 25ml). See also PackagedProductDefinition.containedItemQuantity
   * (especially the long definition)
   */
  public val amount: Quantity? = null,
) : BackboneElement
