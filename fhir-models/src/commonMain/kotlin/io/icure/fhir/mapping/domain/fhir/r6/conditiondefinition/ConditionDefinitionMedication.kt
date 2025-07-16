//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.conditiondefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Medications particularly relevant for this condition
 *
 * Medications particularly relevant for this condition.
 *
 * @param id Unique id for inter-element referencing
 * @param category Category that is relevant
 * @param code Code for relevant Medication
 */
@SerialName("ConditionDefinitionMedication")
@Serializable
public data class ConditionDefinitionMedication(
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
   * Code for relevant Medication
   */
  public val code: CodeableConcept? = null,
) : BackboneElement
