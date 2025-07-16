//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproductingredient

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An ingredient of a manufactured item or pharmaceutical product
 *
 * An ingredient of a manufactured item or pharmaceutical product.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param identifier Identifier for the ingredient
 * @param role Ingredient role e.g. Active ingredient, excipient
 * @param allergenicIndicator If the ingredient is a known or suspected allergen
 * @param substance The ingredient substance
 */
@SerialName("MedicinalProductIngredient")
@Serializable
public data class MedicinalProductIngredient(
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
   * Identifier for the ingredient
   */
  public val identifier: Identifier? = null,
  /**
   * Ingredient role e.g. Active ingredient, excipient
   */
  public val role: CodeableConcept,
  /**
   * If the ingredient is a known or suspected allergen
   */
  public val allergenicIndicator: Boolean? = null,
  public val manufacturer: List<Reference> = emptyList(),
  public val specifiedSubstance: List<MedicinalProductIngredientSpecifiedSubstance> = emptyList(),
  /**
   * The ingredient substance
   */
  public val substance: MedicinalProductIngredientSubstance? = null,
) : DomainResource
