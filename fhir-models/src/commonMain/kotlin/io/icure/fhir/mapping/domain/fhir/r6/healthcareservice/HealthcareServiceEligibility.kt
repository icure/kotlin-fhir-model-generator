//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.healthcareservice

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.range.Range
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specific eligibility requirements required to use the service
 *
 * Does this service have specific eligibility requirements that need to be met in order to use the
 * service?
 *
 * @param id Unique id for inter-element referencing
 * @param code Coded value for the eligibility
 * @param valueCodeableConcept Value associated with the eligibility code
 * @param valueBoolean Value associated with the eligibility code
 * @param valueQuantity Value associated with the eligibility code
 * @param valueRange Value associated with the eligibility code
 * @param valueReference Value associated with the eligibility code
 * @param comment Describes the eligibility conditions for the service
 * @param period The period this eligibility rule applies
 */
@SerialName("HealthcareServiceEligibility")
@Serializable
public data class HealthcareServiceEligibility(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Coded value for the eligibility
   */
  public val code: CodeableConcept? = null,
  /**
   * Value associated with the eligibility code
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Value associated with the eligibility code
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Value associated with the eligibility code
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Value associated with the eligibility code
   */
  public val valueRange: Range? = null,
  /**
   * Value associated with the eligibility code
   */
  public val valueReference: Reference? = null,
  /**
   * Describes the eligibility conditions for the service
   */
  public val comment: String? = null,
  /**
   * The period this eligibility rule applies
   */
  public val period: String? = null,
) : BackboneElement
