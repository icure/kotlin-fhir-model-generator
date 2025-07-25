//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.conditiondefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Questionnaire for this condition
 *
 * Questionnaire for this condition.
 *
 * @param id Unique id for inter-element referencing
 * @param purpose preadmit | diff-diagnosis | outcome
 * @param reference Specific Questionnaire
 */
@SerialName("ConditionDefinitionQuestionnaire")
@Serializable
public data class ConditionDefinitionQuestionnaire(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * preadmit | diff-diagnosis | outcome
   */
  public val purpose: String? = null,
  /**
   * Specific Questionnaire
   */
  public val reference: Reference,
) : BackboneElement
