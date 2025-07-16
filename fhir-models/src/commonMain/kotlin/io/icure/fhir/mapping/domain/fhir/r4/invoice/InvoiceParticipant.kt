//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.invoice

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Participant in creation of this Invoice
 *
 * Indicates who or what performed or participated in the charged service.
 *
 * @param id Unique id for inter-element referencing
 * @param role Type of involvement in creation of this Invoice
 * @param actor Individual who was involved
 */
@SerialName("InvoiceParticipant")
@Serializable
public data class InvoiceParticipant(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of involvement in creation of this Invoice
   */
  public val role: CodeableConcept? = null,
  /**
   * Individual who was involved
   */
  public val actor: Reference,
) : BackboneElement
