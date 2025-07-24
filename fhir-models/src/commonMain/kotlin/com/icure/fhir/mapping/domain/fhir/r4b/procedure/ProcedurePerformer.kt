//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.procedure

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The people who performed the procedure
 *
 * Limited to "real" people rather than equipment.
 *
 * @param id Unique id for inter-element referencing
 * @param function Type of performance
 * @param actor The reference to the practitioner
 * @param onBehalfOf Organization the device or practitioner was acting for
 */
@SerialName("ProcedurePerformer")
@Serializable
public data class ProcedurePerformer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of performance
   */
  public val function: CodeableConcept? = null,
  /**
   * The reference to the practitioner
   */
  public val actor: Reference,
  /**
   * Organization the device or practitioner was acting for
   */
  public val onBehalfOf: Reference? = null,
) : BackboneElement
