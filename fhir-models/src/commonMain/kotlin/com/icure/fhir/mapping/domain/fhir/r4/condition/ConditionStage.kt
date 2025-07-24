//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.condition

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Stage/grade, usually assessed formally
 *
 * Clinical stage or grade of a condition. May include formal severity assessments.
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
