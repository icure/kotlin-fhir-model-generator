//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.packagedproductdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param quantity The quantity of this level of packaging in the package that contains it (with the
 * outermost level being 1)
 */
@SerialName("PackagedProductDefinitionPackage")
@Serializable
public data class PackagedProductDefinitionPackage(
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
   * The quantity of this level of packaging in the package that contains it (with the outermost
   * level being 1)
   */
  public val quantity: Int? = null,
  public val material: List<CodeableConcept> = emptyList(),
  public val alternateMaterial: List<CodeableConcept> = emptyList(),
  public val shelfLifeStorage: List<PackagedProductDefinitionPackageShelfLifeStorage> = emptyList(),
  public val manufacturer: List<Reference> = emptyList(),
  public val `property`: List<PackagedProductDefinitionPackageProperty> = emptyList(),
  public val containedItem: List<PackagedProductDefinitionPackageContainedItem> = emptyList(),
  @SerialName("package")
  public val package_fhir: List<PackagedProductDefinitionPackage> = emptyList(),
) : BackboneElement
