//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproductpackaged

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.prodcharacteristic.ProdCharacteristic
import io.icure.fhir.mapping.domain.fhir.r4.productshelflife.ProductShelfLife
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A packaging item, as a contained for medicine, possibly with other packaging items within
 *
 * A packaging item, as a contained for medicine, possibly with other packaging items within.
 *
 * @param id Unique id for inter-element referencing
 * @param type The physical type of the container of the medicine
 * @param quantity The quantity of this package in the medicinal product, at the current level of
 * packaging. The outermost is always 1
 * @param physicalCharacteristics Dimensions, color etc.
 */
@SerialName("MedicinalProductPackagedPackageItem")
@Serializable
public data class MedicinalProductPackagedPackageItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * The physical type of the container of the medicine
   */
  public val type: CodeableConcept,
  /**
   * The quantity of this package in the medicinal product, at the current level of packaging. The
   * outermost is always 1
   */
  public val quantity: Quantity,
  public val material: List<CodeableConcept> = emptyList(),
  public val alternateMaterial: List<CodeableConcept> = emptyList(),
  public val device: List<Reference> = emptyList(),
  public val manufacturedItem: List<Reference> = emptyList(),
  public val packageItem: List<MedicinalProductPackagedPackageItem> = emptyList(),
  /**
   * Dimensions, color etc.
   */
  public val physicalCharacteristics: ProdCharacteristic? = null,
  public val otherCharacteristics: List<CodeableConcept> = emptyList(),
  public val shelfLifeStorage: List<ProductShelfLife> = emptyList(),
  public val manufacturer: List<Reference> = emptyList(),
) : BackboneElement
