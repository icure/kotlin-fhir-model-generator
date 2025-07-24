//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.claimresponse

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.money.Money
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Adjudication totals
 *
 * Categorized monetary totals for the adjudication.
 *
 * @param id Unique id for inter-element referencing
 * @param category Type of adjudication information
 * @param amount Financial total for the category
 */
@SerialName("ClaimResponseTotal")
@Serializable
public data class ClaimResponseTotal(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of adjudication information
   */
  public val category: CodeableConcept,
  /**
   * Financial total for the category
   */
  public val amount: Money,
) : BackboneElement
