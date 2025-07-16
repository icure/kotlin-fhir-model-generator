//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.effectevidencesynthesis

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What was the result per exposure?
 *
 * A description of the results for each exposure considered in the effect estimate.
 *
 * @param id Unique id for inter-element referencing
 * @param description Description of results by exposure
 * @param exposureState exposure | exposure-alternative
 * @param variantState Variant exposure states
 * @param riskEvidenceSynthesis Risk evidence synthesis
 */
@SerialName("EffectEvidenceSynthesisResultsByExposure")
@Serializable
public data class EffectEvidenceSynthesisResultsByExposure(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of results by exposure
   */
  public val description: String? = null,
  /**
   * exposure | exposure-alternative
   */
  public val exposureState: String? = null,
  /**
   * Variant exposure states
   */
  public val variantState: CodeableConcept? = null,
  /**
   * Risk evidence synthesis
   */
  public val riskEvidenceSynthesis: Reference,
) : BackboneElement
