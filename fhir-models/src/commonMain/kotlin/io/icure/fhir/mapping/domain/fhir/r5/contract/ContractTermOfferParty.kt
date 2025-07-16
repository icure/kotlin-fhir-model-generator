//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.contract

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
