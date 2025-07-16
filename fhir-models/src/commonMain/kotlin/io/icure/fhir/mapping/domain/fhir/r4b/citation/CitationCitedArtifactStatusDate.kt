//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.citation

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An effective date or period for a status of the cited artifact
 *
 * An effective date or period for a status of the cited artifact.
 *
 * @param id Unique id for inter-element referencing
 * @param activity Classification of the status
 * @param actual Either occurred or expected
 * @param period When the status started and/or ended
 */
@SerialName("CitationCitedArtifactStatusDate")
@Serializable
public data class CitationCitedArtifactStatusDate(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Classification of the status
   */
  public val activity: CodeableConcept,
  /**
   * Either occurred or expected
   */
  public val `actual`: Boolean? = null,
  /**
   * When the status started and/or ended
   */
  public val period: Period,
) : BackboneElement
