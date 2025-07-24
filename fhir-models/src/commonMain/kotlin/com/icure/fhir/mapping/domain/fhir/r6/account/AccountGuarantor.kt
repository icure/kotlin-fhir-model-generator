//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.account

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The parties ultimately responsible for balancing the Account
 *
 * The parties responsible for balancing the account if other payment options fall short.
 *
 * @param id Unique id for inter-element referencing
 * @param party Responsible entity
 * @param onHold Credit or other hold applied
 * @param period Guarantee account during
 */
@SerialName("AccountGuarantor")
@Serializable
public data class AccountGuarantor(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Responsible entity
   */
  public val party: Reference,
  /**
   * Credit or other hold applied
   */
  public val onHold: Boolean? = null,
  /**
   * Guarantee account during
   */
  public val period: Period? = null,
) : BackboneElement
