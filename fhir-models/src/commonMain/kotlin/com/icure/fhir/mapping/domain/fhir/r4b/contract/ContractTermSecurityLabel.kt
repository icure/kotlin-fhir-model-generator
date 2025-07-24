//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.contract

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Protection for the Term
 *
 * Security labels that protect the handling of information about the term and its elements, which
 * may be specifically identified..
 *
 * @param id Unique id for inter-element referencing
 * @param classification Confidentiality Protection
 */
@SerialName("ContractTermSecurityLabel")
@Serializable
public data class ContractTermSecurityLabel(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val number: List<Int> = emptyList(),
  /**
   * Confidentiality Protection
   */
  public val classification: Coding,
  public val category: List<Coding> = emptyList(),
  public val control: List<Coding> = emptyList(),
) : BackboneElement
