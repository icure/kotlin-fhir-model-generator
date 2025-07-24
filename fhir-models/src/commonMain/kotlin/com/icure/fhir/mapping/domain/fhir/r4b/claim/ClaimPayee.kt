//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.claim

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Recipient of benefits payable
 *
 * The party to be reimbursed for cost of the products and services according to the terms of the
 * policy.
 *
 * @param id Unique id for inter-element referencing
 * @param type Category of recipient
 * @param party Recipient reference
 */
@SerialName("ClaimPayee")
@Serializable
public data class ClaimPayee(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Category of recipient
   */
  public val type: CodeableConcept,
  /**
   * Recipient reference
   */
  public val party: Reference? = null,
) : BackboneElement
