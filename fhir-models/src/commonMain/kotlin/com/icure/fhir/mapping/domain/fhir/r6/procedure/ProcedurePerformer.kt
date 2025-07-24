//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.procedure

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who performed the procedure and what they did
 *
 * Indicates who or what performed the procedure and how they were involved.
 *
 * @param id Unique id for inter-element referencing
 * @param function Type of performance
 * @param actor Who performed the procedure
 * @param onBehalfOf Organization the device or practitioner was acting for
 * @param period When the performer performed the procedure
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
   * Who performed the procedure
   */
  public val actor: Reference,
  /**
   * Organization the device or practitioner was acting for
   */
  public val onBehalfOf: Reference? = null,
  /**
   * When the performer performed the procedure
   */
  public val period: Period? = null,
) : BackboneElement
