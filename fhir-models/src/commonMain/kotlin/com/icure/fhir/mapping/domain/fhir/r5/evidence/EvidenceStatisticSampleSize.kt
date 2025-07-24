//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.evidence

import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Number of samples in the statistic
 *
 * Number of samples in the statistic.
 *
 * @param id Unique id for inter-element referencing
 * @param description Textual description of sample size for statistic
 * @param numberOfStudies Number of contributing studies
 * @param numberOfParticipants Cumulative number of participants
 * @param knownDataCount Number of participants with known results for measured variables
 */
@SerialName("EvidenceStatisticSampleSize")
@Serializable
public data class EvidenceStatisticSampleSize(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Textual description of sample size for statistic
   */
  public val description: String? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * Number of contributing studies
   */
  public val numberOfStudies: Int? = null,
  /**
   * Cumulative number of participants
   */
  public val numberOfParticipants: Int? = null,
  /**
   * Number of participants with known results for measured variables
   */
  public val knownDataCount: Int? = null,
) : BackboneElement
