//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.claim

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Patient insurance information
 *
 * Financial instruments for reimbursement for the health care products and services specified on
 * the claim.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Insurance instance identifier
 * @param focal Coverage to be used for adjudication
 * @param identifier Pre-assigned Claim number
 * @param coverage Insurance information
 * @param businessArrangement Additional provider contract number
 * @param claimResponse Adjudication results
 */
@SerialName("ClaimInsurance")
@Serializable
public data class ClaimInsurance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Insurance instance identifier
   */
  public val sequence: Int? = null,
  /**
   * Coverage to be used for adjudication
   */
  public val focal: Boolean? = null,
  /**
   * Pre-assigned Claim number
   */
  public val identifier: Identifier? = null,
  /**
   * Insurance information
   */
  public val coverage: Reference,
  /**
   * Additional provider contract number
   */
  public val businessArrangement: String? = null,
  public val preAuthRef: List<String> = emptyList(),
  /**
   * Adjudication results
   */
  public val claimResponse: Reference? = null,
) : BackboneElement
