//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.nutritionorder

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.timing.Timing
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Scheduling information for enteral formula products
 *
 * Schedule information for an enteral formula.
 *
 * @param id Unique id for inter-element referencing
 * @param asNeeded Take 'as needed'
 * @param asNeededFor Take 'as needed' for x
 */
@SerialName("NutritionOrderEnteralFormulaAdministrationSchedule")
@Serializable
public data class NutritionOrderEnteralFormulaAdministrationSchedule(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val timing: List<Timing> = emptyList(),
  /**
   * Take 'as needed'
   */
  public val asNeeded: Boolean? = null,
  /**
   * Take 'as needed' for x
   */
  public val asNeededFor: CodeableConcept? = null,
) : BackboneElement
