//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.researchstudy

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
 * Status of study with time for that status
 *
 * Status of study with time for that status.
 *
 * @param id Unique id for inter-element referencing
 * @param state Label for status or state (e.g. recruitment status)
 * @param actual Actual if true else anticipated
 * @param period Date range
 */
@SerialName("ResearchStudyProgressStatus")
@Serializable
public data class ResearchStudyProgressStatus(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Label for status or state (e.g. recruitment status)
   */
  public val state: CodeableConcept,
  /**
   * Actual if true else anticipated
   */
  public val `actual`: Boolean? = null,
  /**
   * Date range
   */
  public val period: Period? = null,
) : BackboneElement
