//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.condition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Stage/grade, usually assessed formally
 *
 * A simple summary of the stage such as "Stage 3" or "Early Onset". The determination of the stage
 * is disease-specific, such as cancer, retinopathy of prematurity, kidney diseases, Alzheimer's, or
 * Parkinson disease.
 *
 * @param id Unique id for inter-element referencing
 * @param summary Simple summary (disease specific)
 * @param type Kind of staging
 */
@SerialName("ConditionStage")
@Serializable
public data class ConditionStage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Simple summary (disease specific)
   */
  public val summary: CodeableConcept? = null,
  public val assessment: List<Reference> = emptyList(),
  /**
   * Kind of staging
   */
  public val type: CodeableConcept? = null,
) : BackboneElement
