//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.careplan

import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Action to occur as part of plan
 *
 * Identifies a planned action to occur as part of the plan.  For example, a medication to be used,
 * lab tests to perform, self-monitoring, education, etc.
 *
 * @param id Unique id for inter-element referencing
 * @param reference Activity details defined in specific resource
 * @param detail In-line definition of activity
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
  public val outcomeCodeableConcept: List<CodeableConcept> = emptyList(),
  public val outcomeReference: List<Reference> = emptyList(),
  public val progress: List<Annotation> = emptyList(),
  /**
   * Activity details defined in specific resource
   */
  public val reference: Reference? = null,
  /**
   * In-line definition of activity
   */
  public val detail: CarePlanActivityDetail? = null,
) : BackboneElement
