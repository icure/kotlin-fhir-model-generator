//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.researchstudy

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A goal for the study
 *
 * A goal that the study is aiming to achieve in terms of a scientific question to be answered by
 * the analysis of data collected during the study.
 *
 * @param id Unique id for inter-element referencing
 * @param name Label for the objective
 * @param type primary | secondary | exploratory
 */
@SerialName("ResearchStudyObjective")
@Serializable
public data class ResearchStudyObjective(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Label for the objective
   */
  public val name: String? = null,
  /**
   * primary | secondary | exploratory
   */
  public val type: CodeableConcept? = null,
) : BackboneElement
