//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproductmanufactured

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.prodcharacteristic.ProdCharacteristic
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The manufactured item as contained in the packaged medicinal product
 *
 * The manufactured item as contained in the packaged medicinal product.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param manufacturedDoseForm Dose form as manufactured and before any transformation into the
 * pharmaceutical product
 * @param unitOfPresentation The “real world” units in which the quantity of the manufactured item
 * is described
 * @param quantity The quantity or "count number" of the manufactured item
 * @param physicalCharacteristics Dimensions, color etc.
 */
@SerialName("MedicinalProductManufactured")
@Serializable
public data class MedicinalProductManufactured(
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
  /**
   * Dose form as manufactured and before any transformation into the pharmaceutical product
   */
  public val manufacturedDoseForm: CodeableConcept,
  /**
   * The “real world” units in which the quantity of the manufactured item is described
   */
  public val unitOfPresentation: CodeableConcept? = null,
  /**
   * The quantity or "count number" of the manufactured item
   */
  public val quantity: Quantity,
  public val manufacturer: List<Reference> = emptyList(),
  public val ingredient: List<Reference> = emptyList(),
  /**
   * Dimensions, color etc.
   */
  public val physicalCharacteristics: ProdCharacteristic? = null,
  public val otherCharacteristics: List<CodeableConcept> = emptyList(),
) : DomainResource
