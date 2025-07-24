//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.careplan

import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Action to occur or has occurred as part of plan
 *
 * Identifies an action that has occurred or is a planned action to occur as part of the plan. For
 * example, a medication to be used, lab tests to perform, self-monitoring that has occurred, education
 * etc.
 *
 * @param id Unique id for inter-element referencing
 * @param plannedActivityReference Activity that is intended to be part of the care plan
 */
@SerialName("CarePlanActivity")
@Serializable
public data class CarePlanActivity(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val performedActivity: List<CodeableReference> = emptyList(),
  public val progress: List<Annotation> = emptyList(),
  /**
   * Activity that is intended to be part of the care plan
   */
  public val plannedActivityReference: Reference? = null,
) : BackboneElement
