//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.contract

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4b.signature.Signature
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contract Signatory
 *
 * Parties with legal standing in the Contract, including the principal parties, the grantor(s) and
 * grantee(s), which are any person or organization bound by the contract, and any ancillary parties,
 * which facilitate the execution of the contract such as a notary or witness.
 *
 * @param id Unique id for inter-element referencing
 * @param type Contract Signatory Role
 * @param party Contract Signatory Party
 */
@SerialName("ContractSigner")
@Serializable
public data class ContractSigner(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Contract Signatory Role
   */
  public val type: Coding,
  /**
   * Contract Signatory Party
   */
  public val party: Reference,
  public val signature: List<Signature> = emptyList(),
) : BackboneElement
