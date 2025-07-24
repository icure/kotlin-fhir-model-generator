//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.procedure

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
