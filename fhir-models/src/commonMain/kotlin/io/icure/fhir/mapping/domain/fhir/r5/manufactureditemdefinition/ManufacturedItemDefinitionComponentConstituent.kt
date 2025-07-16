//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.manufactureditemdefinition

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A reference to a constituent of the manufactured item as a whole, linked here so that its
 * component location within the item can be indicated. This not where the item's ingredient are
 * primarily stated (for which see Ingredient.for or ManufacturedItemDefinition.ingredient)
 *
 * A reference to a constituent of the manufactured item as a whole, linked here so that its
 * component location within the item can be indicated. This not where the item's ingredient are
 * primarily stated (for which see Ingredient.for or ManufacturedItemDefinition.ingredient).
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("ManufacturedItemDefinitionComponentConstituent")
@Serializable
public data class ManufacturedItemDefinitionComponentConstituent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val amount: List<Quantity> = emptyList(),
  public val location: List<CodeableConcept> = emptyList(),
  public val function: List<CodeableConcept> = emptyList(),
  public val hasIngredient: List<CodeableReference> = emptyList(),
) : BackboneElement
