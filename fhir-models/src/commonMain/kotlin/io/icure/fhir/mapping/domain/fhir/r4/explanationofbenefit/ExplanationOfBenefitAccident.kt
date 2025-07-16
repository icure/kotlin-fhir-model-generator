//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.explanationofbenefit

import io.icure.fhir.mapping.domain.fhir.r4.address.Address
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of the event
 *
 * Details of a accident which resulted in injuries which required the products and services listed
 * in the claim.
 *
 * @param id Unique id for inter-element referencing
 * @param date When the incident occurred
 * @param type The nature of the accident
 * @param locationAddress Where the event occurred
 * @param locationReference Where the event occurred
 */
@SerialName("ExplanationOfBenefitAccident")
@Serializable
public data class ExplanationOfBenefitAccident(
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
