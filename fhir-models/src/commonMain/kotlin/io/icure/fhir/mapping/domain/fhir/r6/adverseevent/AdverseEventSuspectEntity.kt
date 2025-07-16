//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.adverseevent

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param instanceCodeableConcept Refers to the specific entity that caused the adverse event
 * @param instanceReference Refers to the specific entity that caused the adverse event
 * @param causality Information on the possible cause of the event
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
  public val instanceCodeableConcept: CodeableConcept? = null,
  /**
   * Refers to the specific entity that caused the adverse event
   */
  public val instanceReference: Reference? = null,
  /**
   * Information on the possible cause of the event
   */
  public val causality: AdverseEventSuspectEntityCausality? = null,
) : BackboneElement
