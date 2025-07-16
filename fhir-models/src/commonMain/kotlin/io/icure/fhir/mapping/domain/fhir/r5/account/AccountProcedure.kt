//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.account

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The list of procedures relevant to this account
 *
 * When using an account for billing a specific Encounter the set of procedures that are relevant
 * for billing are stored here on the account where they are able to be sequenced appropriately prior
 * to processing to produce claim(s).
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Ranking of the procedure (for each type)
 * @param code The procedure relevant to the account
 * @param dateOfService Date of the procedure (when coded procedure)
 */
@SerialName("AccountProcedure")
@Serializable
public data class AccountProcedure(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Ranking of the procedure (for each type)
   */
  public val sequence: Int? = null,
  /**
   * The procedure relevant to the account
   */
  public val code: CodeableReference,
  /**
   * Date of the procedure (when coded procedure)
   */
  public val dateOfService: String? = null,
  public val type: List<CodeableConcept> = emptyList(),
  public val packageCode: List<CodeableConcept> = emptyList(),
  public val device: List<Reference> = emptyList(),
) : BackboneElement
