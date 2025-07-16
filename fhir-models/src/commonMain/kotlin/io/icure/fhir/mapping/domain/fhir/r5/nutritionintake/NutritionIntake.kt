//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.nutritionintake

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Record of food or fluid being taken by a patient
 *
 * A record of food or fluid that is being consumed by a patient.   A NutritionIntake may indicate
 * that the patient may be consuming the food or fluid now or has consumed the food or fluid in the
 * past.  The source of this information can be the patient, significant other (such as a family member
 * or spouse), or a clinician.  A common scenario where this information is captured is during the
 * history taking process during a patient visit or stay or through an app that tracks food or fluids
 * consumed.   The consumption information may come from sources such as the patient's memory, from a
 * nutrition label,  or from a clinician documenting observed intake.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status preparation | in-progress | not-done | on-hold | stopped | completed |
 * entered-in-error | unknown
 * @param code Code representing an overall type of nutrition intake
 * @param subject Who is/was consuming the food or fluid
 * @param encounter Encounter associated with NutritionIntake
 * @param occurrenceDateTime The date/time or interval when the food or fluid is/was consumed
 * @param occurrencePeriod The date/time or interval when the food or fluid is/was consumed
 * @param recorded When the intake was recorded
 * @param reportedBoolean Person or organization that provided the information about the consumption
 * of this food or fluid
 * @param reportedReference Person or organization that provided the information about the
 * consumption of this food or fluid
 * @param location Where the intake occurred
 */
@SerialName("NutritionIntake")
@Serializable
public data class NutritionIntake(
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
  public val basedOn: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * preparation | in-progress | not-done | on-hold | stopped | completed | entered-in-error |
   * unknown
   */
  public val status: String? = null,
  public val statusReason: List<CodeableConcept> = emptyList(),
  /**
   * Code representing an overall type of nutrition intake
   */
  public val code: CodeableConcept? = null,
  /**
   * Who is/was consuming the food or fluid
   */
  public val subject: Reference,
  /**
   * Encounter associated with NutritionIntake
   */
  public val encounter: Reference? = null,
  /**
   * The date/time or interval when the food or fluid is/was consumed
   */
  public val occurrenceDateTime: String? = null,
  /**
   * The date/time or interval when the food or fluid is/was consumed
   */
  public val occurrencePeriod: Period? = null,
  /**
   * When the intake was recorded
   */
  public val recorded: String? = null,
  /**
   * Person or organization that provided the information about the consumption of this food or
   * fluid
   */
  public val reportedBoolean: Boolean? = null,
  /**
   * Person or organization that provided the information about the consumption of this food or
   * fluid
   */
  public val reportedReference: Reference? = null,
  public val consumedItem: List<NutritionIntakeConsumedItem> = emptyList(),
  public val ingredientLabel: List<NutritionIntakeIngredientLabel> = emptyList(),
  public val performer: List<NutritionIntakePerformer> = emptyList(),
  /**
   * Where the intake occurred
   */
  public val location: Reference? = null,
  public val derivedFrom: List<Reference> = emptyList(),
  public val reason: List<CodeableReference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
