//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.auditevent

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Whether the event succeeded or failed
 *
 * Indicates whether the event succeeded or failed. A free text descripiton can be given in
 * outcome.text.
 *
 * @param id Unique id for inter-element referencing
 * @param code Whether the event succeeded or failed
 */
@SerialName("AuditEventOutcome")
@Serializable
public data class AuditEventOutcome(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Whether the event succeeded or failed
   */
  public val code: Coding,
  public val detail: List<CodeableConcept> = emptyList(),
) : BackboneElement
