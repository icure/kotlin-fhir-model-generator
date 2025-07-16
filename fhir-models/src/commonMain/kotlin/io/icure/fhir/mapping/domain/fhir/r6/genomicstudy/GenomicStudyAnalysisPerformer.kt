//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.genomicstudy

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Performer for the analysis event
 *
 * Performer for the analysis event.
 *
 * @param id Unique id for inter-element referencing
 * @param actor The organization, healthcare professional, or others who participated in performing
 * this analysis
 * @param role Role of the actor for this analysis
 */
@SerialName("GenomicStudyAnalysisPerformer")
@Serializable
public data class GenomicStudyAnalysisPerformer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The organization, healthcare professional, or others who participated in performing this
   * analysis
   */
  public val actor: Reference? = null,
  /**
   * Role of the actor for this analysis
   */
  public val role: CodeableConcept? = null,
) : BackboneElement
