//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.effectevidencesynthesis

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What was the estimated effect
 *
 * The estimated effect of the exposure variant.
 *
 * @param id Unique id for inter-element referencing
 * @param description Description of effect estimate
 * @param type Type of efffect estimate
 * @param variantState Variant exposure states
 * @param value Point estimate
 * @param unitOfMeasure What unit is the outcome described in?
 */
@SerialName("EffectEvidenceSynthesisEffectEstimate")
@Serializable
public data class EffectEvidenceSynthesisEffectEstimate(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of effect estimate
   */
  public val description: String? = null,
  /**
   * Type of efffect estimate
   */
  public val type: CodeableConcept? = null,
  /**
   * Variant exposure states
   */
  public val variantState: CodeableConcept? = null,
  /**
   * Point estimate
   */
  public val `value`: Float? = null,
  /**
   * What unit is the outcome described in?
   */
  public val unitOfMeasure: CodeableConcept? = null,
  public val precisionEstimate: List<EffectEvidenceSynthesisEffectEstimatePrecisionEstimate> =
      emptyList(),
) : BackboneElement
