//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.conditiondefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
