//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.adverseevent

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Preventive actions that contributed to avoiding the adverse event
 *
 * Preventive actions that contributed to avoiding the adverse event.
 *
 * @param id Unique id for inter-element referencing
 * @param itemReference Action that contributed to avoiding the adverse event
 * @param itemCodeableConcept Action that contributed to avoiding the adverse event
 */
@SerialName("AdverseEventPreventiveAction")
@Serializable
public data class AdverseEventPreventiveAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Action that contributed to avoiding the adverse event
   */
  public val itemReference: Reference? = null,
  /**
   * Action that contributed to avoiding the adverse event
   */
  public val itemCodeableConcept: CodeableConcept? = null,
) : BackboneElement
