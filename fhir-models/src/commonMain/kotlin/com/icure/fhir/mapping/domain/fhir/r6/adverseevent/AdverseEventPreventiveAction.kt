//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.adverseevent

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
