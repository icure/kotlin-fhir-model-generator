//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.nutritionproduct

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A product used for nutritional purposes (i.e. food or supplement)
 *
 * A food or supplement that is consumed by patients.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param code A code that can identify the detailed nutrients and ingredients in a specific food
 * product
 * @param status active | inactive | entered-in-error
 */
@SerialName("NutritionProduct")
@Serializable
public data class NutritionProduct(
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
   * A code that can identify the detailed nutrients and ingredients in a specific food product
   */
  public val code: CodeableConcept? = null,
  /**
   * active | inactive | entered-in-error
   */
  public val status: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  public val manufacturer: List<Reference> = emptyList(),
  public val nutrient: List<NutritionProductNutrient> = emptyList(),
  public val ingredient: List<NutritionProductIngredient> = emptyList(),
  public val knownAllergen: List<CodeableReference> = emptyList(),
  public val characteristic: List<NutritionProductCharacteristic> = emptyList(),
  public val instance: List<NutritionProductInstance> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
