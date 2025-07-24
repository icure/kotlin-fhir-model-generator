//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.account

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Other associated accounts related to this account
 *
 * Other associated accounts related to this account.
 *
 * @param id Unique id for inter-element referencing
 * @param relationship Relationship of the associated Account
 * @param account Reference to an associated Account
 */
@SerialName("AccountRelatedAccount")
@Serializable
public data class AccountRelatedAccount(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Relationship of the associated Account
   */
  public val relationship: CodeableConcept? = null,
  /**
   * Reference to an associated Account
   */
  public val account: Reference,
) : BackboneElement
