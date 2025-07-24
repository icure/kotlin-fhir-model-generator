//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.nutritionorder

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Diet, formula or nutritional supplement request
 *
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a
 * patient/resident.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param groupIdentifier Composite Request ID
 * @param status draft | active | on-hold | revoked | completed | entered-in-error | unknown
 * @param intent proposal | plan | directive | order | original-order | reflex-order | filler-order
 * | instance-order | option
 * @param priority routine | urgent | asap | stat
 * @param subject Who requires the diet, formula or nutritional supplement
 * @param encounter The encounter associated with this nutrition order
 * @param dateTime Date and time the nutrition order was requested
 * @param orderer Who ordered the diet, formula or nutritional supplement
 * @param outsideFoodAllowed Capture when a food item is brought in by the patient and/or family
 * @param oralDiet Oral diet components
 * @param enteralFormula Enteral formula components
 */
@SerialName("NutritionOrder")
@Serializable
public data class NutritionOrder(
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
  public val identifier: List<Identifier> = emptyList(),
  public val instantiatesCanonical: List<String> = emptyList(),
  public val instantiatesUri: List<String> = emptyList(),
  public val instantiates: List<String> = emptyList(),
  public val basedOn: List<Reference> = emptyList(),
  /**
   * Composite Request ID
   */
  public val groupIdentifier: Identifier? = null,
  /**
   * draft | active | on-hold | revoked | completed | entered-in-error | unknown
   */
  public val status: String? = null,
  /**
   * proposal | plan | directive | order | original-order | reflex-order | filler-order |
   * instance-order | option
   */
  public val intent: String? = null,
  /**
   * routine | urgent | asap | stat
   */
  public val priority: String? = null,
  /**
   * Who requires the diet, formula or nutritional supplement
   */
  public val subject: Reference,
  /**
   * The encounter associated with this nutrition order
   */
  public val encounter: Reference? = null,
  public val supportingInformation: List<Reference> = emptyList(),
  /**
   * Date and time the nutrition order was requested
   */
  public val dateTime: String? = null,
  /**
   * Who ordered the diet, formula or nutritional supplement
   */
  public val orderer: Reference? = null,
  public val performer: List<CodeableReference> = emptyList(),
  public val allergyIntolerance: List<Reference> = emptyList(),
  public val foodPreferenceModifier: List<CodeableConcept> = emptyList(),
  public val excludeFoodModifier: List<CodeableConcept> = emptyList(),
  /**
   * Capture when a food item is brought in by the patient and/or family
   */
  public val outsideFoodAllowed: Boolean? = null,
  /**
   * Oral diet components
   */
  public val oralDiet: NutritionOrderOralDiet? = null,
  public val supplement: List<NutritionOrderSupplement> = emptyList(),
  /**
   * Enteral formula components
   */
  public val enteralFormula: NutritionOrderEnteralFormula? = null,
  public val note: List<Annotation> = emptyList(),
) : DomainResource
