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
 * A component that contributes to the overall certainty
 *
 * A description of a component of the overall certainty.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of subcomponent of certainty rating
 */
@SerialName("RiskEvidenceSynthesisCertaintyCertaintySubcomponent")
@Serializable
public data class RiskEvidenceSynthesisCertaintyCertaintySubcomponent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of subcomponent of certainty rating
   */
  public val type: CodeableConcept? = null,
  public val rating: List<CodeableConcept> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : BackboneElement
