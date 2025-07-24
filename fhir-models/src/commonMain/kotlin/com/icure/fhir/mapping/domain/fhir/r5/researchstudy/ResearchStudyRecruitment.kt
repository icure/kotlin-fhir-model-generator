//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.researchstudy

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Target or actual group of participants enrolled in study
 *
 * Target or actual group of participants enrolled in study.
 *
 * @param id Unique id for inter-element referencing
 * @param targetNumber Estimated total number of participants to be enrolled
 * @param actualNumber Actual total number of participants enrolled in study
 * @param eligibility Inclusion and exclusion criteria
 * @param actualGroup Group of participants who were enrolled in study
 */
@SerialName("ResearchStudyRecruitment")
@Serializable
public data class ResearchStudyRecruitment(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Estimated total number of participants to be enrolled
   */
  public val targetNumber: Int? = null,
  /**
   * Actual total number of participants enrolled in study
   */
  public val actualNumber: Int? = null,
  /**
   * Inclusion and exclusion criteria
   */
  public val eligibility: Reference? = null,
  /**
   * Group of participants who were enrolled in study
   */
  public val actualGroup: Reference? = null,
) : BackboneElement
