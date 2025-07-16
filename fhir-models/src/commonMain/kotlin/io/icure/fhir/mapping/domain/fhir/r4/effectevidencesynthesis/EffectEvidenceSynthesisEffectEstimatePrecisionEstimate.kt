//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.effectevidencesynthesis

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * How precise the estimate is
 *
 * A description of the precision of the estimate for the effect.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of precision estimate
 * @param level Level of confidence interval
 * @param from_fhir Lower bound
 * @param to Upper bound
 */
@SerialName("EffectEvidenceSynthesisEffectEstimatePrecisionEstimate")
@Serializable
public data class EffectEvidenceSynthesisEffectEstimatePrecisionEstimate(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of precision estimate
   */
  public val type: CodeableConcept? = null,
  /**
   * Level of confidence interval
   */
  public val level: Float? = null,
  /**
   * Lower bound
   */
  @JsonNames("from")
  public val from_fhir: Float? = null,
  /**
   * Upper bound
   */
  public val to: Float? = null,
) : BackboneElement
