//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.conditiondefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Plan that is appropriate
 *
 * Plan that is appropriate.
 *
 * @param id Unique id for inter-element referencing
 * @param role Use for the plan
 * @param reference The actual plan
 */
@SerialName("ConditionDefinitionPlan")
@Serializable
public data class ConditionDefinitionPlan(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Use for the plan
   */
  public val role: CodeableConcept? = null,
  /**
   * The actual plan
   */
  public val reference: Reference,
) : BackboneElement
