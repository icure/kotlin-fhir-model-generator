//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.ingredient

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An organization that manufactures this ingredient
 *
 * The organization(s) that manufacture this ingredient. Can be used to indicate:         1)
 * Organizations we are aware of that manufacture this ingredient         2) Specific Manufacturer(s)
 * currently being used         3) Set of organisations allowed to manufacture this ingredient for this
 * product         Users must be clear on the application of context relevant to their use case.
 *
 * @param id Unique id for inter-element referencing
 * @param role allowed | possible | actual
 * @param manufacturer An organization that manufactures this ingredient
 */
@SerialName("IngredientManufacturer")
@Serializable
public data class IngredientManufacturer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * allowed | possible | actual
   */
  public val role: String? = null,
  /**
   * An organization that manufactures this ingredient
   */
  public val manufacturer: Reference,
) : BackboneElement
