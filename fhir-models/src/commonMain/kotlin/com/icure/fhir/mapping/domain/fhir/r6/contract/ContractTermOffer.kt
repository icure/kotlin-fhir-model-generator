//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.contract

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Context of the Contract term
 *
 * The matter of concern in the context of this provision of the agrement.
 *
 * @param id Unique id for inter-element referencing
 * @param topic Negotiable offer asset
 * @param type Contract Offer Type or Form
 * @param decision Accepting party choice
 * @param text Human readable offer text
 */
@SerialName("ContractTermOffer")
@Serializable
public data class ContractTermOffer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  public val party: List<ContractTermOfferParty> = emptyList(),
  /**
   * Negotiable offer asset
   */
  public val topic: Reference? = null,
  /**
   * Contract Offer Type or Form
   */
  public val type: CodeableConcept? = null,
  /**
   * Accepting party choice
   */
  public val decision: CodeableConcept? = null,
  public val decisionMode: List<CodeableConcept> = emptyList(),
  public val answer: List<ContractTermOfferAnswer> = emptyList(),
  /**
   * Human readable offer text
   */
  public val text: String? = null,
  public val linkId: List<String> = emptyList(),
  public val securityLabelNumber: List<Int> = emptyList(),
) : BackboneElement
