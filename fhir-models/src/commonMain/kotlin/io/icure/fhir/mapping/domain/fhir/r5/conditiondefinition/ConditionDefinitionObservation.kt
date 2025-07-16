//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.conditiondefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Observations particularly relevant to this condition
 *
 * Observations particularly relevant to this condition.
 *
 * @param id Unique id for inter-element referencing
 * @param category Category that is relevant
 * @param code Code for relevant Observation
 */
@SerialName("ConditionDefinitionObservation")
@Serializable
public data class ConditionDefinitionObservation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Category that is relevant
   */
  public val category: CodeableConcept? = null,
  /**
   * Code for relevant Observation
   */
  public val code: CodeableConcept? = null,
) : BackboneElement
