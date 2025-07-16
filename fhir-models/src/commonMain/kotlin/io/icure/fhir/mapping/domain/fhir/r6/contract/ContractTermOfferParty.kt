//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.contract

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Offer Recipient
 *
 * Offer Recipient.
 *
 * @param id Unique id for inter-element referencing
 * @param role Participant engagement type
 */
@SerialName("ContractTermOfferParty")
@Serializable
public data class ContractTermOfferParty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val reference: List<Reference> = emptyList(),
  /**
   * Participant engagement type
   */
  public val role: CodeableConcept,
) : BackboneElement
