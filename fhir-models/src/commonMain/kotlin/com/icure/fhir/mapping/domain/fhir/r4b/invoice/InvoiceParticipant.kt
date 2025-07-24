//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.invoice

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
