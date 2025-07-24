//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.citation

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An effective date or period for a status of the cited artifact
 *
 * An effective date or period, historical or future, actual or expected, for a status of the cited
 * artifact.
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
