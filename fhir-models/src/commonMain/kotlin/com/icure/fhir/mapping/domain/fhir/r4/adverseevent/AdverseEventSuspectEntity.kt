//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.adverseevent

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The suspected agent causing the adverse event
 *
 * Describes the entity that is suspected to have caused the adverse event.
 *
 * @param id Unique id for inter-element referencing
 * @param instance Refers to the specific entity that caused the adverse event
 */
@SerialName("AdverseEventSuspectEntity")
@Serializable
public data class AdverseEventSuspectEntity(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Refers to the specific entity that caused the adverse event
   */
  public val instance: Reference,
  public val causality: List<AdverseEventSuspectEntityCausality> = emptyList(),
) : BackboneElement
