//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.clinicalusedefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.range.Range
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specifics for when this is an indication
 *
 * Specifics for when this is an indication.
 *
 * @param id Unique id for inter-element referencing
 * @param diseaseSymptomProcedure The situation that is being documented as an indicaton for this
 * item
 * @param diseaseStatus The status of the disease or symptom for the indication
 * @param intendedEffect The intended effect, aim or strategy to be achieved
 * @param durationRange Timing or duration information
 * @param durationString Timing or duration information
 * @param applicability An expression that returns true or false, indicating whether the indication
 * is applicable or not, after having applied its other elements
 */
@SerialName("ClinicalUseDefinitionIndication")
@Serializable
public data class ClinicalUseDefinitionIndication(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The situation that is being documented as an indicaton for this item
   */
  public val diseaseSymptomProcedure: CodeableReference? = null,
  /**
   * The status of the disease or symptom for the indication
   */
  public val diseaseStatus: CodeableReference? = null,
  public val comorbidity: List<CodeableReference> = emptyList(),
  /**
   * The intended effect, aim or strategy to be achieved
   */
  public val intendedEffect: CodeableReference? = null,
  /**
   * Timing or duration information
   */
  public val durationRange: Range? = null,
  /**
   * Timing or duration information
   */
  public val durationString: String? = null,
  public val undesirableEffect: List<Reference> = emptyList(),
  /**
   * An expression that returns true or false, indicating whether the indication is applicable or
   * not, after having applied its other elements
   */
  public val applicability: Expression? = null,
  public val otherTherapy: List<ClinicalUseDefinitionContraindicationOtherTherapy> = emptyList(),
) : BackboneElement
