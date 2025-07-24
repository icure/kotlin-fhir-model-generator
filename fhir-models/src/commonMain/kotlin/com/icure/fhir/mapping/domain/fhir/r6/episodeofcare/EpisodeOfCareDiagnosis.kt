//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.episodeofcare

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The list of medical conditions that were addressed during the episode of care
 *
 * The list of medical conditions that were addressed during the episode of care.
 *
 * @param id Unique id for inter-element referencing
 * @param use Role that this diagnosis has within the episode of care (e.g. admission, billing,
 * discharge …)
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
  public val condition: List<CodeableReference> = emptyList(),
  /**
   * Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …)
   */
  public val use: CodeableConcept? = null,
) : BackboneElement
