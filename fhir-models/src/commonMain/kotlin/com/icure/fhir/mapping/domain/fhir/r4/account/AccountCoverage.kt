//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.account

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The party(s) that are responsible for covering the payment of this account, and what order should
 * they be applied to the account
 *
 * The party(s) that are responsible for covering the payment of this account, and what order should
 * they be applied to the account.
 *
 * @param id Unique id for inter-element referencing
 * @param coverage The party(s), such as insurances, that may contribute to the payment of this
 * account
 * @param priority The priority of the coverage in the context of this account
 */
@SerialName("AccountCoverage")
@Serializable
public data class AccountCoverage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The party(s), such as insurances, that may contribute to the payment of this account
   */
  public val coverage: Reference,
  /**
   * The priority of the coverage in the context of this account
   */
  public val priority: Int? = null,
) : BackboneElement
