//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.episodeofcare

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The list of diagnosis relevant to this episode of care
 *
 * The list of diagnosis relevant to this episode of care.
 *
 * @param id Unique id for inter-element referencing
 * @param condition Conditions/problems/diagnoses this episode of care is for
 * @param role Role that this diagnosis has within the episode of care (e.g. admission, billing,
 * discharge …)
 * @param rank Ranking of the diagnosis (for each role type)
 */
@SerialName("EpisodeOfCareDiagnosis")
@Serializable
public data class EpisodeOfCareDiagnosis(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Conditions/problems/diagnoses this episode of care is for
   */
  public val condition: Reference,
  /**
   * Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …)
   */
  public val role: CodeableConcept? = null,
  /**
   * Ranking of the diagnosis (for each role type)
   */
  public val rank: Int? = null,
) : BackboneElement
