//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.procedure

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
