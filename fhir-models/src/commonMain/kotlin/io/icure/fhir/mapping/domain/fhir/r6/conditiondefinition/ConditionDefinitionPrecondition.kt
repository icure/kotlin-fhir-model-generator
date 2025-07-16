//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.conditiondefinition

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Observation that suggets this condition
 *
 * An observation that suggests that this condition applies.
 *
 * @param id Unique id for inter-element referencing
 * @param type sensitive | specific
 * @param code Code for relevant Observation
 * @param valueCodeableConcept Value of Observation
 * @param valueQuantity Value of Observation
 */
@SerialName("ConditionDefinitionPrecondition")
@Serializable
public data class ConditionDefinitionPrecondition(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * sensitive | specific
   */
  public val type: String? = null,
  /**
   * Code for relevant Observation
   */
  public val code: CodeableConcept,
  /**
   * Value of Observation
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Value of Observation
   */
  public val valueQuantity: Quantity? = null,
) : BackboneElement
