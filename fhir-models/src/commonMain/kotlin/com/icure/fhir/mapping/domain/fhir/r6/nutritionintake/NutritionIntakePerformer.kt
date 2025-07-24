//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.nutritionintake

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who was performed in the intake
 *
 * Who performed the intake and how they were involved.
 *
 * @param id Unique id for inter-element referencing
 * @param function Type of performer
 * @param actor Who performed the intake
 */
@SerialName("NutritionIntakePerformer")
@Serializable
public data class NutritionIntakePerformer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of performer
   */
  public val function: CodeableConcept? = null,
  /**
   * Who performed the intake
   */
  public val actor: Reference,
) : BackboneElement
