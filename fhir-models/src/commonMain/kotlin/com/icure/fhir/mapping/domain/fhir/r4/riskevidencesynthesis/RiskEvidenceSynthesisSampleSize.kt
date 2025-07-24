//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.riskevidencesynthesis

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What sample size was involved?
 *
 * A description of the size of the sample involved in the synthesis.
 *
 * @param id Unique id for inter-element referencing
 * @param description Description of sample size
 * @param numberOfStudies How many studies?
 * @param numberOfParticipants How many participants?
 */
@SerialName("RiskEvidenceSynthesisSampleSize")
@Serializable
public data class RiskEvidenceSynthesisSampleSize(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of sample size
   */
  public val description: String? = null,
  /**
   * How many studies?
   */
  public val numberOfStudies: Int? = null,
  /**
   * How many participants?
   */
  public val numberOfParticipants: Int? = null,
) : BackboneElement
