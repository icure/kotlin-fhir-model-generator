//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.procedure

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Manipulated, implanted, or removed device
 *
 * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement,
 * fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
 *
 * @param id Unique id for inter-element referencing
 * @param action Kind of change to device
 * @param manipulated Device that was changed
 */
@SerialName("ProcedureFocalDevice")
@Serializable
public data class ProcedureFocalDevice(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Kind of change to device
   */
  public val action: CodeableConcept? = null,
  /**
   * Device that was changed
   */
  public val manipulated: Reference,
) : BackboneElement
