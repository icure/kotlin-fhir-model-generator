//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.riskevidencesynthesis

import com.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * How certain is the risk
 *
 * A description of the certainty of the risk estimate.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("RiskEvidenceSynthesisCertainty")
@Serializable
public data class RiskEvidenceSynthesisCertainty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val rating: List<CodeableConcept> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val certaintySubcomponent: List<RiskEvidenceSynthesisCertaintyCertaintySubcomponent> =
      emptyList(),
) : BackboneElement
