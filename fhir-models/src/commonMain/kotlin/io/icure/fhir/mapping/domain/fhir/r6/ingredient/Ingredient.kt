//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.ingredient

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

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
 * @param identifier An identifier or code by which the ingredient can be referenced
 * @param status draft | active | retired | unknown
 * @param role Purpose of the ingredient within the product, e.g. active, inactive
 * @param group A classification of the ingredient according to where in the physical item it tends
 * to be used, such the outer shell of a tablet, inner body or ink
 * @param allergenicIndicator If the ingredient is a known or suspected allergen
 * @param comment A place for providing any notes that are relevant to the component, e.g. removed
 * during process, adjusted for loss on drying
 * @param substance The substance that comprises this ingredient
 */
@SerialName("Ingredient")
@Serializable
public data class Ingredient(
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
   * An identifier or code by which the ingredient can be referenced
   */
  public val identifier: Identifier? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  @JsonNames("for")
  public val for_fhir: List<Reference> = emptyList(),
  /**
   * Purpose of the ingredient within the product, e.g. active, inactive
   */
  public val role: CodeableConcept,
  public val function: List<CodeableConcept> = emptyList(),
  /**
   * A classification of the ingredient according to where in the physical item it tends to be used,
   * such the outer shell of a tablet, inner body or ink
   */
  public val group: CodeableConcept? = null,
  /**
   * If the ingredient is a known or suspected allergen
   */
  public val allergenicIndicator: Boolean? = null,
  /**
   * A place for providing any notes that are relevant to the component, e.g. removed during
   * process, adjusted for loss on drying
   */
  public val comment: String? = null,
  public val manufacturer: List<IngredientManufacturer> = emptyList(),
  /**
   * The substance that comprises this ingredient
   */
  public val substance: IngredientSubstance,
) : DomainResource
