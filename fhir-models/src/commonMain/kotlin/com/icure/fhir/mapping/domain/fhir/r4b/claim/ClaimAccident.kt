//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.claim

import com.icure.fhir.mapping.domain.fhir.r4b.address.Address
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the event
 *
 * Details of an accident which resulted in injuries which required the products and services listed
 * in the claim.
 *
 * @param id Unique id for inter-element referencing
 * @param date When the incident occurred
 * @param type The nature of the accident
 * @param locationAddress Where the event occurred
 * @param locationReference Where the event occurred
 */
@SerialName("ClaimAccident")
@Serializable
public data class ClaimAccident(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * When the incident occurred
   */
  public val date: String? = null,
  /**
   * The nature of the accident
   */
  public val type: CodeableConcept? = null,
  /**
   * Where the event occurred
   */
  public val locationAddress: Address? = null,
  /**
   * Where the event occurred
   */
  public val locationReference: Reference? = null,
) : BackboneElement
