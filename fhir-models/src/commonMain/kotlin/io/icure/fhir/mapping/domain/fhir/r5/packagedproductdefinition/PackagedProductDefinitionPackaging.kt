//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.packagedproductdefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.productshelflife.ProductShelfLife
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A packaging item, as a container for medically related items, possibly with other packaging items
 * within, or a packaging component, such as bottle cap
 *
 * A packaging item, as a container for medically related items, possibly with other packaging items
 * within, or a packaging component, such as bottle cap (which is not a device or a medication
 * manufactured item).
 *
 * @param id Unique id for inter-element referencing
 * @param type The physical type of the container of the items
 * @param componentPart Is this a part of the packaging (e.g. a cap or bottle stopper), rather than
 * the packaging itself (e.g. a bottle or vial)
 * @param quantity The quantity of this level of packaging in the package that contains it (with the
 * outermost level being 1)
 */
@SerialName("PackagedProductDefinitionPackaging")
@Serializable
public data class PackagedProductDefinitionPackaging(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * The physical type of the container of the items
   */
  public val type: CodeableConcept? = null,
  /**
   * Is this a part of the packaging (e.g. a cap or bottle stopper), rather than the packaging
   * itself (e.g. a bottle or vial)
   */
  public val componentPart: Boolean? = null,
  /**
   * The quantity of this level of packaging in the package that contains it (with the outermost
   * level being 1)
   */
  public val quantity: Int? = null,
  public val material: List<CodeableConcept> = emptyList(),
  public val alternateMaterial: List<CodeableConcept> = emptyList(),
  public val shelfLifeStorage: List<ProductShelfLife> = emptyList(),
  public val manufacturer: List<Reference> = emptyList(),
  public val `property`: List<PackagedProductDefinitionPackagingProperty> = emptyList(),
  public val containedItem: List<PackagedProductDefinitionPackagingContainedItem> = emptyList(),
  public val packaging: List<PackagedProductDefinitionPackaging> = emptyList(),
) : BackboneElement
