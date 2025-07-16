//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.packagedproductdefinition

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
 * @param amount The number of this type of item within this packaging
 */
@SerialName("PackagedProductDefinitionPackageContainedItem")
@Serializable
public data class PackagedProductDefinitionPackageContainedItem(
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
   * The number of this type of item within this packaging
   */
  public val amount: Quantity? = null,
) : BackboneElement
