//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.nutritionorder

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param status draft | active | on-hold | revoked | completed | entered-in-error | unknown
 * @param intent proposal | plan | directive | order | original-order | reflex-order | filler-order
 * | instance-order | option
 * @param patient The person who requires the diet, formula or nutritional supplement
 * @param encounter The encounter associated with this nutrition order
 * @param dateTime Date and time the nutrition order was requested
 * @param orderer Who ordered the diet, formula or nutritional supplement
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
   * The person who requires the diet, formula or nutritional supplement
   */
  public val patient: Reference,
  /**
   * The encounter associated with this nutrition order
   */
  public val encounter: Reference? = null,
  /**
   * Date and time the nutrition order was requested
   */
  public val dateTime: String? = null,
  /**
   * Who ordered the diet, formula or nutritional supplement
   */
  public val orderer: Reference? = null,
  public val allergyIntolerance: List<Reference> = emptyList(),
  public val foodPreferenceModifier: List<CodeableConcept> = emptyList(),
  public val excludeFoodModifier: List<CodeableConcept> = emptyList(),
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
