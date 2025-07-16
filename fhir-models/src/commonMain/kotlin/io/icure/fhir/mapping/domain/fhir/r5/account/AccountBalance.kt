//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.account

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.money.Money
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Calculated account balance(s)
 *
 * The calculated account balances - these are calculated and processed by the finance system.The
 * balances with a `term` that is not current are usually generated/updated by an invoicing or similar
 * process.
 *
 * @param id Unique id for inter-element referencing
 * @param aggregate Who is expected to pay this part of the balance
 * @param term current | 30 | 60 | 90 | 120
 * @param estimate Estimated balance
 * @param amount Calculated amount
 */
@SerialName("AccountBalance")
@Serializable
public data class AccountBalance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Who is expected to pay this part of the balance
   */
  public val aggregate: CodeableConcept? = null,
  /**
   * current | 30 | 60 | 90 | 120
   */
  public val term: CodeableConcept? = null,
  /**
   * Estimated balance
   */
  public val estimate: Boolean? = null,
  /**
   * Calculated amount
   */
  public val amount: Money,
) : BackboneElement
