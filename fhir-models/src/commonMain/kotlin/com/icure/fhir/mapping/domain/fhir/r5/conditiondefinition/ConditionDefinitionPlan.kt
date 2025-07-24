//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.conditiondefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
