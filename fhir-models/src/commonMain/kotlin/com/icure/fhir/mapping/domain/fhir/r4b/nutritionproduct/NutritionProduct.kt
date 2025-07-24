//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.nutritionproduct

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A product used for nutritional purposes
 *
 * A food or fluid product that is consumed by patients.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | inactive | entered-in-error
 * @param code A code designating a specific type of nutritional product
 * @param instance One or several physical instances or occurrences of the nutrition product
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
   * active | inactive | entered-in-error
   */
  public val status: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * A code designating a specific type of nutritional product
   */
  public val code: CodeableConcept? = null,
  public val manufacturer: List<Reference> = emptyList(),
  public val nutrient: List<NutritionProductNutrient> = emptyList(),
  public val ingredient: List<NutritionProductIngredient> = emptyList(),
  public val knownAllergen: List<CodeableReference> = emptyList(),
  public val productCharacteristic: List<NutritionProductProductCharacteristic> = emptyList(),
  /**
   * One or several physical instances or occurrences of the nutrition product
   */
  public val instance: NutritionProductInstance? = null,
  public val note: List<Annotation> = emptyList(),
) : DomainResource
