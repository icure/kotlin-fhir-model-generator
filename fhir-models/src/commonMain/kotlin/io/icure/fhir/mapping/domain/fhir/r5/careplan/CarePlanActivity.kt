//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.careplan

import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
