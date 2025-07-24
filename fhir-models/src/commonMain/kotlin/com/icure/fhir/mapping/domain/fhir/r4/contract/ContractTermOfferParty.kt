//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.contract

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
