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
 * Ameliorating actions taken after the adverse event occured in order to reduce the extent of harm
 *
 * The ameliorating action taken after the adverse event occured in order to reduce the extent of
 * harm.
 *
 * @param id Unique id for inter-element referencing
 * @param itemReference Ameliorating action taken after the adverse event occured in order to reduce
 * the extent of harm
 * @param itemCodeableConcept Ameliorating action taken after the adverse event occured in order to
 * reduce the extent of harm
 */
@SerialName("AdverseEventMitigatingAction")
@Serializable
public data class AdverseEventMitigatingAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Ameliorating action taken after the adverse event occured in order to reduce the extent of harm
   */
  public val itemReference: Reference? = null,
  /**
   * Ameliorating action taken after the adverse event occured in order to reduce the extent of harm
   */
  public val itemCodeableConcept: CodeableConcept? = null,
) : BackboneElement
