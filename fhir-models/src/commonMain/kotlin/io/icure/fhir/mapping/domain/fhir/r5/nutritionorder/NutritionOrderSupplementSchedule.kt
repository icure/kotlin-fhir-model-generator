//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.nutritionorder

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.timing.Timing
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Scheduling information for supplements
 *
 * Schedule information for a supplement.
 *
 * @param id Unique id for inter-element referencing
 * @param asNeeded Take 'as needed'
 * @param asNeededFor Take 'as needed' for x
 */
@SerialName("NutritionOrderSupplementSchedule")
@Serializable
public data class NutritionOrderSupplementSchedule(
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
