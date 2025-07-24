//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.contract

import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contract Friendly Language
 *
 * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly
 * language" means the representation of the Contract and Contract Provisions in a manner that is
 * readily accessible and understandable by a layperson in accordance with best practices for
 * communication styles that ensure that those agreeing to or signing the Contract understand the
 * roles, actions, obligations, responsibilities, and implication of the agreement.
 *
 * @param id Unique id for inter-element referencing
 * @param contentAttachment Easily comprehended representation of this Contract
 * @param contentReference Easily comprehended representation of this Contract
 */
@SerialName("ContractFriendly")
@Serializable
public data class ContractFriendly(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Easily comprehended representation of this Contract
   */
  public val contentAttachment: Attachment? = null,
  /**
   * Easily comprehended representation of this Contract
   */
  public val contentReference: Reference? = null,
) : BackboneElement
