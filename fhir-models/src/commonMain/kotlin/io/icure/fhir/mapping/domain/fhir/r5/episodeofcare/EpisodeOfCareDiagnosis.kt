//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.episodeofcare

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
